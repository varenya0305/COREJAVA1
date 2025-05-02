package com.iorta.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks = Arrays.asList(45, 67, 32, 89, 51, 74);
		
		List<Integer> passed = marks.stream()
							.filter(mark -> mark > 50)
							.collect(Collectors.toList());
		System.out.println("Passed Students: " + passed);
				
								
	}

}
