package com.objtypesandgc;

public class Example_157 {
	
	
	public static void main(String[] args) {
		
		int[] i1 = new int[2];
	//	int[] i2 = new int[-4];
		int[] i3 = new int['a'];
//		int[] i4 = new int["a"];
	//	int[] i5 = new int[34.5];
		int[] i9 = new int[(int) 45.34];
		int[] i6 = new int[1];
		int[] i7 = {};
	// int[3] i8 = {1,2,3};
		
		
 	System.out.println(i3[91]);
		System.out.println(i6[0]);
//		System.out.println(i3[34.56]);
		System.out.println(i3['a']);
//		System.out.println(i3["a"]);
		System.out.println(i1[-1]);
	}
}
