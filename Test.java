package com.service;

public class Test {
	
	
	
public static void main(String[] args) {
	
//	UPIPayment upiPayment = new UPIPayment();
//	CreditCardPayment creditCardPayment = new CreditCardPayment(); 
//	PaymentService service = new PaymentService(upiPayment);              /// this is Constructor level  dependency Injection
//	PaymentService service2 = new PaymentService(creditCardPayment);
	
//	CreditCardPayment credit = new CreditCardPayment();
//	DebitCardPayment debit = new DebitCardPayment(); 
	PaymentService service = new PaymentService();
	
	
//     service.setPayment(new UPIPayment());  // setter Level Dependency Injection 
//     service.setPayment(new CreditCardPayment());   // Setter level Dependency Injection
//     service.setPayment(new DebitCardPayment()); // Setter level Dependency injection
	
	
//	service.upi = new UPIPayment();  // field Dependency
//	service.credit = new CreditCardPayment();
//	service.debit = new DebitCardPayment();
	
//	service.payment = new UPIPayment();
//	service.payment = new CreditCardPayment();
//	service.payment = new DebitCardPayment();
	service.doPayment(30000);
//	IPayment payment2 = new CreditCardPayment();
//	IPayment payment3 = new DebitCardPayment();
	
	
//	service.doPayment(30000);
	
	
}
	
	
}
