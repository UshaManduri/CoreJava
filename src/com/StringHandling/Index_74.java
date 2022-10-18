package com.StringHandling;

public class Index_74 {
	public static void main(String[] args) {
		String s1 = "Java Progr Lang";
		System.out.println(s1.length());
		System.out.println();
		
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println();
		
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.lastIndexOf('A'));
		System.out.println();
		
		System.out.println(s1.indexOf("Progr"));
		System.out.println(s1.lastIndexOf("Progr"));
		System.out.println();
		
		System.out.println(s1.indexOf('a',1));
		System.out.println(s1.lastIndexOf('a', 1));
		System.out.println();
		
		System.out.println(s1.indexOf('a', 0));
		System.out.println(s1.lastIndexOf('a', 0));
		System.out.println();
		
		System.out.println(s1.indexOf('a', 30));
		System.out.println(s1.lastIndexOf('a', 30));
		System.out.println();
		
		System.out.println(s1.indexOf('a', -5));
		System.out.println((s1.lastIndexOf('a',-5)));
		System.out.println();
		
		String s2 = "javaHariKri";
		System.out.println(s1.indexOf("hari"));
		System.out.println();
		
		String s3 = s2.toLowerCase();
		System.out.println(s3.indexOf("hari"));
		System.out.println(s2);
		System.out.println(s3);
	}
}
