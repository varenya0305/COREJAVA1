package com.iorta.streams2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondSmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = Arrays.asList(10, 45, 32, 23, 90, 76, 2);
		
		
		Optional<Integer> secondSmallest = integers.stream()
							.distinct()
							.sorted()
							.skip(1)
							.findFirst();
	
		System.out.println("The second smallest element is: ");
		secondSmallest.ifPresent(System.out::println);	
				
		Optional<Integer> secondLargest = integers.stream()
										.distinct()
										.sorted(Collections.reverseOrder())
										.skip(1)
										.findFirst();
		
		System.out.println("The second largest element is: ");
		secondLargest.ifPresent(System.out::println);	
	}

}
