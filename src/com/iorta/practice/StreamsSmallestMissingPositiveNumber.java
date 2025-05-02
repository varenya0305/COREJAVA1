package com.iorta.practice;

import java.util.Arrays;
import java.util.List;

public class StreamsSmallestMissingPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5);
		
		int missing = numbers.stream()
					  .filter(n -> n > 0)
					  .distinct()
					  .sorted()
					  .reduce(1, (expected, num) -> (num == expected)  ? expected + 1 : expected);
		
		System.out.println(missing);
	}

}
