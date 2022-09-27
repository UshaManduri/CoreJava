package com.oneb.overloading;

public class Sample_92 extends Example_92{
	static {
		System.out.println("SB");
		m1();
		
		Sample_92 s = new Sample_92();
		s.m2();
	}
	static void m1() {
		System.out.println("m1");
	}
	void m2() {
		System.out.println("m2");
	}
}
