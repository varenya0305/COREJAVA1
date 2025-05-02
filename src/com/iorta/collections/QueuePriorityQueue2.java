package com.iorta.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class QueuePriorityQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Max-Heap - largest element first
		
		//Create a Max-heap using a Comparator (Collections.reverseOrder())
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		//Add elements
		maxHeap.add(40);
		maxHeap.add(10);
		maxHeap.add(20);
		maxHeap.add(30);
		
		System.out.println("Max-Heap: " + maxHeap);
		
		
		//Remove elements in priority order
		System.out.println("Removed Element: " + maxHeap.poll()); //
		System.out.println("Next Top Element: " + maxHeap.peek());
		
		
		System.out.println("Max-Heap after removal: " + maxHeap);
	}

}
