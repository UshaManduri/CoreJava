package com.InnerClasses;

public class Example_189 {
	static class A{
		private int y = 20;
		static void m1() {System.out.println("inner class SM m1");}
		void m2() {System.out.println("inner class NSM m2");}
		}
	public static void main(String[] args) {
		A.m1();
		A a = new A();
		a.toString();
		System.out.println(
				a.y);
		a.m2();
	}
}
