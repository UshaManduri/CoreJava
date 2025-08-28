package com.logicals;

public class GeekExamples {

	public static void main(String[] args) {
		
		int valueOfExample1 = example1();
		System.out.println("valueOfExample1= "+valueOfExample1);
		
		example2();
		
		example3();

	}
	
	public static int example1() {

		
		int a=10, b=20, c=90, d=0;
		
		System.out.println("var1= "+a);
		System.out.println("var2= "+b);
		System.out.println("var3= "+c);
		
		if ((a<b) && (b==c)) {
			d = a+b+c+d;
			System.out.println("sum of var: "+d);
		} else {
			System.out.println("error found in the condition.");
		}
	
		return d;
	}
	
	public static void example2(){
		int a=10, b=20, c=15;
		
		System.out.println("value of b in example2= "+b);
		
		// Using logical AND
        // Short-Circuiting effect as the first condition is
        // false so the second condition is never reached
        // and so ++b(pre increment) doesn't take place and
        // value of b remains unchanged
		
		if ((a>c) && (++b>c)) {
			System.out.println("inside 'if' block");
		}
		
		System.out.println("value of b: " +b);
	}
	
	//logical or operator (||) 
	public static void example3() {
		int a=10, b=1, c=10, d=30;
		
		System.out.println("var1= "+a);
		System.out.println("var2= "+b);
		System.out.println("var3= "+c);
		System.out.println("var4= "+d);
		
		if ((a>b) || (c==d))
			System.out.println("example3: both / either of the conditions are true");
		else
			System.out.println("example3: both the conditions are false.");
		}
}
