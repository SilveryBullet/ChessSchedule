package com.chess.entity;

/**
 * 
 * @author SilveryBullet
 * 本类描述了一个具体的比赛的基本信息
 * 例如，启航杯系列下的象棋比赛，象棋比赛就是一个这样的实体
 *
 */
public class Match {
	//比赛id
	private Long id;
	
	//比赛姓名
	private String matchName;
	
	//比赛时间
	private String matchTime;
	
	//比赛地点
	private String matchAddress;
	
	//参与比赛的总人数
	private Long playerNumber;
	
	//比赛的轮次，由查表确定，并不是外键
	private Long roundCount;
	
	//比赛类型id，外键
	private Long matchTypeId;
	
	//比赛所属系列id，外键
	private Long seriesId;
	
	//比赛采用规则的id，外键
	private Long scoreRuleId;
	
	//状态  正常/删除
	private String state = "正常";
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMatchName() {
		return matchName;
	}
	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}
	public String getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}
	public String getMatchAddress() {
		return matchAddress;
	}
	public void setMatchAddress(String matchAddress) {
		this.matchAddress = matchAddress;
	}
	public Long getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(Long playerNumber) {
		this.playerNumber = playerNumber;
	}
	public Long getRoundCount() {
		return roundCount;
	}
	public void setRoundCount(Long roundCount) {
		this.roundCount = roundCount;
	}
	public Long getMatchTypeId() {
		return matchTypeId;
	}
	public void setMatchTypeId(Long matchTypeId) {
		this.matchTypeId = matchTypeId;
	}
	public Long getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(Long seriesId) {
		this.seriesId = seriesId;
	}
	public Long getScoreRuleId() {
		return scoreRuleId;
	}
	public void setScoreRuleId(Long scoreRuleId) {
		this.scoreRuleId = scoreRuleId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
