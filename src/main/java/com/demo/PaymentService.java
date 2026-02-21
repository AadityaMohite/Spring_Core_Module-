package com.service;

import java.lang.reflect.Field;

public class PaymentService {

	
//	  UPIPayment upi;   Refernce Variable of UPIPayment class  This is Good Way but Not Recommended
//	  CreditCardPayment credit;  Refernce Variable of CreditCardPayment
	
//	  DebitCardPayment debit; Refernce Variable of DebitCardpayment
//	IPayment payment;
// PaymentService(IPayment payment) {
//	 this.payment = payment;                 constructor level Dependency 
//}
	
//	IPayment payment;  // Setter level Dependency Injection
//	public void setPayment( IPayment payment) {
//		this.payment = payment;
//	}
	
	

//	    
	   public void doPayment( double amount) {
		   
//		   upi.dopayment(amount);  //field  level dependency injection
//		   credit.dopayment(amount); //Field level dependency injection
//		   
//		   debit.dopayment(amount);  // field level dependency injection
//		   
//		   payment.dopayment(amount);
		   
//		   payment.dopayment(amount);
		   
		   
		   System.out.println("Payment is Done: "+amount);
		   
	   }
}
