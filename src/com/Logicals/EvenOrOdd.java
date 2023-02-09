package com.Logicals;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number: ");
		int number = Integer.parseInt(sc.nextLine());
		
		if (number % 2 == 0) 
			System.out.println("number is "+number+ " even");
		else
			System.out.println("number is "+number+ " odd");


	}

}
