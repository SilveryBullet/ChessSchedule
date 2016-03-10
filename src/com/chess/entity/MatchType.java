package com.chess.entity;

/**
 * 
 * @author SilveryBullet
 * 本类描述了比赛类型，例如中国象棋，五子棋，围棋等等
 *
 */
public class MatchType {
	//比赛类型的id
	private Long id;
	
	//比赛类型的名称
	private String typeName;
	
	//比赛的状态  正常/删除
	private String state = "正常";
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
