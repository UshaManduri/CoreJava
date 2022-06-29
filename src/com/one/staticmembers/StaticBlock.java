package com.one.staticmembers;

public class StaticBlock {
	static {
		System.out.println("SB");
	}
	static int a = m1();
	static int m1() {
		System.out.println("SV: a");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
}
