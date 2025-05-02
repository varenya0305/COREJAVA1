package com.iorta.collections;

import java.util.ArrayDeque;

public class DequeArrayDeque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an ArrayDeque to act as a stack
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		//Push elements into the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);

		//Peek at the top element
		System.out.println("Top element: " + stack.peek());
		
		//Pop elements from the stack 
		//ArrayDeque behaves like a stack 
		//.pop() removes the last element pushed into the stack - follows LIFO principle
		System.out.println("Popped element: " + stack.pop()); //30
		System.out.println("Popped element: " + stack.pop()); //20

		//Final stack
		System.out.println("Final Stack: " + stack);
	}

}
