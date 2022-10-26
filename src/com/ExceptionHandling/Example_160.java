package com.ExceptionHandling;

public class Example_160 {
	public static void main(String[] args) {
		System.out.println(m1());
	//	m1();
	}
//	static void m1() {
//	@SuppressWarnings("finally")
	static int m1() {
		try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
				System.out.println(10/0);
			}
		catch(NullPointerException e) {
			System.out.println("in inner catch");
		}
		finally {
			System.out.println("in innter finally");
			return 10;
		}
	//	System.out.println("after inner t/c/f");
	}
//	catch(NullPointerException e) {
	catch(ArithmeticException ae) {
		System.out.println("in outer catch");
	}
	finally {
		System.out.println("in outer finally");
	//	return 30;
	}
	System.out.println("after outer t/c/f");
		return 30;
	}
}