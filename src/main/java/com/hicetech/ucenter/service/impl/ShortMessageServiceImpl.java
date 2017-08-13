package com.hicetech.ucenter.service.impl;

import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloopen.rest.sdk.CCPRestSmsSDK;
import com.hicetech.ucenter.Constants;
import com.hicetech.ucenter.dao.UserPoMapper;
import com.hicetech.ucenter.model.UserPo;
import com.hicetech.ucenter.model.UserPoExample;
import com.hicetech.ucenter.model.response.BaseResponse;
import com.hicetech.ucenter.service.BaseCacheService;
import com.hicetech.ucenter.service.ShortMessageService;
import com.hicetech.ucenter.util.MobileUtil;

@Service
public class ShortMessageServiceImpl implements ShortMessageService {

	private Logger logger = Logger.getLogger(ShortMessageServiceImpl.class);
	
	@Autowired
	private UserPoMapper userMapper;
	
	@Autowired
	private BaseCacheService cacheService;
	
	@Autowired
	private CCPRestSmsSDK restAPI;
	@Override
	public BaseResponse sendMSM(Integer type, String mobileNum) {
		BaseResponse result = new BaseResponse();
		
		//检查手机号格式
		logger.info("start check mobile and type...");
		if (mobileNum == null || "".equals(mobileNum) || type == null) {// 参数检查
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		}
		//正则校验
		if(!MobileUtil.isPhone(mobileNum)){
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_PARAMETER_ERROR);
			return result;
		}
		
		//鉴别获取验证码类型和手机号是否存在
		logger.info("check the phone number exist or not");
		UserPoExample example = new UserPoExample();
		example.or().andMobilenumEqualTo(mobileNum);
		List<UserPo> users = userMapper.selectByExample(example);
		
		if(users != null && type == 0){//type为0时，表示获取注册验证码
			logger.info("the phone number already exists");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_ALREADY_REGISTER_SMS);
			return result;
		}
		
		if(users == null && type == 1){//type为1时，表示忘记密码时获取验证码
			logger.info("the phone number is not registered");
			result.setResponseCode(Constants.RESPONSE_CODE_BAD_REQUEST);
			result.setResponseMsg(Constants.REQUEST_NOT_REGISTER_SMS);
			return result;
		}
		
		//向手机发送验证码
		logger.info("send identifying code to this mobilePhone...");
		String code = MobileUtil.generateCode();
		HashMap<String, Object> responseSMS = restAPI.sendTemplateSMS(mobileNum, Constants.SMS_TEMPLATE_ID, new String[]{ code, "2" });
		
		if (!"000000".equals(responseSMS.get("statusCode")))
		{
			logger.error("send short message to " + mobileNum +" failure,return " + 
					responseSMS.get("statusCode"));
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		
		//将验证码存入缓存中
		String key = Constants.CACHE_UCENTER_SMS_CODE + mobileNum; // 在redis中存储的前缀
		if(!cacheService.addKV(key, code, Constants.CACHE_VERIFICATIO_CODE_EXPIRE)){
			logger.info("cache failure...");
			result.setResponseCode(Constants.RESPONSE_INTERNAL_SERVER_ERROR);
			result.setResponseMsg(Constants.RESPONSE_INTERNAL_SERVER_ERROR_MSG);
			return result;
		}
		
		return result;
	}
	
}
