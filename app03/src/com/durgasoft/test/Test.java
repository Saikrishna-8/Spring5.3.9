package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Student;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("All Bean Objeccts for the Classes created at a time of ApplicationContext StartUP!!! ");
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml");
		
		System.out.println("Stdent Bean Object will be Assigned");
		Student std=(Student)context.getBean("stdBean");
		
	}

}
