package com.nonstatic;

public class Eeexample {
	int x = 10;
	int y = 20;
	void m1(int a, int b) {
		x = a;
		y = b;
	}
	void m2(int x, int y) {
		x=x;
		y=y;
	}
	void m3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		Eeexample e1 = new Eeexample();
		System.out.println(e1.x + "..." + e1.y);
		e1.m1(30, 40);
		System.out.println(e1.x + "..." + e1.y);
		e1.m2(50, 60);
		System.out.println(e1.x + "..." + e1.y);
		e1.m3(70, 80);
		System.out.println(e1.x + "..." + e1.y);
	}
}
