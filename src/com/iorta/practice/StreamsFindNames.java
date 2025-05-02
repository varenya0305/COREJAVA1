package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFindNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew");
		
		List<String> filteredNames = names.stream()
									.filter(namesA -> namesA.startsWith("A"))
									.collect(Collectors.toList());
		
		System.out.println(filteredNames);
		
		
		
		
		
		
		
		
	}

}
