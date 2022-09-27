package com.ArrayVarArg;

public class Test_166 {
	static Example_166[] e1 = new Example_166[5];
	Example_166[] e2 = {new Example_166(), new Example_166()};
	
	public static void main(String[] args) {
		System.out.println("Test main");
		Example_166[] e3 = new Example_166[2];
		
		System.out.println("e3 array object is created");
		
		e1[1] = new Example_166();
		e3[1] = new Example_166();
		
		System.out.println(e1[1].x);
//		System.out.println(e2[1].x);
		System.out.println(e3[1].x);
		
		Test_166 t = new Test_166();
		System.out.println(t.e2[1].x);
		
		System.out.println(e1[0].x);
		System.out.println(t.e2[0].x);
		System.out.println(e3[0].x);
		System.out.println(t.e1[1].y);
	}
}
