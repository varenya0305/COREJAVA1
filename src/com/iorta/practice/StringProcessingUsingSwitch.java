package com.iorta.practice;

import java.util.Scanner;

public class StringProcessingUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String input = scanner.nextLine();

		System.out.println("Enter a command (UPPER, LOWER, LENGTH, REVERSE): ");
		String command = scanner.nextLine();

		switch(command) {
		case "UPPER":
			System.out.println("Uppercase: " + input.toUpperCase());
			break;
		case "LOWER":
			System.out.println("Lowercase: " + input.toLowerCase());
			break;
		case "LENGTH":
			System.out.println("Length: " + input.length());
			break;
		case "REVERSE":
			System.out.println("Reverse: " + new StringBuilder(input).reverse().toString());
			break;
		default:
			System.out.println("Invalid input. Please enter UPPER, LOWER, LENGTH, or REVERSE");
		}
		scanner.close();
	}
}
