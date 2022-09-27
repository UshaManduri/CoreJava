package com.FundamentalClasses;

public class Example_29 {
	private int x;
	Example_29(int x){
		this.x=x;
	}
	@Override
	public int hashCode() {
		return x;
	}
	public int JVMHC() {
		return super.hashCode();
	}
}
