package com.Preparation;

public class Hashcode_ex {

	String name;
	int id;
	
	Hashcode_ex(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
	if(this == obj)
		return true;
		
	if(obj == null || obj.getClass() != this.getClass())
		return false;
	
	// type casting of argument
	Hashcode_ex hash = (Hashcode_ex) obj;
	
	return (hash.name.equals(this.name) && hash.id == this.id);
		
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
}
