package com.hicetech.ucenter.vo;

public class UserBaseVo {

	private String nickname;// 用户昵称
	private String portraiturl;// 用户头像
	private String signature;// 签名
	private Integer admin;//是否为育儿管理员
	private Long userBabyId;

	public UserBaseVo() {
		super();
		this.nickname = "";
		this.portraiturl = "";
		this.signature = "";
		this.admin=0;
		this.userBabyId=0L;
	}

	public UserBaseVo(String nickname, String portraiturl, String signature,Integer admin,Long userBabyId) {
		super();
		this.nickname = nickname;
		this.portraiturl = portraiturl;
		this.signature = signature;
		this.admin=admin;
		this.userBabyId=userBabyId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPortraiturl() {
		return portraiturl;
	}

	public void setPortraiturl(String portraiturl) {
		this.portraiturl = portraiturl;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
	public Integer getAdmin() {
		return admin;
	}

	public void setAdmin(Integer admin) {
		this.admin = admin;
	}

	public Long getUserBabyId() {
		return userBabyId;
	}

	public void setUserBabyId(Long userBabyId) {
		this.userBabyId = userBabyId;
	}
	

}
