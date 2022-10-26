package com.ExceptionHandling;

public class FinallyWithContiue_152 {
	public static void main(String[] args) {
		for(int i=1; i<=8; i++) {
			System.out.println("\nIn loop: "+i);
			try {
				System.out.println("in try");
				if(i==5) {
					//insert statement
					break;										
					//continue;
					//return;
				}
			}
			finally {
				System.out.println("in finally");
			}
			System.out.println("after try / finally");
		}
		System.out.println("\nafter loop");
	}
}
