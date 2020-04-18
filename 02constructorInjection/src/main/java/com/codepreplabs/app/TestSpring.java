package com.codepreplabs.app;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codepreplabs.bean.BaseDAOImpl;

public class TestSpring {
	
	private static ApplicationContext applicationContext;

	static{
		BasicConfigurator.configure();
	}

	public static void main(String[] args) {
		
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BaseDAOImpl baseDAOImpl = (BaseDAOImpl) applicationContext.getBean("BaseDAOImpl");
		
		baseDAOImpl.save();
	}

}
