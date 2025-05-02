package com.iorta.collections;

import java.util.ArrayList;

public class ListsArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an ArrayList of Integers
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//Add elements to the ArrayList
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println("Initial List: " + numbers);

		//Calculate the sum of all elements
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("Sum of elements: " + sum);
		
		
		//Remove an element
		numbers.remove(1); //Removes the element ast index 1 = 20;
		System.out.println("After removal: " + numbers);
		

		//Check if a value exists in the ArrayList
		System.out.println("Contains 30?: " + numbers.contains(30));
	}

}
