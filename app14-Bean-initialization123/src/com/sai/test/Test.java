package com.sai.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/sai/resources/applicationContext.xml");
		
		HelloBean hb=(HelloBean)context.getBean("helloBean");
		System.out.println(hb.sayHello());
		context.registerShutdownHook();
		
	}

}
