package com.StringHandling;

public class Equals_71 {
	public static void main(String[] args) {
		String s1 = "a"; String s2 = "a";
		String s3 = new String("a");
		String s4 = new String("a");
		
		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(sb1==sb2);
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(sb1.equals(sb2));
		
		String s5 = "a"; String s6 = "A";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		Example_71 e1 = new Example_71(5);
		Example_71 e2 = new Example_71(5);
		Example_71 e3 = new Example_71(6);
		Example_71 e4 = e3;
		System.out.println(e1==e2);
		System.out.println(e2==e3);
		System.out.println(e3==e4);
		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e4));
		
		Sample_71 S = new Sample_71();
//		System.out.println(e1==S);
		System.out.println(e1.equals(s1));
		System.out.println(s1.equals(e1));
		System.out.println(s1==null);
		System.out.println(s1.equals(null));
		System.out.println(e1==null);
		System.out.println(e1.equals(null));
	}
}
