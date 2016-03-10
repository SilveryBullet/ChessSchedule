package com.chess.entity;

/**
 * 
 * @author SilveryBullet
 * 本实体组成列表，供比赛根据参赛人数确定比赛轮次
 *
 */
public class RoundCount {
	//列表元组id
	private Long id;
	
	//适合的比赛轮次
	private Long roundNumber;
	
	//本次参赛人数
	private Long playerNumber;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRoundNumber() {
		return roundNumber;
	}
	public void setRoundNumber(Long roundNumber) {
		this.roundNumber = roundNumber;
	}
	public Long getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(Long playerNumber) {
		this.playerNumber = playerNumber;
	}
	
}
