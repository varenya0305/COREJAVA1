package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMostCommonFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("apple", "ant", "banana", "apricot", "cat");
		
		Optional<Map.Entry<Character, Long>> firstLetter = words.stream()
											.map(w -> w.charAt(0)) //Extract first letter
											.collect(Collectors.groupingBy(letter -> letter, Collectors.counting())) //Count occurences of letter
											.entrySet().stream() //Convert to stream of key-value pairs
											.max(Map.Entry.comparingByValue()); //Find the entry with the highest count
		firstLetter.ifPresent(System.out::println);									
	}
}
