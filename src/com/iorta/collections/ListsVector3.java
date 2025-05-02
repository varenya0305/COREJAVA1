package com.iorta.collections;

import java.util.Vector;

public class ListsVector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initial capacity - 2
		Vector<Integer> vector = new Vector<>(2);
		
		System.out.println("Initial Capacity: " + vector.capacity());
		
		//Add elements to vector
		vector.add(1);
		vector.add(2);
		
		System.out.println("Capacity after adding two elements: " + vector.capacity());
		
		vector.add(3);
		System.out.println("Capacity after adding 3rd element: " + vector.capacity());
		
		System.out.println("Size of Vector: " + vector.size());
		System.out.println("Elements in Vector: " + vector);
	}

}
