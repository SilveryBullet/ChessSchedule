package com.chess.entity;

public class Series {
	private Long id;
	private String seriesName;
	private String seriesTime;
	
	//系列主办方
	private String sponsor;
	
	//系列承办方
	private String organizer;
	
	//系列简介
	private String description;
	
	//状态  正常/删除
	private String state = "正常";
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public String getSeriesTime() {
		return seriesTime;
	}
	public void setSeriesTime(String seriesTime) {
		this.seriesTime = seriesTime;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
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
