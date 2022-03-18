package com.sai.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean,DisposableBean{
	
	private String name;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
		System.out.println(this.name+"  'name' is initialized with SetName() ");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		System.out.println(this.message+"  'message' is initialized with SetName()");
	}
	
	public void custom_init()
	{
		name="Saidulu";
		message="Where are You man!!";
		System.out.println("Initialized through Custom_init "+name+" "+message);
	}
	
	public void custom_destroy()
	{
		System.out.println("Deinstantiation through Custom_destroy ");
	}
		
	@Override
	public void afterPropertiesSet() throws Exception {
		name="Anjamma";
		message=" How are you";
		System.out.println("Initializing Bean through afterpropertiesSet() "+name+" "+ message);
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Callback Interface Destroy() Invoked ");
	}
	
	
	
	@PostConstruct
	public void initializeBean()
	{
		name="yallamanda..";
		message="  Good After Noon";
		System.out.println("Initializing Bean Through PostConstruct "+name+" "+message);
		
	}
	
	@PreDestroy
	public void destroyBean()
	{
		System.out.println("Destroying Bean Through PreDestroy");
		name="";
		message="";
	}
	
	public String sayHello()
	{
		return "Hello "+name+"!!! "+message;
	}
}
