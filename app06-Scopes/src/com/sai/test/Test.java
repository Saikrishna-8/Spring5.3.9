package com.sai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.HelloBean;
import com.sai.scopes.ThreadScope;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/sai/resources/applicationContext.xml");
		
		HelloBean hb=(HelloBean)context.getBean("helloBean");
		HelloBean hb1=(HelloBean)context.getBean("helloBean");
		System.out.println(hb);
		System.out.println(hb1);
		
		ThreadScope ts=(ThreadScope)context.getBean("threadScope");
		System.out.println(ts);
		
		HelloBean hb2=(HelloBean)ts.remove("helloBean");
		System.out.println(hb2);
		
		
		
		
		
		
	}

}
