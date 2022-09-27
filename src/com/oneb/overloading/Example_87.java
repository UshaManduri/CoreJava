package com.oneb.overloading;

public class Example_87 {
	int x = m1();
	{
		System.out.println("NSB");
	}
	int m1() {
		System.out.println("m1: x");
		return 10;
	}
	Example_87(){
		this(10);
		x=50;
		System.out.println("no-arg C");
	}
	Example_87(int a){
		this("abc");
		x=60;
		System.out.println("int-arg C");
	}
	Example_87(String s){
		x=70;
		System.out.println("S-arg C");
	}
	public static void main(String[] args) {
		Example_87 e1 = new Example_87();
		System.out.println("e1.x: " +e1.x);
		Example_87 e2 = new Example_87(10);
		System.out.println("e2.x: "+e2.x);
		Example_87 e3 = new Example_87("abc");
		System.out.println("e3.x: "+ e3.x);
	}
}
