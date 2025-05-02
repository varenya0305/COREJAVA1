package com.iorta.collections;

import java.util.ArrayDeque;

public class DequeArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<>();
		
		//Add elements at the end
		deque.add("Alice");
		deque.add("Bob");
		deque.add("Charlie");
		
		//Add element at the front (head)
		deque.addFirst("Zoe");
		
		//Print the ArrayDeque
		System.out.println("ArrayDeque: " + deque);
		
		//Remove an element from the front
		String removedFront = deque.removeFirst();
		System.out.println("Removed from front: " + removedFront);
		
		//Remove an element from the end
		String removedEnd = deque.removeLast();
		System.out.println("Removed from end: " + removedEnd);
	
		//Peek at front without removing
		String peekFront = deque.peekFirst();
		System.out.println("First element: " + peekFront);
		
		//Peek at end without removing
		String peekEnd = deque.peekLast();
		System.out.println("Last element: " + peekEnd);
		
		//Final ArrayDeque
		System.out.println("Final ArrayDeque: " + deque);
		
	}
}
