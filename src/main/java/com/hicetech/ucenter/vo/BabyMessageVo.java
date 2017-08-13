package com.hicetech.ucenter.vo;

public class BabyMessageVo{
	
	private Long id;//宝宝id
	 private String nickname;//宝宝昵称
	 private String portraiturl;//宝宝头像
	 private String constellation;//对应星座
	 private String age;//宝宝的年龄
	 private String named;//最近关注宝宝用户与宝宝之间的关系称呼
	 private Long birthday;
	 private Double weight;
	 private Double height;
	 private Short bloodType;
	 private Byte gender;
	 private Long birth;
	 private String family;// 与宝宝亲属关系
	 private String familyportraiturl;
	
	public BabyMessageVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BabyMessageVo(Long id,String nickname, String portraiturl, String constellation, String age, String named,
			Long birthday, Double weight, Double height, Short bloodType, Byte gender, Long birth,String familyportraiturl,String family) {
		super();
		this.id=id;
		this.nickname = nickname;
		this.portraiturl = portraiturl;
		this.constellation = constellation;
		this.age = age;
		this.named = named;
		this.birthday = birthday;
		this.weight = weight;
		this.height = height;
		this.bloodType = bloodType;
		this.gender = gender;
		this.birth = birth;
		this.familyportraiturl=familyportraiturl;
		this.family=family;
	}

	public String getFamilyportraiturl() {
		return familyportraiturl;
	}

	public void setFamilyportraiturl(String familyportraiturl) {
		this.familyportraiturl = familyportraiturl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNamed() {
		return named;
	}
	public void setNamed(String named) {
		this.named = named;
	}

	public Long getBirthday() {
		return birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
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

	public Short getBloodType() {
		return bloodType;
	}

	public void setBloodType(Short bloodType) {
		this.bloodType = bloodType;
	}

	public Byte getGender() {
		return gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	public Long getBirth() {
		return birth;
	}

	public void setBirth(Long birth) {
		this.birth = birth;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}
	 
	 
}
