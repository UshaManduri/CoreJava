package com.inter;

public class Rectangle_111 implements Shape_111{
	private double l;
	private double b;
	
	public Rectangle_111(double l, double b) {
		this.l = l;
		this.b = b;
	}
	public void area() {
		System.out.println("Rec area = "+(l*b));
	}
	public void perimeter() {
		System.out.println("Rec peri = "+(2*(l+b)));
	}
	public void printlb() {
		System.out.println("l: "+l);
		System.out.println("b: "+b);
	}
}
