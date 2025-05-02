package com.iorta.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManager {
	Map<Integer, Employee> employees = new HashMap<>();
	Scanner scanner = new Scanner(System.in);
	
	
	public void addEmployee(int id, Employee emp) {
		employees.put(id, emp);
		System.out.println(emp.name + " has been added.");
	}
	
	public void viewEmployees() {
		if (employees.isEmpty()) {
			System.out.println("No employees in the database");
			return;
		}
		for (Employee emp : employees.values()) {
			System.out.println(emp.getDetails());
		}
	}
	
	public void increaseSalary(int id) {
		Employee emp = employees.get(id);
		
		if (emp != null) {
			emp.increaseSalary(5);
			System.out.println("Salary increased for " + emp.name);
		} else {
			System.out.println("Employee not found");
		}
	}
	
	public void menu() {
		while (true) {
			System.out.println("\nChoose an action: ADD, VIEW, INCREASE, EXIT");
			String choice = scanner.nextLine().trim().toUpperCase();
			
			switch(choice) {
			case "ADD":
				System.out.println("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Enter Name: ");
				String name = scanner.nextLine();
				
				System.out.println("Enter Salary: ");
				double salary = scanner.nextDouble();
				
				scanner.nextLine();
				System.out.println("Is Manager? (yes/no): ");
				String isManager = scanner.nextLine().trim().toLowerCase();
				
				if (isManager.equals("yes")) {
					addEmployee(id, new Manager(id, name, salary));
				} else {
					addEmployee(id, new Employee(id, name, salary));
				}
				break;
				
			case "VIEW":
				viewEmployees();
				break;
				
			case "INCREASE":
				System.out.println("Enter Employee ID: ");
				int empId = scanner.nextInt();
				scanner.nextLine();
				increaseSalary(empId);
				break;
				
			case "EXIT":
				System.out.println("Exiting program...");
				return;
				
			default:
				System.out.println("Invalid Command! Try again");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManager manager = new EmployeeManager();
		manager.menu();
	}

}
