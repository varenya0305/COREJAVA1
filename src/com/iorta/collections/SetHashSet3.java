package com.iorta.collections;

import java.util.HashSet;

public class SetHashSet3 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("John");
		set.add("Alice");
		set.add("Bob");
		set.add("Eve");
		
		//Iterate through the HashSet using for-each loop
		for(String name : set) {
			System.out.println(name);
		}
	}
}
