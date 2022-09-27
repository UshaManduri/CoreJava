package com.InnerClasses;

public class Example_188 {
	static int a = 10;
	int x = 20;
	private int y = 30;
	
	static class A{
		public static void main(String[] args) {
			System.out.println(a);
//			System.out.println(x);
	//		System.out.println(y);
			
			Example_188 e = new Example_188();
			System.out.println(e.a);
			System.out.println(e.x);
			System.out.println(e.y);
		}
	}
}
