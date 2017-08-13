package com.hicetech.ucenter.vo;

public class BabyChangeFileRequestVo {

	 private String nickname;//宝宝昵称
	 private String portraiturl;//宝宝头像
	 private Long birthday;//宝宝生日
	 private Byte gender;//宝宝性别0-女,1-男
	 private String lunar;//生日对应农历日期
	 private String constellation;//对应星座
	 private Double weight;//体重
	 private Double height;//身高
	 private  Long birth;//出生时刻
	 private Short bloodType;//0-A，1-B，2-AB，3-O,4Rh
	
	 
	public BabyChangeFileRequestVo() {
		super();
	}
	public BabyChangeFileRequestVo(String nickname, String portraiturl, Long birthday, Byte gender, String lunar,
			String constellation, Double weight, Double height, Long birth,Short bloodType) {
		super();
		this.nickname = nickname;
		this.portraiturl = portraiturl;
		this.birthday = birthday;
		this.gender = gender;
		this.lunar = lunar;
		this.constellation = constellation;
		this.weight = weight;
		this.height = height;
		this.birth = birth;
		this.bloodType=bloodType;
	}
	public Short getBloodType() {
		return bloodType;
	}
	public void setBloodType(Short bloodType) {
		this.bloodType = bloodType;
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
	public Long getBirthday() {
		return birthday;
	}
	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}
	public Byte getGender() {
		return gender;
	}
	public void setGender(Byte gender) {
		this.gender = gender;
	}
	public String getLunar() {
		return lunar;
	}
	public void setLunar(String lunar) {
		this.lunar = lunar;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public Long getBirth() {
		return birth;
	}
	public void setBirth(Long birth) {
		this.birth = birth;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	

	
}
