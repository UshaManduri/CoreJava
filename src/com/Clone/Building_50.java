package com.Clone;

public class Building_50 {
	Furniture_50 f;
	Building_50(Furniture_50 f){
		this.f = f;
	}
	@Override
	public void finalize() {
		System.out.println("In finalize method");
		f=null;
	}
}
