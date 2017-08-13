package com.hicetech.ucenter.model.response;


public class RegisterResponseVo extends BaseResponse{
	private String accessToken = "";// 访问令牌
	
	private Long userId = 0L;// 用户id标识
	
	private String nickName = "";// 用户的昵称
	
	private String portraitUrl = "";// 头像图片URL地址，如果为空字符串则表示用户未上传头像，使用默认头像
	
	private Byte gender = 2;// 用户的性别0-女，1-男，2-保密
	
	private Long birthday = 0L;// 用户生日时间戳(s)
	
	private String signature = "";// 用户的个人签名

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPortraitUrl() {
		return portraitUrl;
	}

	public void setPortraitUrl(String portraitUrl) {
		this.portraitUrl = portraitUrl;
	}

	public Byte getGender() {
		return gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	public Long getBirthday() {
		return birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public void setData(String token, Long id, String nickname, String portraiturl, Byte gender, Long birthday,
			String signature) {
		this.accessToken = token;
		this.userId = id;
		this.nickName = nickname;
		this.portraitUrl = portraiturl;
		this.gender = gender;
		this.birthday = birthday;
		this.signature = signature;
	}

	public RegisterResponseVo(String accessToken, Long userId, String nickName, String portraitUrl, Byte gender,
			Long birthday, String signature) {
		super();
		this.accessToken = accessToken;
		this.userId = userId;
		this.nickName = nickName;
		this.portraitUrl = portraitUrl;
		this.gender = gender;
		this.birthday = birthday;
		this.signature = signature;
	}

	public RegisterResponseVo() {
		super();
	}
	
}
