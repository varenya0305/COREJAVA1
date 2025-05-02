package com.iorta.collections;

import java.util.LinkedHashSet;


class Persons {
	String name;
	int age;

	Persons(String name, int age){
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Persons person = (Persons) obj;
		return age == person.age && name.equals(person.name);

	}

	@Override
	public int hashCode() {
		return 31 * name.hashCode() + age;
	}

	@Override
	public String toString() {
		return name + " (" + age + " years old)";
	}


}

public class SetLinkedHashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Persons> people = new LinkedHashSet<>();

		people.add(new Persons("Alice", 30));
		people.add(new Persons("Bob", 25));
		people.add(new Persons("John", 76));
		people.add(new Persons("Alice", 30)); //Duplicate

		System.out.println("People in the LinkedHashSet: ");
		for (Persons person : people) {
			System.out.println(person);
		}
	}
}
