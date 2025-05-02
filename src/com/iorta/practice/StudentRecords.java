package com.iorta.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRecords {
	private List<String> students;
	
	public StudentRecords() {
		this.students = new ArrayList<>();
	}
	
	void addStudent(String name) {
		students.add(name);
		System.out.println(name + " has been added.");
	}
	
	void addStudent(List<String> names) {
		students.addAll(names);
		System.out.println("Student names have been added.");
	}	
	
	void displayStudents() {
		if (students.isEmpty()) {
			System.out.println("No students in the record");
			return;
		}
		System.out.println("Student List:");
		for (String student : students) {
			System.out.println("- " + student);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecords records = new StudentRecords();
		
		records.addStudent("Varenya Patkar");
		
		List<String> newStudents = Arrays.asList("Dhrriti A", "Bob Smith", "Charlie Brown");
		records.addStudent(newStudents);
		
		records.displayStudents();
	}

}
