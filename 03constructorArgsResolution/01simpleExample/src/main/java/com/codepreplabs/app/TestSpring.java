package com.codepreplabs.app;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codepreplabs.bean.HelloBean;

public class TestSpring {
	
	static{
		
		BasicConfigurator.configure();
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean helloBean = applicationContext.getBean("helloBean", HelloBean.class);
		
		System.out.println(helloBean.getMessage());
	}

}
