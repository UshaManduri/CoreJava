package com.ArrayVarArg;

public class Addition_169 {
//	static void add(int[] a) {
	static void add(int... a) {
		System.out.println(a.length + " values array is passed.");
		for (int i =0; i<a.length; i++) {
			System.out.println(" Value " +(i+1)+" is: "+a[i]);
		}
	}
}
