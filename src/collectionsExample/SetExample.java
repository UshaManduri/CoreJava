package collectionsExample;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {

		Set<String> setStr = new HashSet<>();
		setStr.add("java");
		setStr.add("cpp");
		setStr.add("oracle");
		
		for(String eachVal:setStr) {
			System.out.print(eachVal);
			System.out.println(",");
		}
		
	}

}
