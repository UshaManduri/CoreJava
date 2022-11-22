package com.java8;

public class LambdaExpressionEx {
	public static void main(String[] args) {
		int width = 10;
		
		//without lambda
		Drawble d = new Drawble() {
			public void draw() {
				System.out.println("drawing "+width);}
			};
			d.draw();
			
		//with lambda
		Drawble d2 = () -> {
			System.out.println("drawing "+width);
		};
		d2.draw();
		
	}
}
