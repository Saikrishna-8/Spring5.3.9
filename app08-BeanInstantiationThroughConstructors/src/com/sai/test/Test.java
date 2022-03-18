package com.sai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.HelloBean;

public class Test {
	
	public static void main(String args[])
	{
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/sai/config/applicationContext.xml");
		HelloBean hb=(HelloBean)context.getBean("helloBean");
		System.out.println(hb.sayHello());
		
	}
}
