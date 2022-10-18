package com.StringHandling;

public class AppendTest_89 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("sb cap: "+sb.capacity());
		System.out.println("sb len: "+sb.length());
		System.out.println("sb char: "+sb);
		System.out.println();
		
		sb.append("a");
		System.out.println("sb cap: "+sb.capacity());
		System.out.println("sb len: "+sb.length());
		System.out.println("sb char: "+sb);
		System.out.println();

		sb.append(10);
		System.out.println("sb cap: "+sb.capacity());
		System.out.println("sb len: "+sb.length());
		System.out.println("sb char: "+sb);
		System.out.println();

		Pqr_89 p1 = new Pqr_89();
		sb.append(p1);
		System.out.println("sb cap: "+sb.capacity());
		System.out.println("sb len: "+sb.length());
		System.out.println("sb char: "+sb);
		System.out.println();

//		sb.append(null);
		sb.append((String)null);
		System.out.println("sb cap: "+sb.capacity());
		System.out.println("sb len: "+sb.length());
		System.out.println("sb char: "+sb);

		sb.append((char[])null);
		System.out.println();
	}
}
