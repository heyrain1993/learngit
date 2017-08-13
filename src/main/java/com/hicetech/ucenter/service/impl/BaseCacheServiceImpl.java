package com.hicetech.ucenter.service.impl;

import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import com.hicetech.ucenter.Constants;
import com.hicetech.ucenter.model.JPushPo;
import com.hicetech.ucenter.model.UserPo;
import com.hicetech.ucenter.model.business.UserCacheBo;
import com.hicetech.ucenter.service.BaseCacheService;
import com.hicetech.ucenter.util.JsonUtil;


@Repository
public class BaseCacheServiceImpl implements BaseCacheService {
	private static final Logger logger = Logger.getLogger(BaseCacheServiceImpl.class);
	
	@Resource
	private RedisTemplate<String, String> redisTemplate;

	public RedisTemplate<String, String> getRedisTemplate() {
		
		return redisTemplate;
	}

	public boolean addKV(String key, String value, int expire) {
		logger.info("### AbstractBaseCacheDaoImpl->addKV begin###");
		boolean result = false;
		if ((key == null || key.equals("")) && (value == null || value.equals(""))) {// 参数错误
			logger.error("参数错误");
			return result;
		}
		getRedisTemplate().delete(key);// 删除历史数据
		getRedisTemplate().opsForValue().set(key, value);
		if (expire > 0) {// 设置过期时间
			getRedisTemplate().expire(key, expire, TimeUnit.SECONDS);
		}
		result = true;
		logger.info("### BaseCacheServiceImpl->addKV end###");
		return result;
	}

	public boolean updateKV(String key, String value, int expire) {
		logger.info("### BaseCacheServiceImpl->updateKV begin###");
		boolean result = false;
		if ((key == null || key.equals("")) && (value == null || value.equals(""))) {// 参数错误
			logger.error("参数错误");
			return result;
		}

		getRedisTemplate().opsForValue().set(key, value);
		if (expire > 0) {// 设置过期时间
			getRedisTemplate().expire(key, expire, TimeUnit.SECONDS);
		}
		result = true;
		logger.info("### BaseCacheServiceImpl->updateKV end###");
		return result;
	}

	public boolean updateKV(String key, int expire) {
		logger.info("### BaseCacheServiceImpl->updateKV(expire only) begin###");
		boolean result = false;
		if ((key == null || key.equals(""))) {// 参数错误
			logger.error("参数错误");
			return result;
		}
		if (expire > 0) {// 设置过期时间
			getRedisTemplate().expire(key, expire, TimeUnit.SECONDS);
		}
		result = true;
		logger.info("### BaseCacheServiceImpl->updateKV(expire only) end###");
		return result;
	}

	public String getKV(String key) {
		logger.info("### BaseCacheServiceImpl->getKV begin###");
		String value = "";
		if (key == null || key.equals("")) {// 参数错误
			logger.error("参数错误");
			return value;
		}
		value = getRedisTemplate().opsForValue().get(key);
		logger.info("### BaseCacheServiceImpl->getKV end###");
		return value;
	}

	public boolean delKV(String key) {
		logger.info("### BaseCacheServiceImpl->delKV begin###");
		boolean result = false;
		if (key == null || key.equals("")) {// 参数错误
			logger.error("参数错误");
			return result;
		}
		getRedisTemplate().delete(key);
		result = true;
		logger.info("### BaseCacheServiceImpl->delKV end###");
		return result;
	}

	@Override
	public UserCacheBo initUser(String token, UserPo user, JPushPo jPush, Integer credits, Integer experience){
		logger.debug("BaseCacheServiceImpl->initUser start");
		UserCacheBo userCache = null;
		// 判断是否已存在
		String value = getKV((Constants.CACHE_UCENTER_USER_INFO + user.getId().toString()));
		if (value != null && value.length() > 0) {// 已存在
				userCache = JsonUtil.read(value, UserCacheBo.class);
				userCache.setData(token, user, jPush, credits, experience);
				updateKV((Constants.CACHE_UCENTER_USER_INFO + user.getId().toString()), 
						JsonUtil.write(userCache), 0);// 更新用户信息
		} else {
			// 创建登录用户信息key value对象
			userCache = new UserCacheBo(token, user, jPush, credits, experience);
			if (!addKV((Constants.CACHE_UCENTER_USER_INFO + user.getId().toString()), JsonUtil.write(userCache), 0)) {// 创建用户信息
				return null;
			}
		}
		logger.debug("BaseCacheServiceImpl -> initUser end");
		return userCache;
	}
	
}
