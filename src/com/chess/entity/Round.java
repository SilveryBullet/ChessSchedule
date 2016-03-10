package com.chess.entity;

/**
 * 
 * @author SilveryBullet
 * 本类描述了两个选手之间的具体对战信息
 *
 */
public class Round {
	//轮次信息id
	private Long id;
	
	//对战双方所在桌号
	private Long tableId;
	
	//甲方参赛id
	private Long playerAId;
	
	//甲方当前的赛前得分
	private Double playerABigScore;
	
	//乙方参赛id
	private Long playerBId;
	
	//乙方当前的赛前得分
	private Double playerBBigScore;
	
	//对战所属比赛的id，外键
	private Long matchId;
	
	//对战结果
	private String result;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTableId() {
		return tableId;
	}
	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}
	public Long getPlayerAId() {
		return playerAId;
	}
	public void setPlayerAId(Long playerAId) {
		this.playerAId = playerAId;
	}
	public Double getPlayerABigScore() {
		return playerABigScore;
	}
	public void setPlayerABigScore(Double playerABigScore) {
		this.playerABigScore = playerABigScore;
	}
	public Long getPlayerBId() {
		return playerBId;
	}
	public void setPlayerBId(Long playerBId) {
		this.playerBId = playerBId;
	}
	public Double getPlayerBBigScore() {
		return playerBBigScore;
	}
	public void setPlayerBBigScore(Double playerBBigScore) {
		this.playerBBigScore = playerBBigScore;
	}
	public Long getMatchId() {
		return matchId;
	}
	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
