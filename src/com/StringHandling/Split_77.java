package com.StringHandling;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Split_77 {

	public static void main(String[] args) {
		String s1 = "Hari NIT";
		System.out.println(s1);
		System.out.println();
		
		String[] sa1 = s1.split(" ");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();
		
		String[] sa2 = s1.split("a");
		System.out.println(sa2.length);
		System.out.println(Arrays.toString(sa2));
		System.out.println();
		
		String[] sa3 = s1.split("b");
		System.out.println(sa3.length);
		System.out.println(Arrays.toString(sa3));
		System.out.println();
		
		String[] sa4 = s1.split("A");
		System.out.println(sa4.length);
		System.out.println(Arrays.toString(sa4));
		System.out.println();
		
		s1="abc abc abc";
		String[] sa7 = s1.split("c");
		System.out.println(sa7.length);
		System.out.println(Arrays.toString(sa7));
		System.out.println();
		
		String[] sa8 = s1.split("a");
		System.out.println(sa8.length);
		System.out.println(Arrays.toString(sa8));
		System.out.println();
		
		String[] sa9 = s1.split("abc");
		System.out.println(sa9.length);
		System.out.println(Arrays.toString(sa9));
		System.out.println();
		
		String[] sa10 = s1.split("abc abc abc");
		System.out.println(sa10.length);
		System.out.println(Arrays.toString(sa10));
		System.out.println();
		
		s1="abc.txt";
		String[] sa11 = s1.split(".");
		System.out.println(sa11.length);
		System.out.println(Arrays.toString(sa11));
		System.out.println();
		
		String s2 = "aa";
		String[] sa14 = s2.split("a");
		System.out.println(sa14.length);
		System.out.println(Arrays.toString(sa14));
		System.out.println();
		
		String s3 = "aabc aabc";
		String[] sa15 = s3.split("1");
		System.out.println(sa15.length);
		System.out.println(Arrays.toString(sa15));
		System.out.println();

	}

}
