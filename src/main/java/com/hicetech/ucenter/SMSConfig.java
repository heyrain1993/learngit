package com.hicetech.ucenter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cloopen.rest.sdk.CCPRestSmsSDK;


@Configuration
public class SMSConfig {
	
	private Logger logger = Logger.getLogger(SMSConfig.class);
	
	@Value("${sms.server_ip}")
	private String server_ip;
	
	@Value("${sms.server_port}")
	private String server_port;
	
	@Value("${sms.account_sid}")
	private String account_sid;
	
	@Value("${sms.account_token}")
	private String account_token;
	
	@Value("${sms.appid}")
	private String appid;
	
	@Bean
	public CCPRestSmsSDK getCCPRestSDK(){
		CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
		restAPI.init(server_ip, server_port);
		restAPI.setAccount(account_sid, account_token);
		restAPI.setAppId(appid);
		logger.info("CCPRestSDK Bean init success");
		return restAPI;
	} 
}
