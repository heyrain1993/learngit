package com.hicetech.ucenter.model.request;

public class UserInfoRequest {

	private String nickname;// 用户昵称
	private String portraiturl;// 用户头像
	private Integer height;// 身高
	private Integer weight;// 体重
	private String signature;// 签名
	private Long birthday;// 生日
	private Byte gender;// 性别
	private String country;// 用户国籍代码
	private String countrytext;// 用户国籍名称
	private String province;// 用户所在省份编码
	private String provincetext;// 用户所在省份名称
	private String city;// 用户所在城市编码
	private String citytext;// 用户所在城市名称
	private String district;// 用户所在区县编码
	private String districttext;// 用户所在区县名称

	public UserInfoRequest() {
		super();
	}

	public UserInfoRequest(String nickname, String portraiturl, Integer height, Integer weight, String signature, Long birthday,
			Byte gender, String country, String countrytext, String province, String provincetext, String city,
			String citytext, String district, String districttext) {
		super();
		this.nickname = nickname;
		this.portraiturl = portraiturl;
		this.height = height;
		this.weight = weight;
		this.signature = signature;
		this.birthday = birthday;
		this.gender = gender;
		this.country = country;
		this.countrytext = countrytext;
		this.province = province;
		this.provincetext = provincetext;
		this.city = city;
		this.citytext = citytext;
		this.district = district;
		this.districttext = districttext;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvincetext() {
		return provincetext;
	}

	public void setProvincetext(String provincetext) {
		this.provincetext = provincetext;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCitytext() {
		return citytext;
	}

	public void setCitytext(String citytext) {
		this.citytext = citytext;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistricttext() {
		return districttext;
	}

	public void setDistricttext(String districttext) {
		this.districttext = districttext;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountrytext() {
		return countrytext;
	}

	public void setCountrytext(String countrytext) {
		this.countrytext = countrytext;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

}
