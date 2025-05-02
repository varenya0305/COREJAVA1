package com.iorta.collections;

import java.util.ArrayList;

public class ListsArrayList4 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		numbers.add(35);

		System.out.println("Original List: " + numbers);
		
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		
		for (int num : numbers) {
			if( num % 2 == 0) {
				evenNumbers.add(num);
			}
		}
		
		System.out.println("Even numbers: " + evenNumbers);
	}

}
