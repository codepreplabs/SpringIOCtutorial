package com.codepreplabs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codepreplabs.app.LoginController;

@Configuration
public class ControllerConfig {
	
	@Bean
	public LoginController getLoginController() {
		return new LoginController();
	}
	
	
}
