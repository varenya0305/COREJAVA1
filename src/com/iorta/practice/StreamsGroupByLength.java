package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("cat", "dog", "apple", "banana", "kiwi");
		
		Map<Integer, List<String>> length = words.stream()
							.collect(Collectors.groupingBy(String::length));
		
		System.out.println(length);
	}

}
