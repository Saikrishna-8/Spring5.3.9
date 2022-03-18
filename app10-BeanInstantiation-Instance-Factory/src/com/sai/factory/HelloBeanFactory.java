package com.sai.factory;

import com.sai.beans.HelloBean;

public class HelloBeanFactory {
	
	public HelloBean getInstance()
	{
		System.out.println("Instance Factory Method");
		return new HelloBean();
	}
}
