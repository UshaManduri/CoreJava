package com.ExceptionHandling;

public class Test_141 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("getMessage() method output");
			System.out.println(ae.getMessage());
			System.out.println();
			
			System.out.println("toString() method output");
			System.out.println(ae.toString());
			System.out.println();
			
			System.out.println("printStackTrace() method outpur");
			ae.printStackTrace();
			System.out.println();
			
			System.out.println("JVM default output");
			throw ae;
		}
		

	}

}
