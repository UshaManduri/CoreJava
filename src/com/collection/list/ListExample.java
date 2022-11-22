package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		
		myList.add("A");
		myList.add("C");
		myList.add("B");
		
		System.out.println("*******Using For loop");
		for(int i=0; i< myList.size(); i++) {
			
			System.out.println(myList.get(i));
		}
		
		System.out.println("*******Using ForEach loop");
		
		for(String str: myList) {
			System.out.println(str);
		}
		
		System.out.println("*******Using While loop");
		
		int i=0;
		
		while(i < myList.size()) {
			
			System.out.println(myList.get(i));
			i++;
		}
	}

}
