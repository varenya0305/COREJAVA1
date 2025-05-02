package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		
		Optional<Integer> lastElement = numbers.stream()
										.reduce((first, second) -> second);
		
		lastElement.ifPresent(System.out::println);
				
				
				
				
				
				
				
				
				
	}

}
