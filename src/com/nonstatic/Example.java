package com.nonstatic;

public class Example {
	int x = 10;
	int y = 20;
	void m1() {
		Example e1 = new Example();
		e1.x = 50;
		e1.y = 60;
	}
	public static void main(String[] args) {
		Example e2 = new Example();
		System.out.println(e2.x + "..." + e2.y);
		e2.m1();
		System.out.println(e2.x + "..." + e2.y);
	}
}
