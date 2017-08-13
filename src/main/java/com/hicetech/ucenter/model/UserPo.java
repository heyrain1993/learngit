package com.hicetech.ucenter.model;

import com.hicetech.ucenter.model.request.UserInfoRequest;

public class UserPo {
    private Long id;

    private Long createtime;

    private String account;

    private String password;

    private String mobilenum;

    private String nickname;

    private String portraiturl;

    private Byte gender;

    private Long birthday;

    private Integer weight;

    private Integer height;

    private String name;

    private String idnumber;

    private String country;

    private String countrytext;

    private String province;

    private String provincetext;

    private String city;

    private String citytext;

    private String district;

    private String districttext;

    private String detailaddr;

    private String signature;

    private Integer regsource;

    private Integer status;

    public UserPo(Long id, Long createtime, String account, String password, String mobilenum, String nickname, String portraiturl, Byte gender, Long birthday, Integer weight, Integer height, String name, String idnumber, String country, String countrytext, String province, String provincetext, String city, String citytext, String district, String districttext, String detailaddr, String signature, Integer regsource, Integer status) {
        this.id = id;
        this.createtime = createtime;
        this.account = account;
        this.password = password;
        this.mobilenum = mobilenum;
        this.nickname = nickname;
        this.portraiturl = portraiturl;
        this.gender = gender;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.idnumber = idnumber;
        this.country = country;
        this.countrytext = countrytext;
        this.province = province;
        this.provincetext = provincetext;
        this.city = city;
        this.citytext = citytext;
        this.district = district;
        this.districttext = districttext;
        this.detailaddr = detailaddr;
        this.signature = signature;
        this.regsource = regsource;
        this.status = status;
    }

    public UserPo(UserInfoRequest request) {
        super();
        this.nickname = request.getNickname();
        this.portraiturl = request.getPortraiturl();
        this.weight = request.getWeight();
        this.height = request.getHeight();
        this.birthday = request.getBirthday();
        this.country = request.getCountry();
        this.countrytext = request.getCountrytext();
        this.province = request.getProvince();
        this.provincetext = request.getProvincetext();
        this.city = request.getCity();
        this.citytext = request.getCitytext();
        this.district = request.getDistrict();
        this.districttext = request.getDistricttext();
    }

    public UserPo() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum == null ? null : mobilenum.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPortraiturl() {
        return portraiturl;
    }

    public void setPortraiturl(String portraiturl) {
        this.portraiturl = portraiturl == null ? null : portraiturl.trim();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCountrytext() {
        return countrytext;
    }

    public void setCountrytext(String countrytext) {
        this.countrytext = countrytext == null ? null : countrytext.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getProvincetext() {
        return provincetext;
    }

    public void setProvincetext(String provincetext) {
        this.provincetext = provincetext == null ? null : provincetext.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCitytext() {
        return citytext;
    }

    public void setCitytext(String citytext) {
        this.citytext = citytext == null ? null : citytext.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getDistricttext() {
        return districttext;
    }

    public void setDistricttext(String districttext) {
        this.districttext = districttext == null ? null : districttext.trim();
    }

    public String getDetailaddr() {
        return detailaddr;
    }

    public void setDetailaddr(String detailaddr) {
        this.detailaddr = detailaddr == null ? null : detailaddr.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Integer getRegsource() {
        return regsource;
    }

    public void setRegsource(Integer regsource) {
        this.regsource = regsource;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}