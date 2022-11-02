package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource_184 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("src/com/ExceptionHandling/abc.txt"))){
			
			
			String st;
	        // Condition holds true till
	        // there is character in a string
	        while ((st = br.readLine()) != null) {
	 
	            // Print the string
	            System.out.println(st);
	            
//	            String st;
//	            // Condition holds true till
//	            // there is character in a string
//	            while ((st = br.readLine()) != null)
//	     
//	                // Print the string
//	                System.out.println(st);
	        }
		}

	}

}
