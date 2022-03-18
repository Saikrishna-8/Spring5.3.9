package com.sai.beans;

public class HelloBean {
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
		System.out.println("Initialized Through setName()..."+this.name);
	}
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Initialized Through setMessage()..."+this.message);
	}
	public String getMessage() {
		return message;
	}
	public String welcome() {
		
		return "Welcome .."+name+" "+message;
	}
	
	public void init()
	{
		name="Jhansi";
		message="Good Night!!!";
	}
	public void destroy()
	{
		name="";
		message="";
		System.out.println("Destroy() method");
	}
}
