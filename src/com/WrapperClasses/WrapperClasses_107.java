package com.WrapperClasses;

public class WrapperClasses_107 {

	public static void main(String[] args) {
	 // Primitive Data type ==> Wrapper Class Object Conversion
		int i = 50;
		Integer io1 = new Integer(i);
		Integer io2 = Integer.valueOf(i);
		
		System.out.println(("i: "+i));
		System.out.println("io1: "+io1);
		System.out.println("io2: "+io2);
		System.out.println();
		
		Byte b1 = new Byte((byte)50);
		Character ch1 = new Character('a');
		Character ch2 = new Character((char)97);
		Boolean bo = new Boolean(true);
		Float f1 = new Float(70);
		Float f2 = new Float(23.23f);
		Float f3 = new Float(50.45);
		Double d1 = new Double(78.89);
		Double d2 = new Double(99);
		Double d3 = new Double('a');
		
		//Wrapper class object ==> Primitive data type Conversion
		Integer io3 = Integer.valueOf(345);
		int x = io3.intValue();
		byte b = io3.byteValue();
		short s = io3.shortValue();
		float f = io3.floatValue();
		
		System.out.println("x: "+x);
		System.out.println("b: "+b);
		System.out.println("s: "+s);
		System.out.println("f: "+f);
		
		char ch3 = (char)io3.intValue();
		
		//Parse string object ==> wrapper class object Conversion
		Integer io5 = new Integer("10");
		Integer io6 = Integer.valueOf("1");
		 
		Byte bo1 = Byte.valueOf("1");
		Byte bo2 = Byte.valueOf("59");
		
		Integer io7 = Integer.valueOf('a');
	//	Integer io8 =new Integer("5.4");
	//	Integer io9 = new Integer("5L");
		
	//	Long lo1 = new Long ("5L");
		
		Float fo1 = new Float("5");
	//	Float fo2 = new Float("5L");
		Float fo3 = new Float("5.4");
		Float fo4 = new Float("5.4F");
		Float fo5 = new Float("5.4D");
	//	Float fo6 = new Float("a");
	//	Character ch = new Character("a");
		
		System.out.println("io5: "+io5);
		System.out.println("io6: "+io6);
		System.out.println("io7: "+io7);
	//	System.out.println("io9: "+io9);
		System.out.println();
		
		//boolean string object ==> boolean wrapper class object
		Boolean boo1 = new Boolean("false");
		Boolean boo2 = new Boolean("true");
		Boolean boo3 = Boolean.valueOf("false");
		Boolean boo4 = Boolean.valueOf("true");
		Boolean boo5 = Boolean.valueOf("True");
		Boolean boo6 = Boolean.valueOf("FalSe");
		Boolean boo11= Boolean.valueOf("");
		Boolean boo12 = Boolean.valueOf(null);
	//	Integer io13 = Integer.valueOf(null);
		
		System.out.println("boo1: "+boo1);
		System.out.println("boo2: "+boo2);
		System.out.println("boo3: "+boo3);
		System.out.println("boo4: "+boo4);
		System.out.println("boo5: "+boo5);
		System.out.println("boo6: "+boo6);
		System.out.println("boo11: "+boo11);
		System.out.println("boo12: "+boo12);
//		System.out.println("io13: "+io13);
		
	}
}
