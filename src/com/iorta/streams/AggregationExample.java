package com.iorta.streams;

import java.util.Arrays;
import java.util.List;

public class AggregationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> salaries = Arrays.asList(3000, 4000, 5000, 6000);
		
		int totalSalary = salaries.stream()
							.mapToInt(Integer::intValue)
							.sum();
		System.out.println("Total salary: " + totalSalary);
	}

}
