package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = new ArrayList<String>();
		 
        // Adding elements to the List
        // Custom inputs
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        
        
        Iterator<String> strIterator =  myList.iterator();
        
        while(strIterator.hasNext()) {
        	System.out.println(strIterator.next());
        }

	}

}
