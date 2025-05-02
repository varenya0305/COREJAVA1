package com.iorta.collections;

import java.util.Vector;

public class ListsVector1 {
	public static void main(String[] args) {
		
		Vector<String> names = new Vector<>();
		
		names.add("Varenya");
		names.add("Siri");
		names.add("Charlie");
		
		System.out.println("Original Vector: " + names);
		
		System.out.println("First Element: " + names.firstElement());
		System.out.println("Last Element: " + names.lastElement());
		
		names.remove("Siri");
		System.out.println("Vector after removal: " + names);
		
		System.out.println("Contains Bob? " + names.contains("Bob"));
	}
}
