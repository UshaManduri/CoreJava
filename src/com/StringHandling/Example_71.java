package com.StringHandling;

public class Example_71 {
	int x;
	Example_71(int x){
		this.x=x;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Example_71) {
			Example_71 e = (Example_71)obj;
			return (this.x == e.x);
		}
		return false;
	}
}
