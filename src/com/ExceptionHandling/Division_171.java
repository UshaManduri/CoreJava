package com.ExceptionHandling;

public class Division_171 {
	static int div(String[] args) {
		int i = -1;
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			i = 4;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			i=5;
		}
		catch(NumberFormatException ne) {
			i=6;
		}
		catch(ArithmeticException ae) {
			i=7;
		}
		System.out.println("after t/c");
		return i;
	}
}
