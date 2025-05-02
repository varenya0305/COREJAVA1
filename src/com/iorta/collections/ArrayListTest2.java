package com.iorta.collections;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> family1 = new ArrayList<>();
		ArrayList<String> family2 = new ArrayList<>();
		ArrayList<Object> alphabets = new ArrayList<>();
		
		
		family1.add("Sai");
		family1.add("Satish");
		family1.add("Meera");
		family1.add("Shantu");

		family2.add("Muru");
		family2.add("Priya");
		family2.add("Shankar");
		family2.add("Harish");
		
		alphabets.add(1);
		alphabets.add(family2);
		alphabets.add("Muru");
		alphabets.add(true);
		
		System.out.println(alphabets);
		
		
		family1.addAll(family2);
		//System.out.println(family1);
	}

}
