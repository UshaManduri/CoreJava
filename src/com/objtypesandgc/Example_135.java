package com.objtypesandgc;

public class Example_135 {
	static Example_135 e1, e2;
	Example_135 e3, e4;
	
	public static void main(String[] args) {
		Example_135 e5, e6;
		
		Example_135 e7 = new Example_135();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println();
	//	System.out.println(e3);
	//	System.out.println(e4);
		System.out.println();
		System.out.println(e7.e3);
		System.out.println(e7.e4);
		System.out.println();
	//	System.out.println(e5);
	//	System.out.println(e6);
		
		e5 = new Example_135();
		e6 = null;
		
		System.out.println(e5);
		System.out.println(e6);
	}
}
