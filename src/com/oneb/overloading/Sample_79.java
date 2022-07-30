package com.oneb.overloading;

public class Sample_79 extends Example_79 {
	void add(int x, int y) {
		System.out.println("S i,i");
	}
	float add(float a, int b) {
		System.out.println("S f, i");
		return a+b;
	}
	String add(String s1, double d) {
		System.out.println("S s,d");
		return s1 + d;
	}
}
