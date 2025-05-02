package com.iorta.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks = Arrays.asList(45, 67, 32, 89, 51, 74);
		
		Map<String, List<Integer>> grouped = marks.stream()
											.collect(Collectors.groupingBy(mark -> mark >= 50 ? "Pass" : "Fail"));
		
		System.out.println(grouped);
	}

}
