package com.StringHandling;

public class ContentEquals_73 {
	/*
	 * public static void main(String[] args) { String s1 = new String("a"); String
	 * s2 = new String("a"); StringBuffer sb1 = new StringBuffer("a");
	 * 
	 * System.out.println(s1.equals(s2)); System.out.println(s1.contentEquals(s2));
	 * System.out.println();
	 * 
	 * System.out.println(s1.equals(sb1));
	 * System.out.println(s1.contentEquals(sb1)); System.out.println(); //
	 * System.out.println(sb1.contentEquals(s1)); // System.out.println(s1==sb1); }
	 */
	
	public static void main(String[] args) {
		String s1 = "abcdef";
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(3));
	//	System.out.println(s1.charAt(6));
		System.out.println(s1.charAt(0));
	//	System.out.println(s1.charAt(-1));
	//	System.out.println(s1.charAt('a'));
	}
}
