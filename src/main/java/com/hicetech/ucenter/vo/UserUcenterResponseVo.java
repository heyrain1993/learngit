package com.hicetech.ucenter.vo;

import java.util.List;

public class UserUcenterResponseVo {

	private int collection;// 收藏数
	private int publish;// 发布数
	private int concern;// 关注
	private int fans;// 粉丝数
	private int clockDays;//连续打卡天数
	private String appellation;// 称号
	private boolean sign;// 今天是否签到
	private int message;// 消息数
	private String signature;// 用户签名
	private String nickName;//用户昵称
	private String portraiturl;//用户头像
	private Byte gender;// 用户的性别0-女，1-男，2-保密
	private Integer weight;// 用户的体重(KG)
	private Integer height;// 用户的身高(CM)
	private Long birthday;// 用户生日时间戳(s)
	private String province;// 用户所在省份编码
	private String provincetext;// 用户所在省份名称
	private String city;// 用户所在城市编码
	private String citytext;// 用户所在城市名称
	private String district;// 用户所在区县编码
	private String districttext;// 用户所在区县名称
	private List<BabyMessageVo> list;
	public UserUcenterResponseVo() {
		super();
	}
	public UserUcenterResponseVo(int collection, int publish, int concern, int fans, int clockDays,
			String appellation, boolean sign, int message, String signature, String nickName, String portraiturl,
			Byte gender, Integer weight, Integer height, Long birthday, String province, String provincetext,
			String city, String citytext, String district, String districttext, List<BabyMessageVo> list) {
		super();
		this.collection = collection;
		this.publish = publish;
		this.concern = concern;
		this.fans = fans;
		this.clockDays = clockDays;
		this.appellation = appellation;
		this.sign = sign;
		this.message = message;
		this.signature = signature;
		this.nickName = nickName;
		this.portraiturl = portraiturl;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.birthday = birthday;
		this.province = province;
		this.provincetext = provincetext;
		this.city = city;
		this.citytext = citytext;
		this.district = district;
		this.districttext = districttext;
		this.list = list;
	}
	public int getCollection() {
		return collection;
	}
	public void setCollection(int collection) {
		this.collection = collection;
	}
	public int getPublish() {
		return publish;
	}
	public void setPublish(int publish) {
		this.publish = publish;
	}
	public int getConcern() {
		return concern;
	}
	public void setConcern(int concern) {
		this.concern = concern;
	}
	public int getFans() {
		return fans;
	}
	public void setFans(int fans) {
		this.fans = fans;
	}
	public int getClockDays() {
		return clockDays;
	}
	public void setClockDays(int clockDays) {
		this.clockDays = clockDays;
	}
	public String getAppellation() {
		return appellation;
	}
	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}
	public boolean isSign() {
		return sign;
	}
	public void setSign(boolean sign) {
		this.sign = sign;
	}
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPortraiturl() {
		return portraiturl;
	}
	public void setPortraiturl(String portraiturl) {
		this.portraiturl = portraiturl;
	}
	public Byte getGender() {
		return gender;
	}
	public void setGender(Byte gender) {
		this.gender = gender;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Long getBirthday() {
		return birthday;
	}
	public void setBirthday(Long birthday) {
		this.birthday = birthday;
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
	public List<BabyMessageVo> getList() {
		return list;
	}
	public void setList(List<BabyMessageVo> list) {
		this.list = list;
	}

	
}
