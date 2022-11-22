package com.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		Optional<Integer> a = Optional.ofNullable(value1);
		
		Optional<Integer> b = Optional.of(value2);

		if(a.isPresent()) {
			System.out.println("a has value");
		}else
			System.out.println("a doesn't has value");
		
		System.out.println(sum(a,b));
		
		optionalThrowWithException();
		
		optionalElseThrowWithoutException();
		
	}
	
	public static Integer sum(Optional<Integer> a1, Optional<Integer> b1) {
		
		Integer val1 = a1.orElse(new Integer(0));
		Integer val2 = b1.get();
		
		return val1+val2;
		
	}
	
	public static void optionalThrowWithException() {
		
		Optional<Integer> op = Optional.empty();
		
		System.out.println("Optioanl :"+ op);
		
		try {
			System.out.println("Value of orElseThrow "+ op.orElseThrow(ArithmeticException::new));
			
		}catch(Exception e) {
			 System.out.println(e);
		}
	}
	
	public static void optionalElseThrowWithoutException() {
		
		Optional<Integer> op = Optional.of(100);
		
		System.out.println("Optioanl :"+ op);
		
		try {
			System.out.println("Value of orElseThrow "+ op.orElseThrow(ArithmeticException::new));
			
		}catch(Exception e) {
			 System.out.println(e);
		}
	}

}
