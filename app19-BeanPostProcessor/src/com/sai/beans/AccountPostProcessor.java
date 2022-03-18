package com.sai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AccountPostProcessor implements BeanPostProcessor  {
	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		Account acc=(Account)bean;
		
		if(acc.getAccType()==null)
			acc.setAccType("savings");
		return acc;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		Account acc=(Account)bean;
		String str=acc.getAccEmail();
		if(!str.contains("@"))
		{	
			str+="@gmail.com";
			acc.setAccEmail(str);
		}
		str=acc.getAccMobile();
		if(!str.contains("91-"))
		{
			str="91-"+str;
			acc.setAccMobile(str);
		}
		
		return acc;
	}
}
