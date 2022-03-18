package com.sai.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.HelloBean;
import com.sai.beans.WelcomeBean;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/sai/resources/applicationContext.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.sayHello());
		System.out.println();
		WelcomeBean welcome = (WelcomeBean) context.getBean("welcomeBean");
		System.out.println(welcome.sayWelcome());
		context.registerShutdownHook();
	}

}
