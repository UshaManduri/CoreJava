package com.Preparation;

public class Complex_ToString_ex {

	private double re, im;
	
	public Complex_ToString_ex (double re, double im) {
		
		this.re = re;
		this.im = im;
	}
	
	//getters
	public double getReal() {
		return this.re;
	}
	
	public double getImaginary() {
		return this.im;
	}
	
	//setters
	public void setReal(double re) {
		this.re = re;
	}
	
	public void setImaginary(double re) {
		this.im = im;
	}
	
	//overriding
	
	@Override
	public String toString() {
		return this.re+ " + " +this.im +"i";
	}
}
