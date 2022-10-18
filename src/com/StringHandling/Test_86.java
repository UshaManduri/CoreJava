package com.StringHandling;

import java.util.Scanner;

public class Test_86 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		
		String str = s.nextLine();
		String result = StringWordsReverse_86.reverseStringWords(str);
		
		System.out.println("oringinal string: " +str);
		System.out.println("reverse string: " +result);
	}
}
