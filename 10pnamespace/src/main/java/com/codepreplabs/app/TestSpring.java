package com.codepreplabs.app;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codepreplabs.bean.Person;

public class TestSpring {

	static {

		BasicConfigurator.configure();
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Person classic = (Person) applicationContext.getBean("jhonDoe-classic");
		
		System.out.println(classic.getName());
		System.out.println(classic.getSpouse().getName());
		
		Person modern = (Person) applicationContext.getBean("jhonDoe-modern");
		
		System.out.println(modern.getName());
		System.out.println(modern.getSpouse().getName());
	}

}
