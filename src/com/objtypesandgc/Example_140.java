package com.objtypesandgc;

public class Example_140 {
	int x = 20;
	int y = 30;
	
//	void m1() {
//		System.out.println("m1");
//	}
	
	void m1(Example_140 e) {
		e.x = e.x + 1;
		e.y = e.y + 2;
	}
}
