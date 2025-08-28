package com.logicals;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int[] allNum = {1,3,4,5,6,7,8};
		int length = (allNum.length)+1;
		
		int missingNum = findOuttheMissingNum(allNum, length);
		
		System.out.println("num: " +missingNum);
		
	}
	
	public static int findOuttheMissingNum (int[] num, int length) {
		
		int total = (length*(length + 1) )/ 2;
		for(int val : num) {
			total = total - val;
		}
		return total;
	}
}

