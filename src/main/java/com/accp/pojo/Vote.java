package com.accp.pojo;

import java.util.Date;

public class Vote {

	public int getVoteId() {
		return voteId;
	}

	public void setVoteId(int voteId) {
		this.voteId = voteId;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getGreateDate() {
		return greateDate;
	}

	public void setGreateDate(Date greateDate) {
		this.greateDate = greateDate;
	}

	private int voteId;
	
	public Vote(int voteId, int message, String userName, Date greateDate) {
		super();
		this.voteId = voteId;
		this.message = message;
		this.userName = userName;
		this.greateDate = greateDate;
	}
	public Vote() {
		super();
	}

	private int message;
	
	private String userName;
	
	private Date greateDate;
}
