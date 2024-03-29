package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	System.out.println("********");
    	
    	GreetingIMpl greetingIMpl = context.getBean("greet",GreetingIMpl.class);
    	greetingIMpl.greet();
    }
}
