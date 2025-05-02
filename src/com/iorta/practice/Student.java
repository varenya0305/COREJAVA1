package com.iorta.practice;

public class Student extends Person {
	private String studentId;
	
	public Student(String name, String email, String studentId){
		super(name, email);
		this.studentId = studentId;
	}
	
	public String getDetails() {
		return super.getDetails() + ", Student ID: " + studentId + ", Modified Email: " + email.replace(" ", "-");
	}
	
	public static void main(String[] args) {
		Student student = new Student("Varenya", "  varenya@edu.com  ", "V12345");
		Person person = new Person("Meera", "  meera@gmail.com  ");
		
		System.out.println(person.getDetails());
		System.out.println(student.getDetails());
	}
}


