package com.sai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sai.beans.WelcomeBean;

@Configuration
public class AppConfig {
	
	static {
		System.out.println("AppConfig Bean Class is Loading");
	}
	
	public AppConfig()
	{
		System.out.println("AppConfig Bean is Instantiated");
	}
	
	
	

	@Bean
	public WelcomeBean welcomeBean()
	{
		WelcomeBean wb=new WelcomeBean();
		wb.setName("SAI KRISHNA");
		return wb;
	}
	
}
