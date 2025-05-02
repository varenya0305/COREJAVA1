package com.iorta.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "swiss";
		
		Optional<Character> firstNonRepeating = 
				input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst();
		
		firstNonRepeating.ifPresent(System.out::println);
	}

}
