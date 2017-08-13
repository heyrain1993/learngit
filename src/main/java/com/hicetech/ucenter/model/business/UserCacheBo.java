package com.hicetech.ucenter.model.business;

import com.hicetech.ucenter.model.JPushPo;
import com.hicetech.ucenter.model.UserPo;

public class UserCacheBo {
	
	private String token;
	
	private UserPo user;
	
	private JPushPo jPush;
	
	private Integer credits;
	
	private Integer experience;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UserPo getUser() {
		return user;
	}

	public void setUser(UserPo user) {
		this.user = user;
	}

	public JPushPo getjPush() {
		return jPush;
	}

	public void setjPush(JPushPo jPush) {
		this.jPush = jPush;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public UserCacheBo(String token, UserPo user, JPushPo jPush, Integer credits, Integer experience) {
		super();
		this.token = token;
		this.user = user;
		this.jPush = jPush;
		this.credits = credits;
		this.experience = experience;
	}

	public UserCacheBo() {
		super();
	}

	public void setData(String token, UserPo user, JPushPo jPush, Integer credits, Integer experience) {
		this.token = token;
		this.user = user;
		this.jPush = jPush;
		this.credits = credits;
		this.experience = experience;
	}
	
}
