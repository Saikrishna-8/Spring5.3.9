package com.sai.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.EmployeeBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/sai/resources/applicationContext.xml");
		
		EmployeeBean eb=(EmployeeBean)context.getBean("employeeBean");
		
		System.out.println(eb);
	}

}
