package com.hicetech.ucenter.service.impl;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hicetech.ucenter.Constants;
import com.hicetech.ucenter.dao.JPushPoMapper;
import com.hicetech.ucenter.dao.PortraitPoMapper;
import com.hicetech.ucenter.dao.UserPoMapper;
import com.hicetech.ucenter.model.JPushPo;
import com.hicetech.ucenter.model.PortraitPo;
import com.hicetech.ucenter.model.UserPo;
import com.hicetech.ucenter.model.UserPoExample;
import com.hicetech.ucenter.model.business.UserCacheBo;
import com.hicetech.ucenter.model.request.UserInfoRequest;
import com.hicetech.ucenter.model.request.UserLoginRequest;
import com.hicetech.ucenter.model.request.UserRegisterRequest;
import com.hicetech.ucenter.model.response.BaseResponse;
import com.hicetech.ucenter.model.response.RegisterResponseVo;
import com.hicetech.ucenter.service.BaseCacheService;
import com.hicetech.ucenter.service.UserService;
import com.hicetech.ucenter.util.JsonUtil;
import com.hicetech.ucenter.util.TokenUtil;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private BaseCacheService baseCacheService;
	
	@Autowired
	private PortraitPoMapper portraitMapper;
	
	@Autowired
	private UserPoMapper userMapper;
	
	@Autowired
	private JPushPoMapper jPushMapper;
	
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Override
	public RegisterResponseVo createUser(UserRegisterRequest register) {
		RegisterResponseVo result = new RegisterResponseVo();
		
		if(register == null || register.getMobileNum() == null || register.getPassword() == null 
				|| register.getCode() == null){
			logger.info("register can not be null");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		}
		
		//检查缓存中是否包含改验证码
		String key = Constants.CACHE_UCENTER_SMS_CODE + register.getMobileNum();
		String cache = baseCacheService.getKV(key);
		if(!register.getCode().equals(cache)){
			logger.info("can not get this code from cache...");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		
		};
		//验证通过后，删除缓存中的验证码
		baseCacheService.delKV(key);
		
		//为用户设置默认属性
		PortraitPo portrait = portraitMapper.selectRandom();
		if(portrait == null ){
			logger.info("can get portrait from database...");
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		String userImageUrl = portrait.getPortrait();
		if (userImageUrl == null) {// 随机头像不存在
			userImageUrl = "";
		}
		
		StringBuilder sbNickName = new StringBuilder();
		sbNickName.append("****");
		sbNickName.append(register.getMobileNum().substring((register.getMobileNum().length() - 4),
				register.getMobileNum().length()));// 后四位明文
		byte gender = 2;// 默认保密
		String signature = Constants.USER_DEFAULT_SIGNATRUE;// 默认签名

		//将用户数据插入数据库
		UserPo user = new UserPo();
		user.setCreatetime(System.currentTimeMillis() / 1000);//时间以秒为单位
		user.setAccount(register.getMobileNum());
		user.setPassword(register.getPassword());
		user.setMobilenum(register.getMobileNum());
		user.setNickname(sbNickName.toString());
		user.setPortraiturl(userImageUrl);
		user.setGender(gender);
		user.setSignature(signature);
		if(userMapper.insertSelective(user) != 1){
			logger.info("insert into user to databse failure...");
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		
		//创建极光用户信息
		String jpushPoAlias = Constants.JPUSH_ALIAS_PREFIX + user.getId();
		JPushPo jPush = new JPushPo();
		jPush.setJpalias(jpushPoAlias);
		jPush.setUserId(user.getId());
		jPush.setCreatetime(System.currentTimeMillis() / 1000);
		if(jPushMapper.insertSelective(jPush) != 1){
			logger.info("insert into JPush to databse failure...");
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		
		//创建token信息，并存入缓存
		String token = TokenUtil.buildToken(String.valueOf(user.getId()));
		baseCacheService.addKV(token, String.valueOf(user.getId()), Constants.CACHE_VERIFICATIO_CODE_EXPIRE);
		
		if(token == null){
			logger.info("achieve token from authservice failure...");
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		
		//将用户信息存入缓存数据库
		logger.info("token is" + token);
		if(null == baseCacheService.initUser(token, user, jPush, 0, 0)){
			logger.info("insert into UserCache to cache databse failure...");
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		
		//返回token和RegisterResponseVo信息
		result = new RegisterResponseVo(token,user.getId(),user.getNickname(),user.getPortraiturl(),user.getGender(),
				user.getBirthday(),user.getSignature());
		
		return result;
	}
	
	@Override
	public RegisterResponseVo loginUser(UserLoginRequest login) {
		RegisterResponseVo result = new RegisterResponseVo();
		
		if(login == null || login.getMobileNum() == null || login.getPassword() == null){
			logger.info("username or password can not be null...");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		}
		//检查用户名是否存在
		UserPoExample example = new UserPoExample();
		example.or().andAccountEqualTo(login.getMobileNum());
		List<UserPo> users = userMapper.selectByExample(example);
		if(users == null){
			logger.info("username not exist ...");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		}
		
		UserPo user = users.get(0);
		if(!user.getPassword().equals(login.getPassword())){
			logger.info("password error...");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		}
		
		//获取新token信息,更新缓存数据库中，用户信息中的token信息
		String value = baseCacheService.getKV(Constants.CACHE_UCENTER_USER_INFO + user.getId().toString());
		UserCacheBo userCache = null;
		if (value != null && value.length() > 0) {
			logger.info("value "+value);
			userCache = JsonUtil.read(value, UserCacheBo.class);
		}
		if(userCache == null){
			logger.info("userCache not exist ...");
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		
		String newToken = TokenUtil.buildToken(String.valueOf(user.getId()));
		baseCacheService.addKV(newToken, String.valueOf(user.getId()), Constants.CACHE_VERIFICATIO_CODE_EXPIRE);
		userCache.setToken(newToken);
		baseCacheService.updateKV((Constants.CACHE_UCENTER_USER_INFO + user.getId().toString()),
				JsonUtil.write(userCache), 0);
		//构造数据返回
		result = new RegisterResponseVo(userCache.getToken(), user.getId(), user.getNickname(), user.getPortraiturl(), user.getGender(),
				user.getBirthday(), user.getSignature());
		
		return result;
		
	}

	@Override
	public BaseResponse changePassword(UserRegisterRequest register) {
		BaseResponse result = new BaseResponse();
		
		if(register == null || register.getPassword() == null || register.getMobileNum() == null
				|| register.getCode() == null){
			logger.info("mobileNum or password or code can not be null...");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		}
		//检查缓存中是否包含改验证码
		String key = Constants.CACHE_UCENTER_SMS_CODE+register.getMobileNum();
		String cache = baseCacheService.getKV(key);
		if(!register.getCode().equals(cache)){
			logger.info("can not get this code from cache...");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		};
		baseCacheService.delKV(key);
		
		UserPoExample example = new UserPoExample();
		example.or().andMobilenumEqualTo(register.getMobileNum());
		List<UserPo> users = userMapper.selectByExample(example);
		if(users == null || users.size() == 0){
			logger.info("mobileNum not exist...");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		}
		UserPo user = users.get(0);
		user.setPassword(register.getPassword());
		if(userMapper.updateByPrimaryKey(user) != 1){
			logger.info("change password failure...");
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		return result;
	}

	@Override
	public BaseResponse logout(String token) {
		BaseResponse result = new BaseResponse();
		
		if(!baseCacheService.delKV(token))
		{
			logger.info("delete token failure ...");
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		return result;
	}

	@Override
	public RegisterResponseVo chagePersonalInfo(String token, UserInfoRequest request) {
		RegisterResponseVo result = new RegisterResponseVo();
		
		if(token == null || request == null){
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		
		//获取userId
		String userId = baseCacheService.getKV(token);
		if(userId == null){
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		
		UserPo user = new UserPo(request);
		
		UserPoExample exmaple = new UserPoExample();
		exmaple.or().andIdEqualTo(Long.valueOf(userId));
		if(userMapper.updateByExample(user, exmaple) != 1){
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		result.setData(token, user.getId(), user.getNickname(), user.getPortraiturl(), user.getGender(), 
				user.getBirthday(), user.getSignature());
		return result;
	}

}
