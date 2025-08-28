package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> listString = new ArrayList<String>();
		
		listString.add("a");
		listString.add("x");
		listString.add("p");
		listString.add("156");
		
		// iterate the list
		System.out.println("for loop");
		for(int i=0; i<listString.size(); i++) {
	//		System.out.println(i);
			System.out.println(listString.get(i));
		}
		
		System.out.println("");
		for(String liStri : listString) {
			System.out.println(liStri);
		}
		
		System.out.println("while condition");
		int i=0;
		while(i<listString.size()){
			System.out.println(listString.get(i));
			i++;
		}
		
	}

}
