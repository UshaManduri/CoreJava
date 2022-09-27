package com.ArrayVarArg;

public class Test_162 {
	public static void main(String[] args) {
		Example_162b[] e = {new Example_162b(),
						  new Example_162b(),
						  new Example_162b(),
						  new Example_162b() };
		Sample_162b.m2(e);
		
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i].x);
			System.out.println(e[i].y);
			
			System.out.println();
		}
	}
}
