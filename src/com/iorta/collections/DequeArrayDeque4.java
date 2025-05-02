package com.iorta.collections;

import java.util.ArrayDeque;

class Task1 {
	String taskName;
	int priority;

	public Task1(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	public String toString() {
		return taskName + " (Priority: " + priority + ")";
	}
}


public class DequeArrayDeque4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayDeque<Task1> taskQueue = new ArrayDeque<>();

	//Add tasks to queue
	taskQueue.add(new Task1("Email", 3));
	taskQueue.add(new Task1("Database Backup", 1));
	taskQueue.add(new Task1("System Update", 2));

	//Display all tasks
	System.out.println("All tasks in the queue");
	for (Task1 task : taskQueue) {
		System.out.println(task);
	}

	//Remove and display a task from the front
	Task1 removedTaskFront = taskQueue.removeFirst();
	System.out.println("Removed Task: " + removedTaskFront);

	//Final task queue after removal
	System.out.println("Task queue after removal:");
		for (Task1 task : taskQueue) {
			System.out.println(task);
		}
	}
}
