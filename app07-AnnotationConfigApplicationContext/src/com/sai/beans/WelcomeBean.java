package com.sai.beans;

public class WelcomeBean {
	
	private String name;
	
	static {
		System.out.println("WelcomeBean Class is Loading");
	}
	
	public WelcomeBean()
	{
		System.out.println("WelcomeBean Class is Instantiated");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessage()
	{
		return "Welcome AnnotationsConfig, you replacement to Spring XML Configuration File"+name;
	}
	
}
