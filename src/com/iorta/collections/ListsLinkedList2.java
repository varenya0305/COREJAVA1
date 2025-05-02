package com.iorta.collections;

import java.util.Collections;
import java.util.LinkedList;

public class ListsLinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.push(70);
		
		System.out.println("Original Linked List: " + numbers);
		
		Collections.reverse(numbers);

		System.out.println("Reversed Linked List: " + numbers);
	}
}
