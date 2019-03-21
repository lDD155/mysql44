package com.accp.pojo;

import java.util.Date;

public class Message {

	private int messageId;
	
	private String Content;
	
	private String userName;
	
	private Date greateDate; 
	
	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
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
	
	public Message(int messageId, String content, String userName, Date greateDate) {
		super();
		this.messageId = messageId;
		Content = content;
		this.userName = userName;
		this.greateDate = greateDate;
	}
	public Message() {
		super();
	}

}
