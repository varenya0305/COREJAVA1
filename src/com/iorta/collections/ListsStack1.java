package com.iorta.collections;

import java.util.Stack;

public class ListsStack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Stack after push operations: " + stack);
		
		System.out.println("Top Element (Peek): " + stack.peek());
		
		System.out.println("Element popped: " + stack.pop());
		
		System.out.println("Stack after pop operation: " + stack);
		
	}

}
