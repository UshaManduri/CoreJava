package com.StringHandling;

public class Replace_83 {

	public static void main(String[] args) {
		String s1 ="abc abc abc";
		System.out.println(s1);
		s1.replace('a','b');
		System.out.println(s1);
		System.out.println();
		
		String s2=s1.replace('a','b');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		String s3=s1.replaceFirst("a","b");
		System.out.println(s1);
		System.out.println(s3);
		System.out.println();
		
//		s1=s1.replace('a','d');
//		System.out.println(s1);
//		System.out.println();
//		
		String s4 = s1.replace("a","e");
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1==s4);
		System.out.println();
		
		String s8 = s1.replaceAll("a", "O");
		System.out.println(s8);
		
		String s12="abc$bbc?cbc";
		String s13 = s12.replaceAll("\\$", " ");
		String s14 = s13.replaceAll("\\?", "@");
		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);
		

	}

}
