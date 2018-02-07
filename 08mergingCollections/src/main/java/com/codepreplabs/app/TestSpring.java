package com.codepreplabs.app;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codepreplabs.bean.SimpleObject;

public class TestSpring {

	static {

		BasicConfigurator.configure();
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		SimpleObject object = (SimpleObject) applicationContext.getBean("child");
		System.out.println(object.getAdminEmails().get("administrator"));
		System.out.println(object.getAdminEmails().get("support"));
		System.out.println(object.getAdminEmails().get("sales"));
		System.out.println(object.getAdminEmails().get("info"));

	}

}
