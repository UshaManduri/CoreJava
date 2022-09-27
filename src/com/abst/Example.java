package com.abst;

abstract class Example {
	abstract void m1();
	static int a = 10;
	int x = 20;
	
	static {
		System.out.println("Ex SB");
	}
	{
		System.out.println("Ex NSB");
	}
	Example(){
		System.out.println("Ex C");
	}
	static void m2() {
		System.out.println("Ex SM");
	}
	void m3() {
		System.out.println("Ex NSM");
	}
	public static void main(String[] args) {
		System.out.println("Ex main");
		System.out.println("a: "+ a);
		m2();
	//	Example e = new Example();
	//	e.m3();
	}
}
