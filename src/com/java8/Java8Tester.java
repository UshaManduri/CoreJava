package com.java8;

public class Java8Tester {
	public static void main(String[] args) {
		Java8Tester a1 = new Java8Tester();
		
		//with type declaration
		MathOperation add = (int a, int b) -> a+b;
		
		//without type decl'n
		MathOperation sub = (a,b) -> a-b;
		
		//with return statement along with curly braces
		MathOperation mul= (int a, int b) -> {return a*b; };
		
		//without return statement and without curly braces
		MathOperation div = (int a, int b) -> a/b;
		
		System.out.println("10+5= "+a1.operate(10,5,add));
		System.out.println("10-5= "+a1.operate(10,5,sub));
		System.out.println("10*5= "+a1.operate(10,5,mul));
		System.out.println("10/5= "+a1.operate(10,5,div));
		
		//without parenthesis
		GreetingService greetServ1 = message -> System.out.println("Hello "+message);
		
		//with parenthesis
		GreetingService greetServ2 = (message) -> System.out.println("Hello "+message);
		
		greetServ1.sayMessage("Hi");
		greetServ2.sayMessage("World");
	}
	
	interface MathOperation{
		int operation(int a, int b);
	}
	
	interface GreetingService{
		void sayMessage(String message);
	}
	
	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a,b);
	}
	
	public int add(int a, int b) {
		return a+b;
	}
}
