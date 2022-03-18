package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml");
		
		HelloBean hello=(HelloBean)context.getBean("helloBean");
		System.out.println(hello);
		
		HelloBean hello1=(HelloBean)context.getBean("helloBean1");
		System.out.println(hello1);
		
		
		HelloBean hello3=(HelloBean)context.getBean("helloBean3");
		System.out.println(hello3);
		
		
	/*	Runnable r=new Runnable() {
			
			@Override
			public void run() {
				HelloBean hello4=(HelloBean)context.getBean("helloBean");
				System.out.println("Thread 1  "+hello4);
				
				
				HelloBean hello5=(HelloBean)context.getBean("helloBean");
				System.out.println("Thread 1 "+hello5);
			}
		};
		
		Thread t1=new Thread(r);
		t1.start();
	*/
		
	/*	new Thread(()->{
			
			HelloBean hello6=(HelloBean)context.getBean("helloBean3");
			System.out.println("Thread 2 "+hello6);
			
		}).start(); */
		
	}

}
