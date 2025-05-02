package com.iorta.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("alice", "bob", "charlie");
		
		List<String> upperCaseNames = names.stream()
										.map(String::toUpperCase)
										.collect(Collectors.toList());
		
		System.out.println("Uppercase names: " + upperCaseNames);
	}

}
