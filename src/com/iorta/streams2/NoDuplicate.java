package com.iorta.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("a", "a", "b", "b", "c", "b", "a", "d");
		
		List<String> noDuplicates = names.stream()
									.distinct()
									.collect(Collectors.toList());
		
		System.out.println("List with no duplicate names: " + noDuplicates);
	}

}
