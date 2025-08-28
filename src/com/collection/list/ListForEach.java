package com.collection.list;

import java.util.*;

public class ListForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an ArrayList
       List<String> myList = new ArrayList<String>();
 
        // Adding elements to the List
        // Custom inputs
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        
       System.out.println(" for each ");

       myList.forEach(e -> System.out.println(e));
       
       myList.forEach((e) -> {System.out.println(e);});
       
       ////
       System.out.println("using Streams");
       myList.stream().forEach(e -> System.out.println(e));
	}

}
