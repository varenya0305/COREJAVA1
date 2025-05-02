package com.iorta.practice;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getDetails() {
		return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	}
	
	public void increaseSalary(double percentage) {
		salary = salary + salary * (percentage / 100);
	}
}
