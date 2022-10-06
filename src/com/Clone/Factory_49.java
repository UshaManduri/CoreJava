package com.Clone;

public class Factory_49 {
	public static void main(String[] args)throws CloneNotSupportedException {
		Bike_48 b1 = new Bike_48(123, 23,"a");
		Bike_48 b2 = (Bike_48)b1.clone();
		System.out.println(b1==b2);
		
		b1.setbikeNo(234);
		b2.setbikeNo(355);
		
		System.out.println("b1 object details");
		System.out.println(b1);
		System.out.println();
		System.out.println("b2 object details");
		System.out.println(b2);
	}
}
