package com.StringHandling;

public class CompareTo_72 {

	public static void main(String[] args) {
		String s1="a";
		String s2 = "a";
		String s3 = "A";
		
		System.out.println("1: "+s1.equals(s2));
		System.out.println("2: "+s1.compareTo(s2));
		System.out.println();
		
		System.out.println("3: "+s1.equals(s3));
		System.out.println("4: "+s1.compareTo(s3));
		System.out.println();
		
		System.out.println("5: "+s3.equals(s1));
		System.out.println("6: "+s3.compareTo(s1));
		System.out.println();
		
		System.out.println("7: "+s1.equalsIgnoreCase(s3));
		System.out.println("8: "+s1.compareToIgnoreCase(s3));
		System.out.println();
		
		String s4 = "abc";
		String s5 = "aBc";
		System.out.println("9: "+s4.equals(s5));
		System.out.println("10: "+s4.compareToIgnoreCase(s5));
		System.out.println();
		
		String s6 = "abcdef";
		System.out.println("11: "+s4.compareTo(s6));
		System.out.println("12: "+s6.compareTo(s4));
		System.out.println();
		
		System.out.println("13: "+s5.compareTo(s6));
		System.out.println("14: "+s6.compareTo(s5));
	}

}
