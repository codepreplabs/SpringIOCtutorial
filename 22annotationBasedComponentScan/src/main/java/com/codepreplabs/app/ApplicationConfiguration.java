package com.codepreplabs.app;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.codepreplabs.*")
public class ApplicationConfiguration {
	
	@PostConstruct
	public void init(){
		System.out.println("Initializing Application Context");
	}

}
