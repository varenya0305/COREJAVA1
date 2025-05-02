package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		
		List<Integer> noDuplicates = numbers.stream()
				  					.distinct()
				  					.collect(Collectors.toList());
		
		System.out.println(noDuplicates);
		
		
		
		
		
		
		
	}

}
