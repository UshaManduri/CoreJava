package com.FundamentalClasses;

public class IdentiyHashCodeTest {
	public static void main(String[] args) {
		Example_29 e1 = new Example_29(5);
		Example_29 e2 = new Example_29(5);
		Example_29 e3 = new Example_29(6);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println();
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));
		System.out.println();
		System.out.println(e1.JVMHC());
		System.out.println(e2.JVMHC());
		System.out.println(e3.JVMHC());
	}
}
