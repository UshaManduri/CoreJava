package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division_146 {
	public static void div() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a;
			while(true) {
				try {
					System.out.println("\nEnter first number: ");
					a = Integer.parseInt(br.readLine());
					break;
				}
				catch(NumberFormatException nfe) {
					System.out.println("Enter only integer");
				}
			}
			while(true) {
				try {
					System.out.println("\nEnter second number: ");
					int b = Integer.parseInt(br.readLine());
					try {
						int c =a/b;
						System.out.println(("Result: "+c));
						break;
					}
					catch(ArithmeticException ae) {
						System.out.println("don't pass 0");
					}
				}
				catch(NumberFormatException nfe) {
					System.out.println("enter only integer");
				}
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	public static void main(String[] args) {
		div();
	}
}
