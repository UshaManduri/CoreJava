package com.oneb.overloading;

public class Test_79 {
	public static void main(String[] args) {
		Sample_79 s = new Sample_79();
		s.add(10,20);
		s.add("add", 20);
		s.add("abc", "sdk");
		s.add("10", 20.0);
//		s.add(10, 20.0f);
	}
}
