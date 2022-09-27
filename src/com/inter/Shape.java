package com.inter;

public interface Shape {
	
	double PI = 3.14;
	
	void findArea();
	void findPerimeter();
	
	static void m1() {
		System.out.println("I am in static method of shape interface");
	}
	
	default void m2() {
		System.out.println("I am in default method of shape interface");
	}

}
