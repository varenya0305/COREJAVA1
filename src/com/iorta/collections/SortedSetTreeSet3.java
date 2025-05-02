package com.iorta.collections;

import java.util.TreeSet;

class Person2 implements Comparable<Person2> {
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Compares objects based on age 
	//TreeSet sorts the objects by their age
	@Override
	public int compareTo(Person2 other) {
		return Integer.compare(this.age, other.age);
	}
	
	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}



public class SortedSetTreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Person2> people = new TreeSet<>();
		
		people.add(new Person2("Alice", 67));
		people.add(new Person2("Lucy", 44));
		people.add(new Person2("Dom", 18));
		people.add(new Person2("Eve", 25));
	
		System.out.println("People in the TreeSet (sorted by age): " + people);
	}


}
