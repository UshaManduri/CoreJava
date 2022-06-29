package com.nonstatic;

public class Eexample {
	int x = 10, y=20;
	void m1(Eexample e) {
		System.out.println("\te: "+e);
		e = new Eexample();
		System.out.println("\te: "+e);
	}
	public static void main(String[] args) {
		Eexample e1 = new Eexample();
		Eexample e2 = new Eexample();
		System.out.println("e2: " +e2);
		e1.m1(e2);
		System.out.println("e2: "+e2);
	}
}
