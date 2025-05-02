package com.iorta.collections;

import java.util.ArrayList;

public class ListsArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an ArrayList of Strings
		ArrayList<String> names = new ArrayList<>();
		 
		//Add names to the ArrayList
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("Varenya");
		System.out.println("Initial List: " + names);
		
		
		//Access an element in the list by index
		System.out.println("Element at index 2: " + names.get(2));

		//Update an element
		names.set(2, "Naisa");
		System.out.println("After Update: " + names);
		
		//Remove an element
		names.remove(2);
		System.out.println("After removal: " + names);
		
		//Check the size of the array
		System.out.println("Size of the list: " + names.size());
	}

}
