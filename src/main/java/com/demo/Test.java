package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xyz.xml");
		
		
		Car c1 = context.getBean(Car.class);
		c1.journey();
		
		
	}
	
	
}
