package com.Preparation;

import java.util.Arrays;

public class CharArrayEx {

	// converting string to char array --> toCharArray
	// converting string to byte array --> getBytes
	public static void main(String[] args) {
		String s1 = "Java";
		char[] ch1 = s1.toCharArray();
		byte[] b1 = s1.getBytes();
		
		System.out.println("s1= "+s1);
		System.out.println("ch1= "+ Arrays.toString(ch1));
		System.out.println("b1= "+Arrays.toString(b1));
		
		
		System.out.println("ValueOf method string");
		// valueOf  -->  converting any datatype to string
		int a = 19;
		String str = String.valueOf(a);
		System.out.println("String str= "+str);
	
		//concatenation  -->  which adds 2 strings
		String s2 = "wednes";
		String s3 = s2.concat("day");
		System.out.println("concat= "+s3);
		
		// join with delimeter  -->
		String s4 = String.join(":", "a","b","c","d","e");
		System.out.println("join delimeter: "+s4);
		
		
		// string to uppercase and lowercase
		String s5 = "oops concept";
		System.out.println(s5.toUpperCase());

		String s6 = "ALL the BEST";
		System.out.println(s6.toLowerCase());
		
		//String replace method
		String s7 = "abc abc abc";
		String rep = s7.replace('a', 'k');
		System.out.println("replace method= "+rep);
		
		
		//String trim method --> trims the empty spaces in the begining & end
		String s8 = " abc ";
		String trim = s8.trim();
		System.out.println("trim ="+trim);
		
		System.out.println("stripLeading:"+s8.stripLeading());
		System.out.println("stripTrailing:"+s8.stripTrailing());
	
		//intern method
		String s9 = "Java";
		String s10 = s9.intern();
		String s10a = s6.intern();
		System.out.println(s6==s10a);		// true ?
		System.out.println("intern="+s9==s10);// false ?
		System.out.println(s9==s10);
		
		String s11 = new String("PA");
		String s12 = s11.intern();
		System.out.println(s11==s12);
	}
}
