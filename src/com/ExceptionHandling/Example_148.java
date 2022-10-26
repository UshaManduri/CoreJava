package com.ExceptionHandling;

public class Example_148 {

	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.out.println(10/0);
		}
	//	catch(ArithmeticException ae) {
		catch(NullPointerException npe) {
			System.out.println("In catch");
		}
		finally {
			System.out.println("in finally");
		}
		System.out.println("after try / catch / finally. ");
	}

}
