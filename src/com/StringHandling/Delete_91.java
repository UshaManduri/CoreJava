package com.StringHandling;

public class Delete_91 {

	public static void main(String[] args) {
		StringBuffer sb3 = new StringBuffer("October 17th is our Engagement Anniversary");
		System.out.println("sb1 char: "+sb3);
		
		sb3.delete(5,12);
		System.out.println("sb2 char: "+sb3);
		
		sb3=new StringBuffer("October 17th is our Engagement Anniversary");
		sb3.delete(5,13);
		System.out.println("sb3 char: "+sb3);
		
		sb3.deleteCharAt(4);
		System.out.println("sb4: "+sb3);
		
		StringBuffer sb4 = new StringBuffer("abcdefgh");
		System.out.println("sb chars: "+sb4);
		sb4.deleteCharAt(1);
		sb4.deleteCharAt(2);
		System.out.println("sb: "+sb4);
		System.out.println();
		sb3.deleteCharAt(20);
		System.out.println(sb3);

	}

}
