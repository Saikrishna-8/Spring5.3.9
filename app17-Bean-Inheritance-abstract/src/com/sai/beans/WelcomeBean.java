package com.sai.beans;

public class WelcomeBean {
	private String wish_Message;
	private String name;

	
	public String getWish_Message() {
		return wish_Message;
	}
	
	public void setWish_Message(String wish_Message) {
		this.wish_Message = wish_Message;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String sayWelcome() {
		return wish_Message +"  "+ name;
	}
}
