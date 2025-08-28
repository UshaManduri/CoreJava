package com.Preparation;

public class Polymorphism {

	public static void main(String[] args) {
		
		Payment payment;
		
		payment = new CashPayment();
		payment.pay();
		
		payment = new CreditPayment();
		payment.pay();
	}
}
