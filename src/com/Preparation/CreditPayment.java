package com.Preparation;

public class CreditPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("payment using credit card.");
	}
	
}
