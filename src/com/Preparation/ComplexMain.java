package com.Preparation;

public class ComplexMain {
	
	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(10, 15);
		Complex c3 = c1;
		
//		if(c1==c2) 
//			System.out.println("equal");
//		else
//			System.out.println("not equal");

		
		if(c1==c3) 
			System.out.println("equal");
		else
			System.out.println("not equal");

		
		
		if (c1.equals(c2))
			System.out.println("equal: equal");
		else
			System.out.println("equal: not equal");
	}
}
