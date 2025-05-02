package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsFindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 5, 8, 3, 15);
		
		Optional<Integer> max = numbers.stream()
				.max(Integer::compareTo);
		
		max.ifPresent(System.out::println);
	}

}
