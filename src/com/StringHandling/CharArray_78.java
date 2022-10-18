package com.StringHandling;

import java.util.Arrays;

public class CharArray_78 {

	public static void main(String[] args) {
		String s1 = "Har";
		char[] ch1 = s1.toCharArray();
		byte[] b1 = s1.getBytes();
		
		System.out.println("s1: " +s1);
		System.out.println("ch1: " +Arrays.toString(ch1));
		System.out.println("b1: "+ Arrays.toString(b1));
	}

}
