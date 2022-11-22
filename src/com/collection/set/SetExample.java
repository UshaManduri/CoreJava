package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample {

	public static void main(String[] args) {
		System.out.println("*** for loop ***");
		
		Set<String> names = new HashSet<>();
		names.add("Java");
		names.add("cpp");
		names.add("oracle");
		
		for(String lang  :names) {
			System.out.print(lang);
			System.out.print(", ");
		}
		System.out.println();
		
		//creating an instance of Iterator
		
		Iterator<String> strIt = names.iterator();
		System.out.println("iterating  over Set: ");
		while(strIt.hasNext()) {
			System.out.print(strIt.next() + ", ");
		}
		System.out.println();
		names.forEach((e) -> { System.out.print(e +", ");});

		System.out.println();
		System.out.println("Using streams");
		
		names.stream().forEach(System.out::println);
		
		String namesJoined = names.stream()
				.map(String::toUpperCase)
				.peek(System.out::println)
				.collect(Collectors.joining(","));
		
		System.out.println("This is the result: "+namesJoined);
	}

}
