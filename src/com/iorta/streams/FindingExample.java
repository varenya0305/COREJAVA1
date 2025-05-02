package com.iorta.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> prices = Arrays.asList(50, 75, 150, 200);
		
		
		Optional<Integer> firstExpensive = prices.stream()
											.filter(price -> price > 100)
											.findFirst();
		
		firstExpensive.ifPresent(price -> System.out.println("First expensive product: " + price));
	}

}
