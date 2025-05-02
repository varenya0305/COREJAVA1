package com.iorta.collections;

import java.util.TreeSet;

public class SortedSetTreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(35);
		numbers.add(10); //Duplicate
		
		System.out.println("Numbers in the TreeSet: " + numbers);
		//Output: Numbers in the TreeSet: [5, 10, 15, 20]
		//Sorted in natural ascending order
		//10 duplicate is not added in the TreeSet
		
		//Remove and display
		//numbers.remove(20);
		//System.out.println("Numbers in the TreeSet after removal: " + numbers);
		
		//Display the size
		//System.out.println("Size of the TreeSet: " + numbers.size());
		
		//Check if an element exists in TreeSet
		//if(numbers.contains(5)) {
		//	System.out.println("The TreeSet contains 5.");
		//}
		
		//ceiling()
		//Returns the smallest element in the set that is >= to given element
		System.out.println("Ceiling of 15: " + numbers.ceiling(15));
		
		//floor()
		//Returns the largest element in the set that is <= to given element
		System.out.println("Floor of 15: " + numbers.floor(15));
		
		//higher()
		//Returns the smallest element that is strictly > than given element
		System.out.println("Higher than 15: " + numbers.higher(15));
		
		//lower()
		//Returns the largest element that is strictly < than given element
		System.out.println("Lower than 15: " + numbers.lower(15));
	
		
		
		
		//String
//		TreeSet<String> fruits = new TreeSet<>();
//		
//		fruits.add("Banana");
//		fruits.add("Strawberry");
//		fruits.add("Dragonfruit");
//		fruits.add("Apple");
//		fruits.add("Orange");
//
//		
//		System.out.println("Fruits in the TreeSet: " + fruits);
		//Output: Fruits in the TreeSet: [Apple, Banana, Dragonfruit, Orange, Strawberry]
		//Sorts the strings lexicographicaly (alphabetical order)
	}

}
