package com.ExceptionHandling;

public interface Bank {
	public void deposite(double amt) throws InvalidAmountException_180;
	
	public double withdraw(double amt) throws InvalidAmountException_180, InsufficientFundsException_180;
	
	public void balanceEnquiry();
}
