package com.StringHandling;

public class StartsWithEndsWith_75 {
	public static void main(String[] args) {
		String s1 = "abc bbc cbc";
		System.out.println(s1.startsWith("abc"));
		System.out.println(s1.endsWith("abc"));
		System.out.println(s1.startsWith("cbc"));
		System.out.println(s1.endsWith("cbc"));
		System.out.println(s1.startsWith("Abc"));
		System.out.println(s1.endsWith("Cbc"));
		System.out.println(s1.startsWith("abc "));
		System.out.println(s1.endsWith("abc "));
		System.out.println(s1.startsWith("abc bbc cbc"));
		System.out.println(s1.endsWith("abc bbc cbc"));   //????????????????????????????
		System.out.println(s1.startsWith("bbc cbc"));
		System.out.println(s1.endsWith("bbc cbc"));
	}
}
