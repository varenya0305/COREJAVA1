package com.iorta.practice;

import java.util.Arrays;
import java.util.List;

public class StreamsSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
		
		long count = words.stream()
								.filter(w -> w.contains("e"))
								.count();
						
		System.out.println(count);
	}

}
