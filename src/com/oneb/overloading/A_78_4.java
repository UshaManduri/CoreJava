package com.oneb.overloading;

public class A_78_4 {
//	void m1(Object obj) {
//		System.out.println("obj param");
//	}
	
	void m1(Foo_78 f) {
		System.out.println("foo param");
	}
	void m1(Alpha a) {
		System.out.println("Alpha param");
	}
	public static void main(String[] args) {
		A_78_4 a = new A_78_4();
	//	a.m1(new Beta());
	//	a.m1(null);
	}
}
