package com.ArrayVarArg;

public class ArrayAsFinal {
	public static void main(String[] args) {
		final int[] ia = new int[5];
		
		// modifying array locations value
		
		ia[1] = 5;
		ia[2]= 6;
		
		//modifying array referenced variable
	//	ia = new int[6];
		
		//printing array locations value
		for(int i = 0; i<ia.length; i++) {
			System.out.println("ia[" + i +"] --> "+ ia[i]);
		}
	}
}
