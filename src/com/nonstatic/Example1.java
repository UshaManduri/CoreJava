package com.nonstatic;

public class Example1 {
	int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		Example e1 = new Example();
		Example e2 = new Example();
		Example e3 = e2;
		e2.x = 70;
		e2.y = 80;
		System.out.println(e1.x + "..." +e1.y);
		System.out.println(e2.x + "..." +e2.y);
		System.out.println(e3.x + "..." + e3.y);
	}
}
