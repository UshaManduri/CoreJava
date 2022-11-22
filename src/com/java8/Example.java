package com.java8;

import java.util.*;

public class Example {

	public static void main(String[] args) {
		
		 List<String> names1 = new ArrayList<String>();
	      names1.add("Mahesh ");
	      names1.add("Suresh ");
	      names1.add("Ramesh ");
	      names1.add("Naresh ");
	      names1.add("Kalpesh ");
			
	      List<String> names2 = new ArrayList<String>();
	      names2.add("Mahesh ");
	      names2.add("Suresh ");
	      names2.add("Ramesh ");
	      names2.add("Naresh ");
	      names2.add("Kalpesh ");
	      
	      Example e = new Example();
	      System.out.println("sort using java 7 syntax: ");
	      e.sortUsingJava7(names1);
	      System.out.println(names1);
	      System.out.println("sort using java 8 syntax: ");
	      
	      e.sortUsingJava8(names2);
	      System.out.println(names2);
	      
	}
	
	//sort using java 7
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}
	
	//sort using java 8
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names,(s1,s2) -> s1.compareTo(s2));
	}

}
