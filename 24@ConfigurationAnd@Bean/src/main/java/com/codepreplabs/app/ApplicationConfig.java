package com.codepreplabs.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codepreplabs.bean.LoginDAO;
import com.codepreplabs.bean.LoginService;

@Configuration
public class ApplicationConfig {

	@Bean
	public LoginController getLoginController() {
		return new LoginController();
	}

	@Bean
	public LoginDAO getLoginDAO() {
		return new LoginDAO();
	}

	@Bean
	public LoginService getLoginService() {
		return new LoginService();
	}
}
