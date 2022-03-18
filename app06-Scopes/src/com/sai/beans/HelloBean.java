package com.sai.beans;

public class HelloBean {
	private String message;
	
	static {
		System.out.println("Bean Class Loaded");
	}
	
	public HelloBean()
	{
		System.out.println("Bean is Instanciated");
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
