package com.iorta.collections;

import java.util.ArrayDeque;

public class DequeArrayDeque3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an ArrayDeque to act as a queue
		ArrayDeque<String> queue = new ArrayDeque<>();
		
		//Add elements to the queue
		queue.offer("Armaan");
		queue.offer("John");
		queue.offer("Liam");
		
		//Peak the queue front
		System.out.println("Front element: " + queue.peek());
	
		//Remove elements from the queue
		//ArrayDeque behaves like a queue
		//.poll removes the first added element first - follows FIFO Principle
		System.out.println("Removed element: " + queue.poll());
		System.out.println("Removed element: " + queue.poll());

	    //Final queue
		System.out.println("Final Queue: " + queue);
	}

}
