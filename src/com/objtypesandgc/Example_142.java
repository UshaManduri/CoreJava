package com.objtypesandgc;

public class Example_142 {
	int x = 10;
	int y = 20;
	
	void m1(Example_142 e)
	{
		e = null;
		Example_142 e1 = new Example_142();
	}
	public static void main(String[] args) {
		Example_142 e1 = new Example_142();
		Example_142 e2 = new Example_142();
		
		e1.m1(e2);
		
		new Example_142();
		
		e1.m1(new Example_142());
		
		e1 = e2;
		
		e2 = null;
	}
}
