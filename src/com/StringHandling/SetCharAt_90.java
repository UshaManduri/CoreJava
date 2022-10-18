package com.StringHandling;

public class SetCharAt_90 {

	public static void main(String[] args) {
		StringBuffer sb6 = new StringBuffer("abc bbc, avv");
		System.out.println("sb chars: "+sb6);
		
		sb6.setCharAt(3,'-');
		System.out.println("sb chars: "+sb6);
		
		sb6.setCharAt(5,'B');
		System.out.println("sb chars: "+sb6);

	}

}
