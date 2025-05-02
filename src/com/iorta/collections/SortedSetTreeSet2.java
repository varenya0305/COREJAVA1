package com.iorta.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSetTreeSet2 {
	public static void main(String[] args) {
		
		//Create a TreeSet with a custom comparator (reverse order)
		TreeSet<String> cities = new TreeSet<>(Comparator.reverseOrder());
		
		cities.add("Paris");
		cities.add("London");
		cities.add("New York");
		cities.add("Tokyo");
		
		
		System.out.println("Cities in the TreeSet (reverse order): " + cities);
	}
}
