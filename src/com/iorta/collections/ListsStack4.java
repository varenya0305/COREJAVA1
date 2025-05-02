package com.iorta.collections;

import java.util.Stack;

public class ListsStack4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a string that holds a string value
		String input = "Hello V!";
		
		//Create a stack of Character type
		Stack <Character> stack = new Stack<>();
		
		//Use for iteration to push all characters of input string into the stack
		for (int i=0; i< input.length(); i++) {
			stack.push(input.charAt(i));
		}
		
		//Create a StringBuilder that will hold the reversed string
		StringBuilder reversedString = new StringBuilder();
		
		//Use while condition 
		//While the stack is not empty
		//Pop the stack (Last In First Out) until it is empty
		//Append the popped characters of the stack to the reversedString StringBuilder
		//Because of LIFO principle of the stack, the last character of the stack is popped first and appended to the StringBuilder, creating the reverse of the original string.
		while (!stack.empty()) {
			reversedString.append(stack.pop());
		}
		
		//Print original and reversed strings
		System.out.println("Original String: " + input);
		System.out.println("Reversed String: " + reversedString);
	}

}
