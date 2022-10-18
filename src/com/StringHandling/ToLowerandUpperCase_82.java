package com.StringHandling;

public class ToLowerandUpperCase_82 {

	public static void main(String[] args) {
		String s1 = "aBc";
		System.out.println(s1);
		System.out.println();
		
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
		
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();
		
		s1=s1.toUpperCase();
		System.out.println(s1);
		String s4=s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1==s4);
		System.out.println();
		
		String s5 = s1.toUpperCase();
		String s6 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s1==s5);
		System.out.println(s5==s6);
		System.out.println(s1.equals(s5));
		System.out.println(s5.equals(s6));
		System.out.println();
		
		String str1 = null;
//		System.out.println(str1.toUpperCase());
		
		String str2 = "null";
		System.out.println(str2.toUpperCase());
		
		String[] sa = new String[5];
		sa[0] = "Usha";
		sa[2] ="Usha";
		
		System.out.println(sa[0].toUpperCase());
		System.out.println(sa[2].toLowerCase());
	}

}
