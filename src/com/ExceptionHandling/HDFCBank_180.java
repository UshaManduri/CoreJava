package com.ExceptionHandling;

public class HDFCBank_180 implements Bank {
	private double balance;
	public void deposite(double amt) throws InvalidAmountException_180{
		
		if(amt <= 0) {
			throw new InvalidAmountException_180(amt + " is invalid amount");
		}
		balance = balance + amt;
	}
	public double withdraw(double amt) throws InvalidAmountException_180, InsufficientFundsException_180{
		if (amt <= 0) {
			throw new InvalidAmountException_180(amt +" is invalid amount");
		}
		if (balance<amt) {
			throw new InsufficientFundsException_180("Insufficient funds");
		}
		balance = balance - amt;
		return amt;
	}
	public void balanceEnqiry() {
		System.out.println("Current Balance: "+balance);
	}
	@Override
	public void balanceEnquiry() {
		// TODO Auto-generated method stub
		
	}
}
