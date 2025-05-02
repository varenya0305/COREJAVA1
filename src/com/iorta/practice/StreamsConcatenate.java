package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("Hello", "World", "Java");
		
		String ConcatWord = words.stream()
									.collect(Collectors.joining(" "));
		
		System.out.println(ConcatWord);
	}

}
