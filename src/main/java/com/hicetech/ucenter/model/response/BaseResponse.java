package com.hicetech.ucenter.model.response;

public class BaseResponse {

	protected Integer responseCode;
	
	protected String responseMsg;

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public BaseResponse() {
		this.responseCode = 0;
		this.responseMsg = "success";
	}
	
	
	
}
