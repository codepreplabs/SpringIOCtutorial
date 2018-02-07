package com.codepreplabs.app;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codepreplabs.bean.Foo;

public class TestSpring {

	static {

		BasicConfigurator.configure();
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Foo fooclassic = applicationContext.getBean("foo-classic", Foo.class);
		System.out.println(fooclassic.getEmail());
		
		Foo foomodern = applicationContext.getBean("foo-modern", Foo.class);
		System.out.println(foomodern.getEmail());
	}

}
