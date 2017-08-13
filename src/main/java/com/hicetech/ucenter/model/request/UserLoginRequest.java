package com.hicetech.ucenter.model.request;

public class UserLoginRequest {
	
	private String mobileNum;
	
	private String password;

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

	public UserLoginRequest(String mobileNum, String password) {
		super();
		this.mobileNum = mobileNum;
		this.password = password;
	}

	public UserLoginRequest() {
		super();
	}
	
	
}
