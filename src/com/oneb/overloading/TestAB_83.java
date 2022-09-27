package com.oneb.overloading;

public class TestAB_83 {
	public static void main(String[] args) {
		B_83 b = new B_83();
		A_83 a = b;
		System.out.println("x: "+b.x);
		System.out.println("y: "+b.x);
	}
}
