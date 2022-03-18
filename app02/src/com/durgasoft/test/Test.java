package com.durgasoft.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.durgasoft.beans.Employee;

public class Test {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("/com/durgasoft/resources/applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		System.out.println("Bean Object will be Created only when we call getBean Method");
		Employee emp=(Employee)factory.getBean("empBean");
		emp.getEmployeeDetails();
		
	}

}
