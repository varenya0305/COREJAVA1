package com.iorta.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsListOfSquaresFor5NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = IntStream.rangeClosed(1, 5)
				.map(n -> n * n)
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println(numbers);
	}

}
