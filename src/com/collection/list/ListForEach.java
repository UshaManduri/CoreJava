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
        
        myList.forEach( e -> System.out.println(e));
        
        System.out.println("2nd way of printing... ");
        myList.forEach(
        		(e) -> {System.out.println(e);}
        		);
        
        System.out.println("Using streams***");
        
        myList.stream().forEach(e -> System.out.println(e));
        

	}

}
