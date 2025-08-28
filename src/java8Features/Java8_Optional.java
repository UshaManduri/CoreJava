package java8Features;

import java.util.Optional;

public class Java8_Optional {

	public static void main(String[] args) {
		Java8_Optional java = new Java8_Optional ();
		
		Integer val1 = null;
		Integer val2 = new Integer(10);
		
		// Optional.ofNullable() --> allows passed parameter to be null
		Optional<Integer> a = Optional.ofNullable(val1);
		
		// Optional.of() --> thows nullpointer exception if passed parameter is null
 //		Optional<Integer> a1 = Optional.of(val1);
 		Optional<Integer> b =Optional.of(val2);
 		
 		System.out.println(java.sum(a,b));
 		
 		optionalElseThrowException();
	}

	private int sum(Optional<Integer> a, Optional<Integer> b) {
		
		System.out.println("first parameter is present: "+a.isPresent());
		System.out.println("second parameter is present: "+b.isPresent());
		
		//optional.orElse  -->  returns the value if present or else returns the default value passed.
		Integer v1 = a.orElse(22);
		Integer v2 = b.get();
		
		return v1+v2;
	}
	
	public static void optionalElseThrowException() {
	//	Optional<Integer> oi = Optional.empty();
		Optional<Integer> oi = Optional.of(100);
		System.out.println("optional: "+oi);
		try {
			Integer intOi = oi.orElseThrow(ArithmeticException :: new);
			System.out.println(intOi);
		} catch (Exception e){
			System.out.println("exception at optionalElseThrowException: "+e);
		}
	}
	
}
