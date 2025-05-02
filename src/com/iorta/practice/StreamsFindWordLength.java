package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsFindWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly");
		
		Optional<String> word = words.stream()
					.filter(w -> w.length() > 5)
					.findFirst();
		
		word.ifPresent(System.out::println);
	}

}
