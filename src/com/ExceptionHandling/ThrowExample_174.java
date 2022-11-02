package com.ExceptionHandling;

public class ThrowExample_174 {
	void m1() throws ArithmeticException{
		if(true) {
			throw new ArithmeticException();
		}
		System.out.println();
		try {
			throw new InterruptedException();
		}
		catch(InterruptedException a) {}
	}
	
}
