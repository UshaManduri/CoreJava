package com.oneb.overloading;

public class A_77_2 {
	void m1(Object obj) {
		System.out.println("Obj arg");
	}
	void m1(Example e) {
		System.out.println("Example arg");
	}
	void m1(Sample s) {
		System.out.println("Sample arg");
	}
	void m1(Test t) {
		System.out.println("Test arg");
	}
	public static void main(String[] arg) {
		A_77_2 a = new A_77_2();
		a.m1(new Example());
		a.m1(new Sample());
		a.m1("abc");
		a.m1(new Test());
	//	a.m1(null);
		a.m1((Sample)null);
		a.m1((Test)null);
	}
}
