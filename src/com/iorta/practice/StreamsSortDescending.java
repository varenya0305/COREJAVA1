package com.iorta.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSortDescending {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		
		List<Integer> sortedNumbers = numbers.stream()	
										.sorted(Comparator.reverseOrder())
										.collect(Collectors.toList());
		
		System.out.println(sortedNumbers);
	}

}
