package com.ExceptionHandling;

public class Example_153 {
	public static void main(String[] args) {
		m1();
		System.out.println("after calling m1");
	}
	static void m1() {
		try {
			System.out.println("in try");
			System.out.println(10/0);
	//		return 10;
		}
 //		catch(ArithmeticException ae) {
		catch(NullPointerException e) {
			System.out.println("In catch");
		//	return 20;
		}
		finally {
			System.out.println("in finally");
	//		return 30;
	//		return;
			int[] ia = new int[-5];							//>>>>>>>>>>>>>>>>>>>>
		}
	}
}
