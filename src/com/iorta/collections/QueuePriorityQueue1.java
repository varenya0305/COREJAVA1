package com.iorta.collections;

import java.util.PriorityQueue;

public class QueuePriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Uses Min-Heap (smallest element is at the top)
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		
		//Adding elements to pq
		pq.add(40);
		pq.add(20);
		pq.add(30);
		pq.add(10);
		
		System.out.println("Priority Queue: " + pq);
		
		//Remove elements in priority order
		System.out.println("Removed element: " + pq.poll()); //Removes top element (10)
		System.out.println("Next top element: " + pq.peek()); //Shows next top element (20)
		
		
		System.out.println("PriorityQueue after removal: " + pq);
	}

}
