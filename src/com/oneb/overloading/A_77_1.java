package com.oneb.overloading;

public class A_77_1 {
	void m1(Example e) {
		System.out.println("Ex atg");
	}
	void m1(Test s) {
		System.out.println("Test arg");
	}
	public static void main(String[] rgs) {
		A_77_1 a = new A_77_1();
		a.m1(new Example());
		a.m1(new Sample());
//		a.m1("abc");
		a.m1(new Test());
	//	a.m1(null);
		a.m1((Sample)null);
		a.m1((Test)null);
	}
}
