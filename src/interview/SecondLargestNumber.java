package interview;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		
		int[] arr = {20, 10, 30, 40,25, 19, 40, 12};
		
		int n= arr. length;
		
		get2LargestNumber(arr, n);
		
		System.out.println("Second largest without using arrays sort "+ getSecondLargest(arr, n-1));
		
		
	}
	
	static void get2LargestNumber(int arr[], int arrSize) {
		
		int i, first, second;
		
		if(arrSize < 2) {
			System.out.println("Invalid input ");
			return;
		}
		
		Arrays.sort(arr);
		
		for(i = arrSize-2; i>=0; i--) {
			if(arr[i] != arr[arrSize -1]) {
				System.out.println("Second largest "+ arr[i] );
				return;
			}
			
		}
			
	}
	
	static int getSecondLargest(int[] a, int total) {
		
		int temp;
		
		for(int i=0; i<total; i++) {
			for(int j= i+1; j<total; j++) {
				
				if(a[i] > a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[total - 2];
	}
}
