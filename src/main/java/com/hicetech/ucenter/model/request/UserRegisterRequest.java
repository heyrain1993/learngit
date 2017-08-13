package com.hicetech.ucenter.model.request;

public class UserRegisterRequest {
	
	private String mobileNum;// 手机号
	
	private String password; // 密码，32位MD5加密
	
	private String code;// 短信验证码

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public UserRegisterRequest(String mobileNum, String password, String code) {
		super();
		this.mobileNum = mobileNum;
		this.password = password;
		this.code = code;
	}

	public UserRegisterRequest() {
		
	}
	
	
}
