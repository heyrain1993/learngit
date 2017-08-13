package com.hicetech.ucenter.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
* @ClassName: CommonUtil 
* @Description: 工具类
* @author sunjia 
* @date 2017年5月10日 下午6:08:16 
* @version 1.0
 */
public class CommonUtil {
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	
	/**
	* @Title: babyMonth 
	* @Description: 根据宝宝生日时间戳计算宝宝月龄
	* @param @param birthday
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	public static int babyMonth(Long birthday) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 时分秒
		int month = 0;
		Long time = birthday * 1000;
		if (time != 0) {
			Date d = new Date(time);
			String babybirthday = sdf.format(d);
			month = DateUtil.getMonths(babybirthday, sdf.format(System.currentTimeMillis()));
		}
		return month;
	}
	
	
	/**
	* @Title: getStatus 
	* @Description:  根据月龄计算状态
	* @param @return    设定文件 
	* @return Integer    返回类型 
	* @throws
	 */
	public static Integer getStatus(int monthAge){
		Integer status = 0;
		if(monthAge == 0){
			status = 0;
		} else if(monthAge >= 1 && monthAge <= 5){
			status = 1;
		} else if(monthAge >= 6 && monthAge <= 11){
			status = 2;
		} else if(monthAge >= 12 && monthAge <= 23){
			status = 3;
		} else if(monthAge >= 24){
			status = 4;
		} 
		return status;
	}
	
	/**
	* @Title: getBabyAge 
	* @Description: 根据宝宝生日计算宝宝年龄  返回XX岁XX天或者XX月XX天
	* @param @param birthday
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	public static String getBabyAge(Long birthday){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 时分秒
		SimpleDateFormat format=new SimpleDateFormat("dd");       //天
		int currentDay = Integer.valueOf(format.format(System.currentTimeMillis()));
		int birthdayDay = Integer.valueOf(format.format(birthday * 1000));
		int day = currentDay >= birthdayDay ? currentDay - birthdayDay + 1 : birthdayDay - currentDay + 1;
		int month = DateUtil.getMonths(sdf.format(birthday * 1000), sdf.format(System.currentTimeMillis()));
		String result = month >= 12 ? month / 12 + "岁" + Integer.valueOf(month % 12 * 30 + day) + "天"  : month + "月" + day + "天";
		return result;
	}
	
	/**
	* @Title: objToJson 
	* @Description: 对象转json
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	public static String objToJson(Object obj){
		String str = null;
		try {
			str = mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	public static String getDistanceTime(Long startTime, Long endTime){
		String str = null;
		long diff = endTime - startTime;
		long day = diff / (24 * 60 * 60 );  
        long hour = (diff / (60 * 60 ) - day * 24);  
        long min = ((diff / (60)) - day * 24 * 60 - hour * 60);  
        if(day > 0){
        	str  = day + "天" + hour + "小时" + min + "分";  
        }else if(hour > 0){
        	str  =  hour + "小时" + min + "分";  
        }else if(min > 0){
        	str  =  min + "分";  
        }
        return str;
	}
	
	
	public static void main(String[] args) {

	}
	
}
