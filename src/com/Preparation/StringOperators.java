package com.Preparation;

public class StringOperators {

	public static void main(String[] args) {

		String s1 = "Java Training";

		String s2 = new String(s1);

		String s3 = new String("abc");

		String s3a = s3;
		
		
		
		System.out.println("lenght of string s1= "+s1.length());

		// hashcode
		System.out.println("hashcode: "+ s1.hashCode());
		
		//toString
		System.out.println("to String: "+ s1.toString());
		System.out.println("to String: "+ s2.toString());
		System.out.println("to String: "+ s1);
		
		//equals
		System.out.println("String equals method");
		String s4 = "a";
		String s5 = "a";
		String s6 = new String ("a");
		String s7 = new String ("a");
		
		System.out.println(s4==s5);
		System.out.println(s4==s6);
				
		System.out.println("string equalsIgnore case method");
		
		String s8 = "b";
		String s9 = "B";
		System.out.println(s8.equals(s9));
		System.out.println(s8.equalsIgnoreCase(s9));
		
		String s10 = "a";
		String s11 = "a";
		String s12 = "A";
		System.out.println(s10.compareTo(s11));
		System.out.println(s10.compareTo(s12)); //returns the difference between the ascii values
		
	}
}
