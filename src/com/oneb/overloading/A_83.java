package com.oneb.overloading;

public class A_83 {
	
//	int x = m1();
//	int m1() {
//		System.out.println("A m1");
//		return 50;
//	}
//	
//	int m2() {
//		System.out.println("A m2");
//		return 100;
//	}
//	int x = m1();
//	static int m1() {
//		System.out.println("A m1");
//		return 50;
//	}
//	int x = m1();
//	int m1() {
//		System.out.println("A m1");
//		x=50;
//		return 60;
//	}
	static int x = m1();
	static int m1() {
		System.out.println("A m1");
		x=50;
		return 60;
	}
}
