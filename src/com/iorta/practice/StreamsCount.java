package com.iorta.practice;

import java.util.Arrays;
import java.util.List;

public class StreamsCount {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "bat", "cat", "mango", "grape");
		
		long count = words.stream()
								.filter(w -> w.length() > 4)
								.count();
		
		System.out.println(count);
		
	}
}
