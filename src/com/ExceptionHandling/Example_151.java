package com.ExceptionHandling;

public class Example_151 {
	public static void main(String[] args) {
//		System.out.println(m1());
//	}
//		static int m1() {
			try {
				System.out.println("in try");
				System.out.println("before exit");
				System.exit(0);
				System.out.println("after exit");
			}
			finally {
				System.out.println("in finally");
			}
			System.out.println("after try / finally");
		//	return 11;
		}
}
	
