package com.sai.beans;

public class HelloBean {
	
	public static HelloBean getInstance()
	{
		System.out.println("Static Factory Method");
		return new HelloBean();
	}
	public String sayHello()
	{
		return "hello SAI";
	}
}
