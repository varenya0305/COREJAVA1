package com.iorta.collections;

import java.util.Stack;

public class ListsStack3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		int position = stack.search(30);
		
		if (position != -1) {
			System.out.println("Element 30 found at position: " + position);
		} else {
			System.out.println("Element 30 not found in the stack.");
		}

		position = stack.search(50);
		if (position == -1) {
			System.out.println("Element 50 not found in the stack.");
		}
	}

}
