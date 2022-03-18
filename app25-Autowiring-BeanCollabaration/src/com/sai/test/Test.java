package com.sai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/sai/resources/applicationContext.xml");
		
		Employee emp=(Employee)context.getBean("empBean");
		
		emp.getAcc1().setType("savings");  // it will update in acc and acc1 both references because object is same
		//this is the drawback of byName attribute
		System.out.println(emp);

	}
}
