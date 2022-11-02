package com.ExceptionHandling;

public class A_167 {
	int m1(){
		try {
			System.out.println("in try");
			return 10;
		}
		catch(ArithmeticException e) {
			System.out.println("in catch");
			return 20;
		}
	//	System.out.println("after t/c");
	}
	public static void main(String[] args) {
	//	int a = 10;
	//	int a;
		int a = -1;
		try {
			a=10;
	//		int b = 20;
		
			System.out.println("in try -a: "+a);
		//	System.out.println(a);
		//	System.out.println(b);
		}
		
		catch(ArithmeticException ae) {
			a=30;
			System.out.println("in catch a: "+a);
		//	b=40;
		}
		
	//	catch(NullPointerException npe) {
	//		System.out.println(a);
	//	}
		finally {
		//	System.out.println(a);
			System.out.println("in finally a: "+a);
		//	a = 30;
		}
		
		System.out.println("after t/c/f a: "+a);
	//	System.out.println(a);
	//	System.out.println(b);
	}
}
