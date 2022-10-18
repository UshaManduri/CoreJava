package com.StringHandling;

public class Concat_80 {
	public static void main(String[] args) {
		String s1 = "Har";
		String s2 = s1.concat("kri");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		String s3 = "a";
		s3.concat("b");
		System.out.println("s3: "+s3);
		System.out.println();
		
		String s4 = s3.concat("c");
		System.out.println("s3:" +s3);
		System.out.println("s4: "+s4);
		System.out.println(s3==s4);
		System.out.println();
		
		s3=s3.concat("d");
		System.out.println("s3:" +s3);
		
		String s5 = s3.concat("");
		System.out.println("s3: "+s3);
		System.out.println("s5: "+s5);
		System.out.println(s3==s5);
		System.out.println();
		
		String s6 = "";
		String s7 = s6.concat(s3);
		System.out.println("s6: "+s6);
		System.out.println("s7: "+s7);
		System.out.println(s6==s7);
		System.out.println();
		
		String s8="p";
		String s9 = s8 +"q";
		String s10 = s8 +"";
		String s11 = "" + s8;
		
		System.out.println("s8: "+s8);
		System.out.println("s9: " +s9);
		System.out.println("s10: " +s10);
		System.out.println("s11:" +s11);
		System.out.println(s8==s9);
		System.out.println(s8 == s10);
		System.out.println(s10 == s11);
		
		String s12 = "a";
		String s13 = "b";
		String s14 = "c";
		
		String s15 = "abc";
		String s16 = "a" +"b" +"c";
		String s17 = "a".concat("b").concat("c");
		
		System.out.println(s15==s16);
		System.out.println(s15==s17);
		
		String s1s ="a";
		String s18 = s1s.concat("b");
		String s19 = s1s.concat("b");
		System.out.println(s18==s19);
		System.out.println();
		
		String s20 = s1s.concat("");
		String s21 = s1s.concat("");
		System.out.println(s1s == s20);
		System.out.println(s1s ==s21);
		System.out.println(s20==s21);
		
		
	}
	
}
