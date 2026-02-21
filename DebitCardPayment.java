package com.service;

public class DebitCardPayment implements IPayment{
     @Override
	public void dopayment(double amount) {
		
		System.out.println("Payment is Done via DebitCardPayment: "+amount);
		
	}
}
