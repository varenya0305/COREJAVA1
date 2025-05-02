package com.iorta.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> primes = numbers.stream()
						.filter(StreamsPrimeNumber::isPrime)
						.collect(Collectors.toList());
		System.out.println(primes);
	}
	
	private static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
