package com.StringHandling;

public class Insert_90 {
	public static void main(String[] args) {
		StringBuffer sb2 = new StringBuffer("3234");
		System.out.println("sb chars: "+sb2);
		System.out.println();
		
		sb2.insert(2,'-');
		System.out.println("sb chars: "+sb2);
		System.out.println();
		
		sb2.insert(5,'-');
		System.out.println("sb chars: "+sb2);
		System.out.println();
		
		sb2.insert(sb2.length()-1, ',');
		sb2.insert(sb2.length()-1, (String)null);
		sb2.insert(sb2.length(), (String)null);
		System.out.println("sb chars: "+sb2);
		System.out.println();
		
//		sb2.insert(sb2.length(), (char[]));
//		sb2.insert(20,"b");
//		sb2.insert(-5,"b");
		
		sb2.insert(0,"b");
		System.out.println("sb chars: "+sb2);		
	}
}
