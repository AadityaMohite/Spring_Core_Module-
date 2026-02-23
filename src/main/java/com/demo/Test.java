package com.aadi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("aadi.xml");
		
//		
		Car c1 = context.getBean("c1",Car.class);
		c1.journey();
		
		System.out.println(c1.hashCode());
		
		Car c2 = context.getBean("c2",Car.class);
		
		System.out.println(c2.hashCode());
		
		PetrolEngine engine = context.getBean(PetrolEngine.class);
		
		  engine.start();
		  
//		  Car c3 = context.getBean("c1",Car.class);
//		  System.out.println(c3.hashCode());
//		  
//		  
//		  Car c4 = context.getBean("c2",Car.class);
//		  System.out.println(c4.hashCode());
	}
	
	
	
	
}
