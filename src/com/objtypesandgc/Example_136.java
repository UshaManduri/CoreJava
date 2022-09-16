package com.objtypesandgc;

public class Example_136 {
	//static ref var
	static Example_136 e1;
	static Example_136 e2;
	
	//non-static ref var
	Example_136 e3;
	Example_136 e4;
	int x = 10, y=20;
	
	public static void main(String[] args) {
		//local ref var
		Example_136 e5;
		Example_136 e6;
		
		Example_136 e7 = new Example_136();
		
		//printing var
		System.out.println(e1);
		System.out.println(e2);
		System.out.println();
		System.out.println(e7);
		
		System.out.println();
		System.out.println(e7);
		System.out.println(e7.toString());
		
		e1 = new Example_136();
		e1.e3 = new Example_136();
		e1.e3.e4 = new Example_136();
		System.out.println();
		System.out.println(e1);
		System.out.println(e1.e3);
		System.out.println(e1.e3.e4);
		System.out.println(e1.e3.e4.e4);
		System.out.println(e1.e3.e4.e3);
		System.out.println();
		System.out.println(e1.e3.e3.e3);
		System.out.println(e1.e3.e3.e1);
		System.out.println(e1.e3.e3.e2);
		System.out.println(e1.e3.e3.e1.x);
		System.out.println(e1.e3.e3.e2.x);
		System.out.println();
		System.out.println(e7.e1);
		System.out.println(e1.e1);
//		System.out.println(e1.e7);
		System.out.println(e7);
		
		e1 = null;
	}
}
