package com.codepreplabs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codepreplabs.bean.LoginDAO;

@Configuration
public class DAOConfig {

	@Bean
	public LoginDAO getLoginDAO() {
		return new LoginDAO();
	}
}
