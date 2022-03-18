package com.sai.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean{
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
	
	@PostConstruct
	public void initializeBean()
	{
		System.out.println("Bean Instantiation through @PostConstruct Method");
		name="SAI KRISHNA";
		message="Good Evening";
	}
	
	@PreDestroy
	public void preDestroy()
	{
		System.out.println("Bean Denstantiation through @PreDestroy Method");
	}
	
	
}
