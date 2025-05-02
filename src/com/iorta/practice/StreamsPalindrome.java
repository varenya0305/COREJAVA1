package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("level", "java", "radar", "world");
		
		String result = words.stream()
						.filter(w -> w.equals(new StringBuilder(w).reverse().toString()))
						.collect(Collectors.joining(", "));
		
		System.out.println(result);
	}

}
