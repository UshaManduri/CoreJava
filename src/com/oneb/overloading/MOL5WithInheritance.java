package com.oneb.overloading;

public class MOL5WithInheritance {
	public static void main(String[] args) {
		B_80 b = new B_80();
//		b.m1(50);
//		b.m1('a');
//		b.m1(50L);
//		System.out.println();
//		A_80 a = new B_80();
//		b.m1(50);
//		b.m1('a');
//		b.m1(50L);
		b.m1("a");
		b.m1(10);
		System.out.println();
		A_80 a = new B_80();
		b.m1("a");
		b.m1(10);
	}
}
