package com.StringHandling;

public class SubString_76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java Prog Lang";
		
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,11));
		System.out.println();
		
		System.out.println(s1.substring(6,7));
//		System.out.println(s1.substring(12,5));
//		System.out.println(s1.substring(-1,12));
//		System.out.println(s1.substring(4,27));
		System.out.println();
		
		String s2 = "Java Prog Lang";
		System.out.println(s2.substring(5,12));
		
		int start = s2.indexOf("Prog");
		int end = start +7;
		System.out.println(s2.substring(start,end));
		
	}

}
