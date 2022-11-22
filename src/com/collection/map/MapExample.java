package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<>();
 
        // Add some vehicles.
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);
 
        System.out.println("Total vehicles: " + vehicles.size());
 
        // Iterate over all vehicles, using the keySet method.
       for (String key : vehicles.keySet())
    	   System.out.println(key+" - "+vehicles.get(key));
       System.out.println();
       
       String searchKey = "Audi";
       if(vehicles.containsKey(searchKey))
    	   System.out.println("found total "+vehicles.get(searchKey)+" "+searchKey+" cars!\n");
        
        // Clear all values.
        //vehicles.clear();
 
        // Equals to zero.
        System.out.println("After clear operation, size: " + vehicles.size());
        
        System.out.println("Using java 8 Streams");
        
        vehicles.forEach((k,v) -> System.out.println(k +":"+ v));
        
        System.out.println("Using keyset");
        vehicles.keySet().forEach( k -> System.out.println(k + ":" + vehicles.get(k)));
        
        System.out.println("Printing values");
        vehicles.values().forEach(v -> System.out.println("Values :"+ v));
        
        System.out.println("Using streams");
        
        vehicles.entrySet().stream()
        					.forEach(e -> System.out.println(e.getKey() +":"+ e.getValue()));
        
    }
}
