package com.iorta.collections;

import java.util.LinkedHashSet;

public class SetLinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Strawberry");
		fruits.add("Apple");

//		System.out.println("Fruits in the LinkedHashSet: ");
//		for (String fruit : fruits) {
//			System.out.println(fruit);
//		}
		
		//Remove Mango and display updated set
		fruits.remove("Mango");
		System.out.println(fruits);
		
		//Check for a specific element
		if (fruits.contains("Blueberry")) {
			System.out.println("Blueberry is in the set");
		} else {
			System.out.println("Blueberry is not in the set");
		}
	}

}
