package com.sai.beans;

public class WelcomeBean {
	
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init()
	{
		name="Krishna ";
		message=" The Gladiator";
		System.out.println("initialized with WelcomeBean init() "+name+" "+message);
	}
	
	public void destroy()
	{
		System.out.println("WelcomeBean Destroy()");
	}
	
	public String sayWelcome()
	{
		return "Welcome .."+name+" "+message;
	}
}
