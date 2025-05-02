package com.iorta.practice;

import java.util.Arrays;
import java.util.List;

public class StreamsSumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(1, 2, 3, 4);
		
		Integer sumOfSquares = integers.stream()
									.map(n -> n * n)
									.reduce(0, Integer::sum);
		
		System.out.println(sumOfSquares);
	}

}


