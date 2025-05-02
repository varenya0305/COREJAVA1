package com.iorta.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChainingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alice", "Ananya", "Anu", "Bob", "Charlie", "David");
		
		List<String> result = names.stream()
								.filter(name -> name.startsWith("A"))
								.map(String::toUpperCase)
								.collect(Collectors.toList());
		System.out.println(result);
				
	
	
	}

}
