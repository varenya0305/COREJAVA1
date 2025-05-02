package com.iorta.streams2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("manvir", "shreya", "suchi", "sandy", "bob", "charlie");
		
		List<String> ascendingOrder = names.stream()
								   .sorted()
								   .collect(Collectors.toList());
		
		System.out.println("Names sorted in alphaetical ascending order: " + ascendingOrder);
		
		List<String> descendingOrder = names.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("Names sorted in alphaetical descending order: " + descendingOrder);
	}

}
