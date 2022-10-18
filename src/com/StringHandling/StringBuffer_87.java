package com.StringHandling;

public class StringBuffer_87 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("sb: "+sb);
		System.out.println("sb1 cap: "+sb.capacity());
		System.out.println();
		
		StringBuffer sb2 = new StringBuffer(3);
		System.out.println("sb2: " +sb2);
		System.out.println("sb2 cap: "+sb2.capacity());
		System.out.println();
		
		StringBuffer sb3 = new StringBuffer("abc");
		System.out.println("sb3: "+sb3);
		System.out.println("sb3 cap: "+sb3.capacity());
		System.out.println();
		
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb5 = new StringBuffer(sb4);
		System.out.println("sb4: "+sb4);
		System.out.println("sb5: "+sb5);
		System.out.println("sb4 cap: "+sb4.capacity());
		System.out.println("sb5 cap: "+sb5.capacity());
		System.out.println(sb4==sb5);
	}
	
}
