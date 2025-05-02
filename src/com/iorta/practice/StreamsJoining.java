package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		
		String concat = numbers.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		
		System.out.println(concat);
		
	}

}
