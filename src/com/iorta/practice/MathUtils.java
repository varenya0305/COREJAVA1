package com.iorta.practice;

import java.util.List;

public class MathUtils {
	
	static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	static double multiply(double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}

	static int multiply(List<Integer> numbers) {
		int result = 1;
		for (int num : numbers) {
			result =  num * result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Multiplication of 2 integers: " + MathUtils.multiply(1, 2));
		
		System.out.println("Multiplication of 3 doubles: " + MathUtils.multiply(2.2, 3.2, 6.7));
		
		List<Integer> numbers = List.of(2, 3, 4);
		System.out.println("Multiplication of a list of numbers: " + MathUtils.multiply(numbers));
	}
}
