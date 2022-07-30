package com.oneb.overloading;

public class Example_86 {
//	Example_86(){
//		System.out.println("E no-arg C");
//	}
//	Example_86(int a){
//		System.out.println("E int-arg C");
//	}
//	Example_86(String s){
//		System.out.println("E s-arg C");
//	}
	Example_86(){
		this(10);
		System.out.println("no-arg C");
	}
	Example_86(int a){
		this("abc");
		System.out.println("int-arg C");
	}
	Example_86(String s){
		System.out.println("S-arg C");
	}
	public static void main(String[]args) {
		Example_86 e1 = new Example_86();
		Example_86 e2 = new Example_86(10);
		Example_86 e3 = new Example_86("abc");
	}
}
