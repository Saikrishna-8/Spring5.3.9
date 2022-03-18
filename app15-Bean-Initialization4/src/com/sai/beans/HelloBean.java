package com.sai.beans;

public class HelloBean {
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
	
	
	public void local_init()
	{
		name="Saidulu";
		message="How Are You Man!!";
		System.out.println("initialized with HelloBean local_init() "+name+" "+message);
	}
	
	public void local_destroy()
	{
		System.out.println("local_destroy() of HelloBean");
	}
	public void init()
	{
		name="Sai";
		message=" The Gladiator";
		System.out.println("initialized with HelloBean init() "+name+" "+message);
	}
	
	public void destroy()
	{
		System.out.println("HelloBean Destroy()");
	}
	
	public String sayHello()
	{
		return "Hello .."+name+" "+message;
	}
}
