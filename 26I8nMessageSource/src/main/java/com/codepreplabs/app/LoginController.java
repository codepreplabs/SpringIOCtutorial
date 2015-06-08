package com.codepreplabs.app;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.codepreplabs.bean.LoginService;

@Controller
public class LoginController {

	private static Scanner scanner;
	
	@Autowired
	public MessageSource messages;

	static {

		BasicConfigurator.configure();
	}

	public static void main(String[] args) {

		String username = null;
		String password = null;

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
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
		
		LoginController controller = applicationContext.getBean(LoginController.class);
		System.out.println(controller.messages.getMessage("Company", null, null));

		System.out.println(loginService.validateLogin(username, password));
	}
}
