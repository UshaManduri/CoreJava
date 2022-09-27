package com.ArrayVarArg;

import java.util.Scanner;

public class PassingDynamicValues {
	static void add(int... a) {
		if(a.length == 0) {
			System.out.println("Values are not passed");
		} else {
			int sum = 0;
			for(int i = 0; i<a.length; i++) {
				sum += a[i];
			}
			System.out.println("Result: "+sum);
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			System.out.print("Enter num1: ");
			int n1 = scn.nextInt();
			System.out.println("n1 value is : "+ n1);
			
			System.out.print("Enter num2: ");
			int n2 = scn.nextInt();
			
			System.out.print("Enter num3: ");
			int n3 = scn.nextInt();
			
			add(n1,n2,n3);
		}
	}

