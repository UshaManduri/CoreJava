package com.StringHandling;

public class CapacityAndSize_92 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(3);
		System.out.println("sb1 cap: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 chars: "+sb1);
		System.out.println();
		
		sb1.append("a");
		sb1.append("b");
		sb1.append("c");
		System.out.println("sb1 cap: "+sb1.capacity());
		System.out.println();
		
		sb1.append("d");
		System.out.println("sb1 cap: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 char: "+sb1);
		System.out.println();
		
		sb1.append("jklmnop");
		System.out.println("sb1 cap: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 char: "+sb1);
		System.out.println();
		
		StringBuffer sb2 = new StringBuffer(2);
		System.out.println("sb2 cap: "+sb2.capacity());
		System.out.println("sb2 size: "+sb2.length());
		System.out.println("sb2 char: "+sb2);
		System.out.println();
		
		sb1.append("abcdefgth");
		System.out.println("sb2 cap: "+sb2.capacity());
		System.out.println("sb2 size: "+sb2.length());
		System.out.println("sb2 char: "+sb2);
		System.out.println();
	}

}
