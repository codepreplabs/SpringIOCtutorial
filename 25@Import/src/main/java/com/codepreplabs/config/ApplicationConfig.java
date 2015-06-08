package com.codepreplabs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ControllerConfig.class,ServiceConfig.class, DAOConfig.class})
public class ApplicationConfig {

}
