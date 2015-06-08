package com.codepreplabs.app;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codepreplabs.bean.LoginService;

public class LoginController {

	private static Scanner scanner;

	static {

		BasicConfigurator.configure();
	}

	public static void main(String[] args) {

		String username = null;
		String password = null;

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		LoginService loginService = applicationContext
				.getBean(LoginService.class);

		scanner = new Scanner(System.in);
		System.out.println("Enter username");
		if (scanner.hasNext()) {
			username = scanner.next();
		}
		System.out.println("Enter Password");
		if (scanner.hasNext()) {
			password = scanner.next();
		}

		System.out.println(loginService.validateLogin(username, password));
	}
}
