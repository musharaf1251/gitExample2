package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
    	
    	System.out.println("********");
    	
    	GreetingIMpl greetingIMpl = context.getBean("greet",GreetingIMpl.class);
    	greetingIMpl.greet();
    }
}
