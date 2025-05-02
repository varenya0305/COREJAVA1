package com.iorta.collections;

import java.util.HashMap;

public class MapHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello world";
		
		//Create a HashMap to store the count of each character
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		//Loop through the string and update the character counts
		for (char c : str.toCharArray()) {
			//Updates the count of each character in the charCountMap
			//getOrDefault(c, 0) looks for the current count of the character c in the map
			//If character c has been encountered before, getOrDefault(c, 0) returns it current count
			//If character c has not been encountered before, getOrDefault(c, 0) returns 0 (the given default value)
			//+ 1 increments the count by 1
				charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}
		
		//Display the character count
		System.out.println("Character count in the string:");
		for (char c : charCountMap.keySet()) 
			//Iterates over the keys of the charCountMap
			//keySet() method returns a set of characters which is collection of unique characters in the map - the keys
		{
			System.out.println(c + ": " + charCountMap.get(c));
			//charCountMap.get(c) retrieves the count of the character c
		}
	}
	

}
