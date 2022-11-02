package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource__184 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		try (
			BufferedReader br = new BufferedReader(new FileReader("src/com/ExceptionHandling/abc.txtt"))){
//		{
//		
//			String line = br.readLine();
//			System.out.println(line);
//		}
		String st;
		while((st = br.readLine()) != null) {
			
			System.out.println(st);
			}
		
		}
	}
	
}
