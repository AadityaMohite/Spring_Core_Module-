package com.demo;

public class A {


	
//	B bb;// field dependency
	C ccC;
	B bb;
	void m1() {
		bb.m2();
		ccC.m3();
//		bb.m2();
		
		
//		bb.m2();
		System.out.println("M1 method is Call");
		
		
	}
	
	
	
}
