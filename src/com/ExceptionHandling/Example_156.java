package com.ExceptionHandling;

public class Example_156 {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("in try");
			int a = 10/0;
			return 10;
		}
		catch(ArithmeticException ae) {
			System.out.println("in catch");
		}
		finally {
			System.out.println("in finally");
			if(true) {return 30;}						
		}
		System.out.println("after try / catch / finally");
		return 0;
	}

}
