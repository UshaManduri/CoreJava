package com.ExceptionHandling;

public class Example_157 {
	public static void main(String[] args) {
		System.out.println(m1(5));
	}
	static int m1(int i) {
		while(i==5) {
			try {
				return 10;
			}
			finally {
			//	break;
				continue;
			}
		}
		return 20;
	}
}
