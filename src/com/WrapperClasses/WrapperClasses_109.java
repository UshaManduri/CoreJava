package com.WrapperClasses;

public class WrapperClasses_109 {
	public static void main(String[] args) {
		//parse string objext = primitive data type conversion
		//1. PSO => WCO => PDT
		//2. PSO => PDT
		int i1 = Integer.parseInt("10");
	//	int i2 = Integer.parseInt("10.0");
		byte b2 = Byte.parseByte("40");
		float f1 = Float.parseFloat("10");
		float f2 = Float.parseFloat("898.787F");
		
		boolean bo1 = Boolean.parseBoolean("Ture");
		System.out.println(bo1);
		boolean bo2 = Boolean.parseBoolean("False");
		System.out.println(bo2);
		boolean bo3 = Boolean.parseBoolean("Usha");
		System.out.println(bo3);
		boolean bo4 = Boolean.parseBoolean("TRUE");
		System.out.println(bo4);
		
		//wrapper class object ==>string object conversion
		Integer io = new Integer(299);
		System.out.println(io);
		String s =io.toString();
		System.out.println(s);
		
		//primitive data type ==> parse string object
		String s1 = "10";
		String s3 = Integer.toString(10);
		String s4 = Byte.toString((byte)10);
		
		String s6 = Integer.toString('a');
		String s7 = Integer.toString(10);
		
		String s9 = Float.toString(20);
		String s10 = Float.toString(40L);
		
		String s14 = Boolean.toString(false);
		String s15 = Boolean.toString(true);
 //		String s16 = Boolean.toString(TRUE);
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s9);
		System.out.println(s10);
		System.out.println(s14);
		System.out.println(s15);
	}
}
