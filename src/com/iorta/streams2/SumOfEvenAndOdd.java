package com.iorta.streams2;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int sum1 = numbers.stream()
				.filter(even -> even % 2 == 0)
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println("Sum of even numbers is: " + sum1);
		
		int sum2 = numbers.stream()
				.filter(odd -> odd % 2 != 0)
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println("Sum of odd numbers is: " + sum2);
				
				
				
	}

}
