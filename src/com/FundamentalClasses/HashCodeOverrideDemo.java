package com.FundamentalClasses;

public class HashCodeOverrideDemo {
	public static void main(String[] args) {
		Example_27 e1 = new Example_27();
		Example_27 e2 = new Example_27();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
