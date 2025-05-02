package com.iorta.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new LinkedHashMap<>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		//Iterate over the entries of the map
		System.out.println("Iterating through the LinkedHashMap:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
		
	}

}
