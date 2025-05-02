package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<Integer> evenIntegers = integers.stream()
									.filter(n -> n % 2 == 0)
									.collect(Collectors.toList());
		
		System.out.println(evenIntegers);
	}

}
