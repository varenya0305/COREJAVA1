package com.iorta.collections;

import java.util.HashSet;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	//equals() method is defined in the Object class - parent class of all Java classes
	//Parameter obj is of type Object - can refer to any object in Java
	//In this case, we are comparing two Person objects - need to ensure that the obj passed into the method is actually a Person object (not any other object)
	//Must confirm that obj is of type Person (checked in the previous condition)
	
	//Due to the usage of custom object, we use equals() and hasCode() to ensure the HashSet automatically handles duplicate elements
	//Ensures that two person objects with the same name and age are considered equal and not duplicated in the HashSet
	public boolean equals(Object obj) {
		//Checks if the current object (this) and the object being compared (obj) are the exact same object in memory
		//If they are the same object, they are equal, so return true
		if (this == obj) return true;
		
		//Checks if the obj is null. If it is, the two objects can't be equal, returns false immediately
		//If obj is not null, moves to the second part of the if condition
		//Also checks if the runtime class of obj is different from the runtime class of this object
		//If the objects are not of the same class, they cannot be equal, returns false
		//If both the objects are of the same class, then they are of the same type, so the method moves to the next statement
		//Also ensures that the objects being compared are of the same type.
		if (obj == null || getClass() != obj.getClass()) return false;
		
		//If obj is not null and both object classes are same, then the method continues
		//Safely casts obj to the Person type.
		//Allows the access to the Person class fields (name, age)
		Person person = (Person) obj;
		
		
		//Compare the relevant fields of both Person objects to check if they are logically equal
		//Compare age field using == 
		//Compare name field using .equals() because name is a string
		//&& ensures both conditions (age and name) must be true for the objects to be considered equal
		return age == person.age && name.equals(person.name);
	}
	
	//
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public String toString() {
		return name + " (" + age + " years old)";
	}
}






















public class SetHashSet4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a HashSet of Person objects
		HashSet<Person> set = new HashSet<>();
		
		//Add Person objects to the HashSet
		set.add(new Person("John", 25));
		set.add(new Person("Alice", 30));
		set.add(new Person("John", 25)); //Duplicate (same name and age)
		
		//Display the HashSet of Person objects
		System.out.println("HashSet of Person objects: " + set);
	}
}
