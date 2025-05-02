package com.iorta.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("Apple", "Ant", "Aeroplane","Art");
		
		Optional<String> longestWord = words.stream()
				                       .filter(w -> w.startsWith("A")) 
				                       .max(Comparator.comparingInt(String::length));
				                    		   
		longestWord.ifPresent(System.out::println);		 	   	                    		  
		}

}
