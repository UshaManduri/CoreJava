package com.oneb.overloading;

public class B_83 extends A_83{
//	int y = m1();
//	int m1() {
//		System.out.println("B m1");
//		return 60;
//	}
//	int y = m1();
//	static int m1() {
//		System.out.println("B m1");
//		return 60;
//	}
//	int x;
//	int m1() {
//		System.out.println("B m1");
//		x=70;
//		return 80;
//	}
	static int x;
	static int m1() {
		System.out.println("B m1");
		x=70;
		return 80;
	}
}
