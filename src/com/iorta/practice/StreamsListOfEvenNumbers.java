package com.iorta.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsListOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> evenNumbers = IntStream.rangeClosed(1, 10)
									.filter(num -> num % 2 == 0)
									.boxed()
									.collect(Collectors.toList());
		System.out.println(evenNumbers);
	}
}
