package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Iterate_Map {
	public void iterateUsingEntrySet(Map<String, Integer> map) {
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
	}
//	public static void main(String[] args) {
//		iterateUsingEntrySet(Map<"Srisha", 10>);
//	}
	
	public static void main(String[] args) {
		Iterate_Map m = new Iterate_Map();
		
		Map<String, Integer> vehicles = new HashMap<>();
		 
        // Add some vehicles.
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);
        
        m.iterateUsingKeySetAndForeach(vehicles);
        m.iterateUsingLambda(vehicles);
        m.iterateByKeysUsingLambda(vehicles);
        m.iterateValueUsingLambda(vehicles);
        m.iterateUsingStreamAPI(vehicles);
	}
	
	public void iterateUsingKeySetAndForeach(Map<String, Integer> map) {
		System.out.println("This is using key-set & foreach");
		for(String key:map.keySet()) {
			System.out.println(key +":" + map.get(key));
		}
	}
		public void iterateUsingLambda(Map<String, Integer> map) {
			System.out.println("Iterate Using lambda");
			map.forEach((k,v) -> System.out.println((k +":" +v)));
		}
		public void iterateByKeysUsingLambda(Map<String, Integer> map) {
			System.out.println("iterate keys using lambda");
			map.keySet().forEach(k -> System.out.println((k+":"+map.get(k))));
		}
		public void iterateValueUsingLambda(Map<String, Integer> map) {
			System.out.println("iterate value using lambda");
			map.values().forEach(v -> System.out.println(("Value: "+v)));
		}
		public void iterateUsingStreamAPI(Map<String, Integer> map) {
			System.out.println("Iterate using StreamAPI");
			map.entrySet().stream()
				.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
		}
	}
