package com.iorta.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListsArrayList3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);
		numbers.add(3);
		numbers.add(2);
		numbers.add(10);

		System.out.println("Original List: " + numbers);
		
		ArrayList<Integer> noDuplicates = new ArrayList<>(new HashSet<>(numbers));
		
		System.out.println("List After Removing Duplicates: " + noDuplicates);
	}

}
