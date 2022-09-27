package com.oneb.overloading;

public class SubClass extends SuperClass{
	SubClass(){
		this(10);
		System.out.println("SubClass no-arg");
	}
	SubClass(int a){
		this("abc");
		System.out.println("SubClass int-arg");
	}
	SubClass(String s){
		
		System.out.println("SubClass string-arg");
	}
	
	public void test() {
		
	}
}
