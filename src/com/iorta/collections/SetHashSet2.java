package com.iorta.collections;

import java.util.HashSet;

public class SetHashSet2 {
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		
		System.out.println("HashSet of Integers: " + set);
		
		//Find the size of the HashSet
		System.out.println("Size of HashSet: " + set.size());
	
		//Check if a specific number exists
		if(set.contains(10)) {
			System.out.println("The set contains the number 10");
		}
		
		//Clear all elements in the set
		set.clear();
		System.out.println("HashSet after clearing: " + set);
	}
}
