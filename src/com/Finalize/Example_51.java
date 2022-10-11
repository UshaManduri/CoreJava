package com.Finalize;

public class Example_51 {
	int x;
	static Example_51 e;
	Example_51(int x){
		this.x =x;
	}
	@Override
	public void finalize() {
		System.out.println("In finalize");
		e=this; 
	}
	public static void main(String[] args) throws Exception{
		Example_51 e1 =new Example_51(10);
		System.out.println(e1);
		System.out.println(e);
		//unreferencing object
		e1=null;
		
		//requesting JVM to execute GC
		System.gc();
		
		Thread.sleep(100);
		System.out.println(e1);
		System.out.println(e);
	}
}
