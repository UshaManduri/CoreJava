package com.Preparation;

public class FinalizeExample {

	@Override
	protected void finalize() throws Throwable{
		try {
			System.out.println("inside finalize example");
		} catch (Throwable e) {
			throw e;
		} finally {
			System.out.println("calling finalize() of object class");
		
			super.finalize();
		}
	}
	
	public static void main(String[] args) throws Throwable {
		FinalizeExample fg = new FinalizeExample();
		fg.finalize();
	}
}
