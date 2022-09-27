package com.objtypesandgc;

public class Test_140 {
	public static void main(String[] args) {
		Example_140 e1 = new Example_140();
//		System.out.println("x: " + e.x);
//		System.out.println("y: "+ e.y);
		Example_140 e2 = new Example_140();
		e1.m1(e2);

		System.out.println(e1.x + ".."+e1.y);
		System.out.println(e2.x +".."+e2.y);
			e1.m1(new Example_140());
		System.out.println(e1.x+".."+e1.y);
		
		new Example_140().m1(new Example_140());
//		e.m1();
//		System.out.println("x: "+ new Example_140().x);
	}
}
