package com.iorta.string;

public class StringComparisonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// contentEquals(CharSequence cs) example
		StringBuffer buffer = new StringBuffer("hello");//used to create and manipulate strings dynamically without creating a new string object each time a modification is made
		String str = "hello";
		System.out.println("contentEquals: " + buffer.equals(str)); // true

		// equals(Object obj) example
		String str1 = "hello";
		String str2 = "Hello";
		System.out.println("equals: " + str1.equals(str2)); // false

		// compareTo(String anotherString) example
		String str3 = "hello";
		String str4 = "Hello";
		System.out.println("compareTo: " + str3.compareTo(str4)); // 32 ('h' - 'H' = 32)

		// isEmpty() example
		String emptyString = "";
		System.out.println("isEmpty: " + emptyString.isEmpty()); // true

		// isBlank() example
		String blankString = "   ";
		System.out.println("isBlank: " + blankString.isBlank()); // true

	}

}
