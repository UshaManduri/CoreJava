package com.onea.datatypes;

public class Example {
//	public static void main(String [] args) {
//		System.out.println(3.0f == 3.0);
//		System.out.println(3.5f == 3.5);
//		System.out.println(3.3f == 3.3);
//		System.out.println(3.7f == 3.7);
//	}
	static void m1(int a) {
		System.out.println("Before if");
		if (a == 10) {
			System.out.println("In if");
			return;
		}
		System.out.println("after if");
	}
	static int m2(int a) {
		System.out.println("m2 Before if");
		if(a == 10) {
			System.out.println("in if");
			return a + 10;
			}
		System.out.println("After if");
		System.out.println("Hi");
		return 50;
	}
	public static void main(String[] args) {
		m1(10);
		m1(20);
		m2(10);
		m2(20);
	}
}
