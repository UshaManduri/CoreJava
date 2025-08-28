package com.Preparation;

import java.util.*;

public class Hash_main {

	public static void main(String[] args) {
		Hashcode_ex hash1 = new Hashcode_ex ("A", 1);
		Hashcode_ex hash2 = new Hashcode_ex ("B", 1);
		
		Map<Hashcode_ex, String> map = new HashMap<Hashcode_ex, String>();
		map.put(hash1, "csw");
		map.put(hash2, "it");
		
		for(Hashcode_ex hash : map.keySet()) {
			System.out.println(map.get(hash).toString());
		}
	}

}

