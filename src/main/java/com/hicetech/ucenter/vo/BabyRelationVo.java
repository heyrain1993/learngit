package com.hicetech.ucenter.vo;

/**
 * @author Eric
 *2017年3月8日
 */
public class BabyRelationVo {

	private Long userId;
	private Long userBabyId;
	private String named;
	private Integer admin;
	public BabyRelationVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BabyRelationVo(Long userId, String named,Integer admin,Long userBabyId) {
		super();
		this.userId = userId;
		this.named = named;
		this.admin=0;
		this.userBabyId=userBabyId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getNamed() {
		return named;
	}
	public void setNamed(String named) {
		this.named = named;
	}
	
	public Long getUserBabyId() {
		return userBabyId;
	}
	public void setUserBabyId(Long userBabyId) {
		this.userBabyId = userBabyId;
	}
	public Integer getAdmin() {
		return admin;
	}
	public void setAdmin(Integer admin) {
		this.admin = admin;
	}
	
	
}
