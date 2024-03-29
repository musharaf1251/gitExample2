package com.sathya.spring;

public class GreetingIMpl implements Greeting
{
	public void greet() {
		System.out.println("This is Spring First Example...");
		System.out.println("Ratan sir wooooooo....");
	}
	public GreetingIMpl() {
		System.out.println("GreetingIMPl constructor :: object created");
	}

}
