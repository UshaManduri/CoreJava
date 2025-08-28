package com.Preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastingExample {

	public static int sum(int a , int b, String k, List<String> listr) {
		
		String lival = listr.get(0);
		
		int sumOfVar = a + b + Integer.parseInt(k) + Integer.parseInt(lival) ;
		
		return sumOfVar ;
	}
	
	public static void main(String[] args) {
			int firstVar = 22;
			int secondVar = 44;
		//	int thirdVar = Integer.parseInt("100");
			
			List<String> li = new ArrayList<>();
			li.add("20");
			
			List<String> li1 = Arrays.asList("1","2","3");
			
			int sumVal = sum(firstVar,secondVar,"200", li);
			
			System.out.println(sumVal);
		}
	
}
