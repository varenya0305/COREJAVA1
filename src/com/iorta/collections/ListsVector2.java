package com.iorta.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListsVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> numbers = new Vector<>();
	
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);

		//For-Each
		System.out.println("Using For-Each Loop: ");
		for (int num : numbers) {
			System.out.println(num + " ");
		}
	
		System.out.println();
	
		
		//Iterator
		System.out.println("Using Iterator: ");
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
		
		//List Iterator
		System.out.println("Using ListIterator (Reverse Order)");
		ListIterator<Integer> listIterator = numbers.listIterator(numbers.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous() + " ");
		}
		System.out.println();
	}

}
