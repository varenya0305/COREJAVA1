package com.iorta.collections;

import java.util.PriorityQueue;

class Task {
	//Has a name and priority
	String name;
	int priority;
	
	
	//Constructor initializes these values
	public Task(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	
	//ENsures the task is displayed in a readable format
	public String toString() {
		return name + " (Priority: " + priority + ")";
	}
}


public class QueuePriorityQueue4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a PriorityQueue with a custom comparator
		PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1, t2) -> t2.priority - t1.priority);
		//(t1, t2) -> t2.priority - t1.priority = lambda expression
		//Max-Heap comparator
		//t1 and t2 - task objects
		//if t2.priority > t1.priority - positive - t2 has higher priority
		//if t1.priority > t2.priority - negative - t1 has higher priority
		//if t2.priority = t1.priority - returns 0, order remains unchanged
		//Ensures higher priority comes first in the queue 
		
		
		taskQueue.add(new Task("Email Client", 3));
		taskQueue.add(new Task("Database Backup", 1));
		taskQueue.add(new Task("System Update", 2));
		
		System.out.println("Processing Tasks by Priority (High to Low Priority):");
		
		//Process tasks based on priority
		while (!taskQueue.isEmpty()) {
			System.out.println("Executing: " + taskQueue.poll());
		}
	}

}
