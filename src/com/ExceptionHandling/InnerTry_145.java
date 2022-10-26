package com.ExceptionHandling;

public class InnerTry_145 {
	public static void main(String[] args) {
		try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
				System.out.println(10/0);
			}
			catch(ArithmeticException ae) {
				System.out.println(("in inner catch"));
				System.out.println(10/0);
			}
			System.out.println("after inner try/catch");
		}
	//	catch(ArithmeticException ae) {
		catch(NumberFormatException e){
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");
	}
}
