package com.nonstatic;

public class Example2 {
	int x = 10;
	int y = 20;
	
	void m1(Example2 e) {
		System.out.println("original values");
		System.out.println(x + ", " + y);
		x=5;
		y=6;
		System.out.println("after mod'n");
		System.out.println(x + ","+ y);
	}
	public static void main(String[] args) {
		Example2 e1 = new Example2();
		Example2 e2 = new Example2();
		System.out.println("e1 obj val b4 calling m2() method");
		System.out.println(e1.x +", "+ e1.y);
		e1.m1(e2);
		System.out.println("e1 obj val after calling m2() method");
		System.out.println(e1.x+", " + e1.y);
		System.out.println("e2 obj val after calling m2() method");
		System.out.println(e2.x+", " + e2.y);
	}
}
