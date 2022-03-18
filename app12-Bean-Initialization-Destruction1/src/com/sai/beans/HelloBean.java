package com.sai.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean,DisposableBean {
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
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing through afterProperSet() method ");
		name="Yallamanda";
		message="Good Morning!!!";
	}
	@Override
	public void destroy() throws Exception {
		
		System.out.println("destroy()-Method");
		
	}
	
	
}
