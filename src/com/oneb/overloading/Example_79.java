package com.oneb.overloading;

public class Example_79 {
	void add(int a, int b) {
		System.out.println("E i,i");
	}
	void add(String a, float b) {
		System.out.println("E S,f");
	}
	int add(String s1, String s2) {
		System.out.println("E S, S");
		return 10;
	}
}
