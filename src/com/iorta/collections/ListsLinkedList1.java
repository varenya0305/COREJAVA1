package com.iorta.collections;

import java.util.LinkedList;

public class ListsLinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Alice");
		names.add("Bobby");
		names.add("Charlie");
		names.addFirst("Andrea"); //Adds "Andrea" at the beginning
		names.addLast("Danny"); //Adds "Danny" at the end

		System.out.println("Original Linked List: " + names);
	
		//Access elements
		System.out.println("First element: " + names.getFirst());
		System.out.println("Last element: " + names.getLast());
		System.out.println("Element at index 3: " + names.get(3));
		
		//Remove elements
		names.removeFirst();
		names.removeLast();
		names.remove("Bobby");
		System.out.println("Linked List after removal: " + names);
	}

}
