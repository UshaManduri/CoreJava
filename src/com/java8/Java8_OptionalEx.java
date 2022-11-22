package com.java8;

import java.util.Optional;

public class Java8_OptionalEx {
	public static void main(String[] args) {
		Java8_OptionalEx java8_OptionalEx = new Java8_OptionalEx();
		Integer val1 = null;
		Integer val2 = new Integer(10);
		
		//Optional.ofNullable ~ allows passed parameter to be null
		Optional<Integer> a = Optional.ofNullable(val1);
		
		//Optional.of ~ throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(val2);
		System.out.println(java8_OptionalEx.sum(a,b));
	}
	
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		
		//Optional.isPresent ~ checks the value is present or not
		System.out.println("first parameter is present: "+ a.isPresent());
		System.out.println("second parameter is present: "+b.isPresent());
		
		//Optional.orElse ~ returns the value if present otherwise returns the default value passed
		Integer val1 = a.orElse(new Integer(0));
		
		//Optional.get ~ gets the value, if peresent
		Integer val2 = b.get();
		return val1+val2;
		
	}
	
	public static void optionalElseThrowWithException() {
		Optional <Integer> oi = Optional.empty();
		System.out.println("optional: "+oi);
		try {
			System.out.println("Value of orElseThrow: "+oi.orElseThrow(ArithmeticException::new));
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void optionalElseThrowWithoutException() {
		Optional<Integer> oi = Optional.of(100);
		System.out.println("optional: "+oi);
		try {
			System.out.println("value of orElseThrow: "+oi.orElseThrow(ArithmeticException::new));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
