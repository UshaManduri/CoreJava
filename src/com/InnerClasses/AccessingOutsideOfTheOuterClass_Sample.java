package com.InnerClasses;

public class AccessingOutsideOfTheOuterClass_Sample {
	public static void main(String[] args) {
		System.out.println("a: "+AccessingOutsideOfTheOuterClass.A.a);
		
		AccessingOutsideOfTheOuterClass.A a1 = new AccessingOutsideOfTheOuterClass.A();
		
		System.out.println("x: "+ a1.x);
// 		System.out.println("y: "+ a1.y);
	
	}
}
