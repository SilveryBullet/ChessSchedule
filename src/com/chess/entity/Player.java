package com.chess.entity;

/**
 * 
 * @author SilveryBullet
 * 本类描述了在本系统中注册过的所有用户的信息
 * 注册的用户可以成为参赛选手进入参赛选手表，当然也可以打酱油
 *
 */
public class Player {
	//注册选手id
	private Long id;
	
	//注册选手学号
	private String playerNO;
	
	//注册选手姓名
	private String name;
	
	//注册选手性别  男/女/未知
	private String gender;
	
	//注册选手院系 通信与信息工程学院/电子工程学院
	private String department;
	
	//注册选手的专业 通信工程/集成电路
	private String major;
	
	//注册选手的班级 1301/1502
	private String clazz;
	
	//注册选手的联系电话
	private String phoneNumber;
	
	//注册选手的邮箱
	private String email;
	
	//注册选手的备注
	private String detail;
	
	//选手的信息状态  正常/删除
	private String state = "正常";
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlayerNO() {
		return playerNO;
	}
	public void setPlayerNO(String playerNO) {
		this.playerNO = playerNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
