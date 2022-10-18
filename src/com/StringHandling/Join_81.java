package com.StringHandling;

public class Join_81 {
	public static void main(String[] args) {
		String s12 = String.join("-", "a", "b","c","d","e","f");
		String s13 = String.join("","a", "b","c","d");
		String s14 = String.join("-");
		String s15 = String.join("-","a");
		String s16 = String.join("-", "a","b");
		String s17 = String.join("-", "a", new StringBuffer("b"), new StringBuffer("c"));
		System.out.println("s12: " +s12);
		System.out.println("s13: "+s13);
		System.out.println("s14: "+s14);
		System.out.println("s17: "+s17);
		System.out.println();
		
		//performance
		String s18 = "p";
		String s19 = s18 +"q";
		String s20 = s18.concat("q");
		
		//concatenating more strings
		String s21 = "a"+"b"+"c"+"d";
		String s22 = "a".concat("b").concat("c").concat("d");
		String s23 = String.join("", "a","b","c","d");
		String s24 = String.join("-", "a","b","c","d");
		
		System.out.println(s21);
		System.out.println(s22);
		System.out.println(s23);
		System.out.println(s24);
		
	}
}
