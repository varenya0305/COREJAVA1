package com.iorta.streams2;

import java.util.Arrays;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("manvir", "shreya", "suchi", "sandy", "bob", "charlie");
		
		long count = names.stream()
				.filter(s -> s.startsWith("s"))
				.count();
		
		System.out.println("Count of names starting with 's': " + count);
	}

}
