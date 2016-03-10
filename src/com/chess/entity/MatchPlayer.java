package com.chess.entity;

/**
 * 
 * @author SilveryBullet
 * 参赛选手的信息
 * 本实体和录入选手作关联，一个被录入的选手可能在不同时间参加不同比赛，所以形成一对多的关系
 *
 */
public class MatchPlayer {
	//参赛选手id
	private Long id;
	
	//参加某一比赛选手的大分/总分
	private Double bigScore;
	
	//参加某一比赛选手的小分/所有对手的总分
	private Double smallScore;
	
	//参加某一比赛选手的累进分
	private Double cumsumScore;
	
	//在本场比赛内选手的编号
	private Long playerNO;
	
	//选手对应录入信息表的id,外键
	private Long playerId;
	
	//选手参加比赛的id,外键
	private Long matchId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getBigScore() {
		return bigScore;
	}
	public void setBigScore(Double bigScore) {
		this.bigScore = bigScore;
	}
	public Double getSmallScore() {
		return smallScore;
	}
	public void setSmallScore(Double smallScore) {
		this.smallScore = smallScore;
	}
	public Double getCumsumScore() {
		return cumsumScore;
	}
	public void setCumsumScore(Double cumsumScore) {
		this.cumsumScore = cumsumScore;
	}
	public Long getPlayerNO() {
		return playerNO;
	}
	public void setPlayerNO(Long playerNO) {
		this.playerNO = playerNO;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public Long getMatchId() {
		return matchId;
	}
	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}
}
