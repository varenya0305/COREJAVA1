package com.iorta.practice;

public class Person {
	String name;
	String email;
	
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getDetails() {
		return "Name: " + name.toUpperCase() + ", Email: " + email.trim();
	}

}


