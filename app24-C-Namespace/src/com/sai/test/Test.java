package com.sai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.Student;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/sai/resources/applicationContext.xml");
		Student st=(Student)context.getBean("student");
		System.out.println(st);
	}

}
