package com.hicetech.ucenter;

public class Constants {
	
	//状态码
	public static final Integer RESPONSE_CODE_BAD_REQUEST = 400;
	public static final String REQUEST_PARAMETER_ERROR = "parameter error";
	
	public static final Integer RESPONSE_INTERNAL_SERVER_ERROR = 500;
	public static final String RESPONSE_INTERNAL_SERVER_ERROR_MSG = "internal server error";
	
	//redis缓存key前缀定义
	public static final String CACHE_UCENTER_SMS_CODE = "3";//缓存验证码前缀
	public static final String CACHE_UCENTER_USER_INFO = "4";//缓存用户信息前缀
	
	public static final Integer CACHE_VERIFICATIO_CODE_EXPIRE = 30 * 60;// 短信验证码过期时间(s)，2分钟
	
	
	public static final String ACCESS_TOKEN_URL = "http://AUTH-SERVICE/auth/v2/token/";
	public static final String CHECK_TOKEN_URL = "http://AUTH-SERVICE/auth/v2/verification/token/";
	
	
	//验证码
	public static final String REQUEST_ALREADY_REGISTER_SMS = "mobileNum already exists";
	
	public static final String REQUEST_NOT_REGISTER_SMS = "first registration";
	
	public static final String SMS_TEMPLATE_ID = "171797";
	
	//极光账号别名
	public static final String JPUSH_ALIAS_PREFIX = "hicetech_babytime_";
	
	//用户默认签名
	public static final String USER_DEFAULT_SIGNATRUE = "这家伙很懒，什么都没写";
}
