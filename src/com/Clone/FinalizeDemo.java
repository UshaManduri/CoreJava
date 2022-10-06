package com.Clone;

public class FinalizeDemo {
	public static void main(String[] args) throws Exception{
	//creating unreferenced objects
		for (int i=1; i<=10;i++) {
			new Building_50(new Furniture_50());
		}
		
		//requesting JVM to run GC
		System.gc();
		
		//Pausing main thread allow gc to run
		Thread.sleep(1000);
	}
}
