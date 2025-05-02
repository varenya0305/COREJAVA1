package com.iorta.practice;

import java.util.Arrays;
import java.util.List;

public class StreamsSumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum = numbers.stream()
				.filter(o -> o % 2 != 0)
				.reduce(0, Integer::sum);
		
		System.out.println(sum);
	}

}
