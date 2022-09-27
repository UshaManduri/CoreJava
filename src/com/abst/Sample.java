package com.abst;

public class Sample extends Example{
	static int b = 30;
	int y = 40;
	
	static {
		System.out.println("S SB");
	}
	{
		System.out.println("S NSB");
	}
	Sample(){
		System.out.println("S C");
	}
	static void m4() {
		System.out.println("S SM");
	}
	void m5(){
		System.out.println("S NSM");
	}
	void m1() {
		System.out.println("m1 in Sample");
	}
	public static void main(String[] args) {
		System.out.println("\n  Sample main");
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		m2();
		m4();
		System.out.println();
		Sample s = new Sample();
		s.m1();
		s.m3();
		s.m5();
	}
}
