package com.iorta.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ages = Arrays.asList(30, 24, 40, 22, 45);
		
		List<Integer> sortedAges = ages.stream()
									.sorted()
									.collect(Collectors.toList());
		
		System.out.println("Sorted Ages: " + sortedAges);
	}

}
