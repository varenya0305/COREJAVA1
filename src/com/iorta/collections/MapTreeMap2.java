package com.iorta.collections;

import java.util.TreeMap;

class Student1 implements Comparable<Student1> {
	String name;
	int rollNumber;
	
	public Student1 (String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	
	@Override
	public int compareTo(Student1 other) {
		return Integer.compare(this.rollNumber, other.rollNumber);
	}
	
	
	@Override
	public String toString() {
		return name + " (Roll No: " + rollNumber + ")";
	}
}

public class MapTreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Student1, Double> studentGrades = new TreeMap<>();
		
		studentGrades.put(new Student1("Alice", 103), 88.5);
		studentGrades.put(new Student1("Bob", 101), 92.0);
		studentGrades.put(new Student1("Carlisle", 102), 78.0);
		
		System.out.println("Student Grades (Sorted by Roll No): " + studentGrades);
	}
}
