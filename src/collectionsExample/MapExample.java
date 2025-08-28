package collectionsExample;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> vehicles = new HashMap<>();
		
		vehicles.put("BMW", 5);
		vehicles.put("camry", 9);
		vehicles.put("volvo", 7);
		
		System.out.println("size of the map: "+ vehicles.size());
		
		 for(String key : vehicles.keySet()) {
		//	 System.out.println(vehicles.get(key));
			 System.out.println(key +" | "+vehicles.get(key));
			 
		 }
		 
//		 for(Integer value: vehicles.values()) {
//			 System.out.println(value +" - "+vehicles.get(value));
//			 
//		 }
		 
		 for(Map.Entry<String, Integer> ent :vehicles.entrySet()) {
			 System.out.println(ent.getKey()+" -> "+ent.getValue());
		 }
		 
		 if(vehicles == null || vehicles.isEmpty()) {
			 System.out.println("vehicle map is empty");
		 } else {
			 for(Map.Entry<String, Integer> ent :vehicles.entrySet()) {
				if(ent.getKey() == null || ent.getValue() == null) {
					System.out.println("key-value found null");
				} else {
					 System.out.println(ent.getKey()+" ---> "+ent.getValue());
				}
			 }
			  
		 }
		 
		 if(vehicles.containsKey("BMW")) {
			 System.out.println("found vehicles: "+vehicles.get("BMW"));
		 }
		
	}

}
