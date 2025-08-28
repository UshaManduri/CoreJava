package com.Preparation;

public class OrderOfExecution {

	static {
		System.out.println("1. SB start");
//		OrderOfExecution ord = new OrderOfExecution();
		System.out.println("end of SB");
	}
	
	{
		System.out.println("3. NSB start");
		System.out.println("end of NSB");
	}
	
	OrderOfExecution(){
		System.out.println("4. constructor start");
		System.out.println("constructor end");
	}
	
	public static void main(String[] args) {
		System.out.println("2. main start");
		OrderOfExecution ord = new OrderOfExecution();
		System.out.println("main end");
	}
}
