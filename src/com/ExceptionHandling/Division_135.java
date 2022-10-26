package com.ExceptionHandling;

public class Division_135 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException aiob){
			System.out.println("Please pass atleast 2 integer values");
		}
		catch(NumberFormatException nfe) {
			System.out.println("Please pass only integer values");
		}
		catch(ArithmeticException ae) {
			System.out.println("Please donot pass 2nd value as 0");
		} 
	}

}
