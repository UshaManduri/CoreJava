package com.inter;

public class Circle_112 implements Shape_111{
	public static final float pi = 3.14f;
	private double radius;
	public Circle_112(double radius) {
		this.radius = radius;
	}
	public void area() {
		System.out.println("Circle area: "+(pi*radius*radius));
	}
	public void perimeter() {
		System.out.println("Circle perimeter: "+(2*pi*radius));
	}
	public void printRadius() {
		System.out.println("radius: "+radius);
	}
}
