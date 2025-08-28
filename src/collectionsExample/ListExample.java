package collectionsExample;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();
		
		strList.add("Table");
		strList.add("chair");
		strList.add("Printer");
		
		System.out.println("for loop conditional");
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	
		System.out.println("for loop");
		//iteration
		for(String eachStr : strList){
			System.out.println(eachStr);
		}
			
		System.out.println("while condition");
		int i=0;
		while (i<strList.size()) {
			System.out.println(strList.get(i));
			i++;
		}
	
		if(strList.contains("notes")) {
			System.out.println("yes we have 'notes' in list.");
		} else
			System.out.println("please search using the right item.");

		List<String> modifiedList = findChar(strList);
		System.out.println("modified List = "+modifiedList);
	}

	public static List<String> findChar(List<String> strList) {
		if(strList.contains("chair")) {
			strList.add("chair2");
		}
		
		return strList;
	}
	
}
