package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.HelloBean;

public class Test {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml");

		HelloBean hb = (HelloBean) context.getBean("helloBean");
		//hb.setName("Durga");
		System.out.println(hb.sayHello());

	}

}
