package com.objtypesandgc;

public class Example_160 {
//	public static void main(String[] args) {
//		int[] a;
//		for (int i = 0; i<10; i++) {
//			a[i] = i * i;
//		}
//	}

//	int[] a;
//	public static void main(String[] args) {
//		for (int i = 0; i<10; i++) {
//			a[i] = i * i;
//		}
//	}
	
//	static int[] a;
//	public static void main(String[] args) {
//		for (int i = 0; i<10; i++) {
//			a[i] = i * i;
//		}
//	}

//	static int[] a = new int[10];
//	public static void main(String[] args) {
//		for (int i = 0; i<10; i++) {
//			a[i] = i * i;
//			System.out.println(i + " is " + a[i]);
//		}
//	}
	
	
	
	
	
	
	
	
	
//	static int[] a = new int[5];
//	public static void main(String[] args) {
//		for(int i = 0; i <5; i++) {
//			a[i] = i*i;
//			System.out.println(i +" is " +a[i]);
//		}
//	}
	
	
	
	
	
//	static int[] a = new int[4];
//	public static void main(String[] args) {
//		for(int i=0; i<= 4; i++) {
//			a[i] = i*i;
//			System.out.println(i +" is "+a[i]);
//		}
//	}
//	
	
	
	
	
	
	
	
	static int[] a = new int[5];
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			a[i] = i*i;
			System.out.println(i +" is "+a[i]);
		}
		sample();
	}
	
	public static void sample() {
		
		for(int eachValue: a) {
			System.out.println(eachValue);
		}
		
		
		String[] strArr = {"A", "B", "C"};
		for(String str:strArr) {
			System.out.println(str);
		}
		
	}
	

	
	
}	