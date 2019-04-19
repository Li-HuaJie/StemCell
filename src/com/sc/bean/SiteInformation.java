package com.sc.bean;

import java.sql.Timestamp;

public class SiteInformation extends BaseBean {

	private Integer id;//主键id
	private String name;//姓名
	private String city;//城市
	private String mobile;//电话
	private String email;//电子邮箱
	private String know;//
	private String inform;//
	private Integer state;//0为未读，1解决，2审核
	private Timestamp create_time;//创建时间
	private Timestamp updateTime;//修改时间
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getKnow() {
		return know;
	}
	public void setKnow(String know) {
		this.know = know;
	}
	
	public String getInform() {
		return inform;
	}
	public void setInform(String inform) {
		this.inform = inform;
	}
	
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	
}
