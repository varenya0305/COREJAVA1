package com.iorta.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("manvir", "shreya", "suchi", "charlie", "bob");
		
		
		List<String> uppercase = names.stream()
								.map(upperName -> upperName.toUpperCase())
								.collect(Collectors.toList());
		
		System.out.println(uppercase);
		
		
		
		
	}

}
