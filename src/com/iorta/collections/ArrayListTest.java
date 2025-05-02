package com.iorta.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<>();
		str.add("Sai");
		str.add("Sai");
		str.add("Satish");
		str.add("Venu");
		str.add("Muru");
		str.add("Meena");
		str.add("Sai");
		str.add("Meena");		
		
		System.out.println("ArrayList with duplicates: " + str);
		
		
		int count = 0;
		for(String name : str) {
			if (name.equals("Sai")) {
				count = count + 1;
			}
		}
		
		System.out.println("Sai count: " + count);
		
		ArrayList<String> noDuplicates = new ArrayList<>(new HashSet<>(str));
		Collections.sort(noDuplicates);
		 
		
		
		System.out.println("ArrayList with no duplicates: " + noDuplicates);

	}

}
