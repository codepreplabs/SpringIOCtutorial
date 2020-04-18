package com.codepreplabs.app;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codepreplabs.bean.Employee;

public class TestSpring {

	static {

		BasicConfigurator.configure();
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getDepartment1().getName());
		System.out.println(employee.getDepartment2().getName());
		
	}

}
