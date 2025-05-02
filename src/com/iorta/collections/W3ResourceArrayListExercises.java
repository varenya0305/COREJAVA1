package com.iorta.collections;

import java.util.ArrayList;

public class W3ResourceArrayListExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");

		for(String color : colors) {
			System.out.println(color);
		}
		
		colors.add(0, "Pink");
		colors.add(5, "Yellow");
		System.out.println(colors);
		
		String firstElement = colors.get(0);
		System.out.println(firstElement);
		
	}
}
