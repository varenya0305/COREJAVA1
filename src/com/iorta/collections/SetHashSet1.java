package com.iorta.collections;

import java.util.HashSet;

public class SetHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple"); //Duplicate element 
		
		System.out.println("HashSet: " + set);
		
		//Check if an element exists in the HashSet
		if(set.contains("Banana")) {
			System.out.println("Banana is in the set");
		}
		
		//Remove an element
		set.remove("Orange");
		System.out.println("HashSet after removal: " + set);
	}

}
