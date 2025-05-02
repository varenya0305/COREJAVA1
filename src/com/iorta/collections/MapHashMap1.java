package com.iorta.collections;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "One");
		map.put(2, "two");
		map.put(3, "Three");
		
		System.out.println("HashMap: " + map);
		
		//Retrieve value using key
		//System.out.println("Value for key 2: " + map.get(2));
		
		//Check if a key exists
		//if (map.containsKey(1)) {
		//	System.out.println("Key 1 exists");
		//}
		
		//Remove a key-value pair
		//map.remove(2);
		//System.out.println("HashMap after removal: " + map);
		
		//Iterate over keys and print the corresponding values
		//for (Integer key : map.keySet()) {
		//	System.out.println("Key: " + key + ", Value: " + map.get(key));
		//}
		
		//Iterate over values and print
		//for (String value: map.values()) {
		//	System.out.println("Value: " + value);
		//}
		
		//Iterate over entries (key-value pairs)
		//map.entrySet returns a set of key-value pairs
		//Each element in the set is a Map.Entry object that holds a key and its corresponding value
		//Map.Entry<Integer, String> entry means each element or entry in the set will be of type Map.Entry with the key being Integer and value being String
		//entry represents each key-value pair in the loop
		
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() //.getKey retrieves the key of the current Map.Entry object
								+ ", Value: " + entry.getValue()); //.getValue retrieves the valye associated with the current key in the entry)
		
		
		}
	}
}
