package com.onea.variables;

public class Test {
	static int x = 10;
	public static void main(String[] args) {
		System.out.println(x);
		//primitive variables
		int p = 50;
		int q = m1();
		//referenced variables
		String s1 = "a";
		String s2 = new String("a");
		
		//object creation
		Example e = new Example();
		System.out.println(e.toString());
		System.out.println(e);
	}
	static int m1() {
		return 1;
	}
	
	public String toString() {
		return "Usha";
	}
}
