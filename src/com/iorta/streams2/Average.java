package com.iorta.streams2;

import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		double average = integers.stream()
						.mapToDouble(Integer::doubleValue)
						.average()
						.getAsDouble();
		
		System.out.println(average);
	}

}
