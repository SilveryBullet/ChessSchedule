package com.chess.entity;

/**
 * 
 * @author SilveryBullet
 * 本类描述了一些具体的对战规则
 * 主要是用来规定胜局，平局，负局分别的得分情况
 * 规则之间有隶属关系
 * 比如象棋比赛的规则一，规则二等等
 *
 */
public class ScoreRule {
	//规则id
	private Long id;
	
	//规则规定胜局的得分
	private Double winningScore;
	
	//规则规定负局的得分
	private Double losingScore;
	
	//规则规定平局的得分
	private Double drawScore;
	
	//规则描述 胜:2 负:-2 平:0  影子属性
	private String description;
	
	//状态 正常/删除
	private String state = "正常";
	
	//创建规则描述
	public void createDescription(){
		this.description = "胜:" + winningScore + " 负:" + losingScore + " 平:" + drawScore;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getWinningScore() {
		return winningScore;
	}
	public void setWinningScore(Double winningScore) {
		this.winningScore = winningScore;
	}
	public Double getLosingScore() {
		return losingScore;
	}
	public void setLosingScore(Double losingScore) {
		this.losingScore = losingScore;
	}
	public Double getDrawScore() {
		return drawScore;
	}
	public void setDrawScore(Double drawScore) {
		this.drawScore = drawScore;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
