package com.nonstatic;

public class Exaample {
		Exaample a = new Exaample();
	Exaample(){
		System.out.println("C");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Exaample a = new Exaample();
	}
}
/*
 * 	int a = 10;
	{
		System.out.println("a: "+ a);
		System.out.println("b: "+ getB());
	}
	public static void main(String[] args) {
		Exaample e = new Exaample();
		System.out.println("a: "+e.a);
		System.out.println("b: "+e.b);
	}
	int getB() {
		return b;
	}
	int b = 20;
 */
/*
 * int x = m1();
	int m1() {
		System.out.println("nsv x");
		return 50;
	}
	{
		System.out.println("nsb 1");
	}
	Exaample(){
		System.out.println("no-arg C");
		x = 80;
		y = 90;
	}
	public static void main(String[] args) {
		System.out.println("main");
		Exaample e = new Exaample();
	}
	{
		System.out.println("nsb 2");
	}
	int y = m2();
	int m2() {
		System.out.println("nsv y");
		return 60;
	}
 */
/*{
System.out.println("NSB");
}
Exaample(){
System.out.println("no-arg C");
}
Exaample(String s){
System.out.println("String arg C");
}
public static void main(String[] args) {
System.out.println("main");
Exaample e2 = new Exaample();
Exaample e3 = new Exaample("abc");
}*/