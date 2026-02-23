package com.service;

public class Car {
  Car(){
	  
	  System.out.println("Car default Constructor");
  }
	IEngine engine;
	
	public Car(IEngine engine) {
		
		this.engine = engine;
	}
	
//	public void setEngine(IEngine engine) {
//		this.engine = engine;
//	}
//	
	public void journey() {
		
		engine.start();
		
		System.out.println("Happy Journey go to Destination");
		
		
	}
	
	
	
}
