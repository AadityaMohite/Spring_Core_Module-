package com.service;

public class CreditCardPayment implements IPayment{

	
	public void dopayment(double amount) {
		
		System.out.println("payment is Done via CreditCardPayment : "+ amount);
		
	}
	
}
