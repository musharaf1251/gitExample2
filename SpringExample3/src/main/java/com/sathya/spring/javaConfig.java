package com.sathya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
	
	@Bean
	
	public GreetingIMpl greet()
	{  GreetingIMpl greetingImpl=new GreetingIMpl();
	return greetingImpl;
	}
	

}
