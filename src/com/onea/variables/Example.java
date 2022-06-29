package com.onea.variables;

public class Example {
	//int x = 10;
	//int y = 20;
	static void m1(int p) {
		int q = 10;
		if (p == 10) {
			int r = 20;
			System.out.println(p);
			System.out.println(q);
			System.out.println(r);
		}
		System.out.println(p);
		System.out.println(q);
	}
	public static void main (String[] args) {
		m1(10);
		m1(20);
	}
}
