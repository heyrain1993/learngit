package com.hicetech.ucenter.util;

public class TokenUtil {
	
	public static String buildToken(String userId){
		String srcStr = "" + System.currentTimeMillis() + ":" + userId;
		String token = AlgorithmUtil.MD5(srcStr);
		return token;

	}
}
