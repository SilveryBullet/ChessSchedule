package com.chess.entity;

/**
 * 
 * @author SilveryBullet
 * 本类描述了管理员实体
 *
 */
public class Admin {
	//管理员实体的id
	private Long id;
	
	//管理员的登录名
	private String loginName;
	
	//管理员的昵称
	private String userName;
	
	//管理员的密码，MD5加密
	private String password;
	
	//管理员的账号状态：正常/冻结
	private String state;
	
	//管理员的权限：超级管理员/管理员
	private String privilege;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
}
