package com.sai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sai.beans.WelcomeBean;
import com.sai.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		//All Beans are Loaded and Instantiated
		
		
		WelcomeBean wb=(WelcomeBean)context.getBean(WelcomeBean.class);
		System.out.println(wb.getMessage());
		
		WelcomeBean wb1=(WelcomeBean)context.getBean("welcomeBean");
		System.out.println(wb1.getMessage());
		
		System.out.println(wb1==wb);
		
	}

}
