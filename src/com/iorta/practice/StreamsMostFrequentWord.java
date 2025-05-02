package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsMostFrequentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "banana");
		
		
		Map<String, Long> wordCount = words.stream()
									.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Optional<Map.Entry<String, Long>> mostFrequentWord = wordCount.entrySet().stream()
									.max(Map.Entry.comparingByValue());
		
		mostFrequentWord.ifPresent(entry -> System.out.println(entry.getKey()));
	}
}
