package com.inter;

public class Square_112 implements Shape_111{
	private double s;
	
	public Square_112(double s) {
		this.s = s;
	}
	public void area() {
		System.out.println("Square area: "+(s*s));
	}
	public void perimeter() {
		System.out.println("Square perimeter: "+(4*s));
	}
	public void printS() {
		System.out.println("s: "+ s);
	}
}
