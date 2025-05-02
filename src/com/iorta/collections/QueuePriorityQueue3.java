package com.iorta.collections;

import java.util.PriorityQueue;

class Student implements Comparable <Student> { 
	//Student class implements Comparable<Student> to compare student marks
	//Provides a way to compare Student objects
	//Each student has a name and marks
	String name;
	int marks;

	
	//Constructor Student - initializes student's name and marks
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	//Method to compare two students based on their marks
	public int compareTo (Student other) {
		return this.marks - other.marks;
		//if this.marks < other.marks, negative value (this student comes first)
		//if this.marks > other.marks, positive value (other student comes first)
		//if this.marks = other.marks, return 0
		//PriorityQueue will sort students in ascending order of marks (lowest to highest)
	}


	//Print student object to display name and marks
	public String toString() {
		return name + " (" + marks + ")";
	}
}


public class QueuePriorityQueue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PriorityQueue of Student objects
		PriorityQueue<Student> studentQueue = new PriorityQueue<>();


		//Four student objects created and added
		studentQueue.add(new Student("Alice", 85));
		studentQueue.add(new Student("Bob", 70));
		studentQueue.add(new Student("Charlie", 90));
		studentQueue.add(new Student("David", 60));

		System.out.println("Student sorted marks:");

		//while loop runs as long as the queue is empty
		//studentQueue.poll removes and displays students with the lowest marks
		while (!studentQueue.isEmpty()) {
			System.out.println(studentQueue.poll()); //Student with lowest marks is removed first
		}
	}
}
