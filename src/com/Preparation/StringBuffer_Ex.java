package com.Preparation;

import java.util.Arrays;

public class StringBuffer_Ex {

	public static void main(String[] args) {
		String s1 = new String("a");
		String s2 = new String ("a");
		StringBuffer sb1 = new StringBuffer("a");
		
		System.out.println(s1.equals(s2));  // TRUE: as 2 new objects & will not have new instances. it will check string constant pool area.
		System.out.println(s1 == s2);  // FALSE: as it checks reference
		
		System.out.println(s1.contentEquals(s2));  // TRUE: checks only content within
		
		System.out.println(s1.equals(sb1));
		System.out.println(s1.contentEquals(sb1));
		
		// contentEquals not applicable in String.Only in String Buffer.
	//	System.out.println(sb1.contentEquals(s1));
	
	
		System.out.println("CharAt method String");
		//charAt
		String s3 = "abcdefg";
		System.out.println(s3.charAt(0));
		System.out.println(s3.charAt(1));
		
		// index out of bound exception for charAt(-1)
		
		// indexOf
		System.out.println("indexOf method String");
		String s4 = "Java Programming Language";
		System.out.println(s4.length());
		
		System.out.println(s4.indexOf('J'));
		System.out.println(s4.indexOf('g'));
		
		//contains
		System.out.println("contains method String");
		String s5 = "datazen Technologies";
		System.out.println(s5.contains("zen"));
		System.out.println(s5.contains("sen"));
	
		//startswith and endswith
		System.out.println("startswith and endswith");
		String s6 = "ksdjflkdjfl";
		System.out.println(s6.startsWith("a"));
		System.out.println(s6.startsWith("k"));
		
		System.out.println(s6.endsWith("l"));
		
		//substring
		System.out.println("substring method");
		String s7 = "Java String Handling";
		System.out.println("lenght: "+s7.length());
		System.out.println(s7.substring(8));
		System.out.println("beginindex and endindex: "+ s7.substring(5, 12));
		
		//split method
		System.out.println("split method");
		String email = "xxxx@abc.com";
	//	System.out.println("split email= "+email.split("@"));  //--> [Ljava.lang.String;@38af3868
		String[] emsplit = email.split("@");
		System.out.println("split email= "+ emsplit[1]);
		String s8 = "java";
		String[] s8Arr = s8.split("");
		System.out.println(Arrays.toString(s8Arr));
		
		String s9 = "Java | Language";
		String s10 = "Java&Language";
		String[] s9split = s9.split("|");
		String[] s10Split = s10.split("&");
		System.out.println(Arrays.toString(s10Split));
		System.out.println(Arrays.toString(s9split));
		System.out.println(s10.length());
		System.out.println("s10 length="+s10Split.length);  /// Q: why 2? ---> it's splitting into 2 parts
		System.out.println(s9split.length);
		
		String firstStr = s10Split[0];
		String secondStr = s10Split[1];  // Q: why not String[] ?? because [1]??   ---> because individual STRINGs are stored in STRING ARRAY
		System.out.println(firstStr+" = " +secondStr );
		
		
	}
}
