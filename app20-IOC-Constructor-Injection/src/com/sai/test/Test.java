package com.sai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.Course;

public class Test {
	public static void main(String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/sai/resources/applicationContext.xml");
		
		Course course =(Course)context.getBean("course3");
		course.getDetails();
	}
}
