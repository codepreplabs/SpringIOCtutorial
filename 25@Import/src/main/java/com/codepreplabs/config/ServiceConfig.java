package com.codepreplabs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codepreplabs.bean.LoginService;

@Configuration
public class ServiceConfig {

	@Bean
	public LoginService getLoginService() {
		return new LoginService();
	}
}
