package com.iorta.practice;

public class Manager extends Employee {
	public Manager(int id, String name, double salary) {
		super(id, name, salary);
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " (Manager)";
	}
	
	@Override
	public void increaseSalary(double percentage) {
		super.increaseSalary(10);
	}
}
