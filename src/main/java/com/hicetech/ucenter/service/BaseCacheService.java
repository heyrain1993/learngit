package com.hicetech.ucenter.service;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.hicetech.ucenter.model.JPushPo;
import com.hicetech.ucenter.model.UserPo;
import com.hicetech.ucenter.model.business.UserCacheBo;

public interface BaseCacheService {
	/**
	 * 写入一个key->value数据
	 * @param key
	 * @param value
	 * @param expire 过期时间，如果为 0 表示永不过期，单位S
	 * @return 成功返回true 否则返回false
	 * */
	public boolean addKV(String key,String value, int expire);
	
	/**
	 * 更新一个key->value数据，或只更新过期时间
	 * @param key
	 * @param value
	 * @param expire 过期时间，如果为 0 表示永不过期，单位S
	 * @return 成功返回true 否则返回false
	 * */
	public boolean updateKV(String key,String value, int expire);
	public boolean updateKV(String key, int expire);
	/**
	 * 获取一个指定key的value数据
	 * @param key
	 * @return 成功返回value数据，否则返回一个空的字符串
	 * */
	public String getKV(String key);
	
	/**
	 * 删除一个指定key的数据
	 * @param key
	 * @return 成功返回true，否则返回一个false
	 * */
	public boolean delKV(String key);
	
	/**
	 * 将用户信息插入缓存
	 * @param token
	 * @param user
	 * @param jPush
	 * @param credits
	 * @param experience
	 * @return
	 * @throws JsonProcessingException 
	 * @throws IOException 
	 */
	public UserCacheBo initUser(String token,UserPo user,JPushPo jPush,Integer credits,Integer experience);
	
}
