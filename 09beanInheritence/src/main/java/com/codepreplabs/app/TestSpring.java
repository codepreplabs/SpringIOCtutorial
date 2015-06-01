package com.codepreplabs.app;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codepreplabs.bean.Engineer;

public class TestSpring {

	static {

		BasicConfigurator.configure();
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Engineer engineer = (Engineer) applicationContext.getBean("engineer");
		System.out.println(engineer.getCountry());

	}

}
