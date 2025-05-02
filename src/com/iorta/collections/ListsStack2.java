package com.iorta.collections;

import java.util.Stack;

public class ListsStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		
		System.out.println("Stack empty? " + stack.empty());
		
		
		stack.push("Apple");
		stack.push("Banana");
		
		System.out.println("Stack empty? " + stack.empty());
		
		stack.pop();
		stack.pop();
		
		System.out.println("Stack empty? " + stack.empty());	
	}

}
