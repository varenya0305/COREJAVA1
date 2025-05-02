package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamsAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		
		OptionalDouble average = numbers.stream()
						.mapToInt(Integer::intValue).average();
		
		average.ifPresent(System.out::println);
	}

}
