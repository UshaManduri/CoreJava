package com.oneb.overloading;

public class Sample_86 extends Example_86{
	Sample_86(){
		System.out.println("S no-arg C");
	}
	Sample_86(String s){
		super("abc");
		System.out.println("S s-arg C");
	}
	public static void main(String[] args) {
		//Sample_86 s1 = new Sample_86();
		System.out.println("========");
		Sample_86 s2 = new Sample_86("abc"); 
	}
}