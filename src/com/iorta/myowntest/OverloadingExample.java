package com.iorta.myowntest;

public class OverloadingExample {
	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		OverloadingExample calculate = new OverloadingExample();
		
		System.out.println(calculate.add(5, 10));
		
		System.out.println(calculate.add(5, 10, 20));
	
		System.out.println(calculate.add(0.5, 2.5));
	}
}
