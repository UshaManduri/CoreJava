package com.abst;

public abstract class Bus {
	
	abstract void engine();
	
	void breaks() {
		System.out.println("Breaks applied buss stopped");
	}
	
	void wheels() {
		System.out.println("Bus will run on 6 wheels");
	}
	
	//abstract void engine2();
}
