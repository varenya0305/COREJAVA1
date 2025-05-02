package com.iorta.test;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassTest {
	public static void main(String[] arg) {

		//String fullName = getFullName("Sai", "Varenya");
	//System.out.println(fullName);

	//System.out.println(getFullName("Sai", "Varenya"));
	getFullName(" Sai ", "Varenya");
}

@SuppressWarnings("deprecation")
public static void getFullName(String firstName, String lastName) {		

	//		String fullName = firstName + " " + lastName;
	//		return fullName;	
	//		return  firstName + " " +lastName;		
	//		String fullName = firstName.concat(" ").concat(lastName) ;
	//		StringBuilder sb = new StringBuilder();
	//		sb.append(firstName);
	//		sb.append(" ");
	//		sb.append(lastName);
	//		return sb.toString();

	//		StringBuffer sbf = new StringBuffer();
	//		sbf.append(firstName);
	//		sbf.append(" ");
	//		sbf.append(lastName);
	//		return sbf.toString();		

	//		System.out.println("concat : " + firstName.concat(" ").concat(lastName) );
	//		System.out.println("toLowerCase : " + firstName.toLowerCase());	
	//		System.out.println("toUpperCase : " + firstName.toUpperCase());	
	//		System.out.println("charAt : " + firstName.charAt(0));
	//		System.out.println("length : " + firstName.length());
	//		System.out.println("contains : " + firstName.contains("Sai")); //Case sensitive
	//		System.out.println("isEmpty : " + firstName.isEmpty());
	//      System.out.println("equals : " + firstName.equals(lastName));
	//		System.out.println("equalsIgnoreCase() : " + firstName.equalsIgnoreCase(lastName));
	//		System.out.println("before trim : " + firstName);
	//		System.out.println("trim : " + firstName.trim());
	//		System.out.println(firstName);
	//		System.err.println(firstName);
	//		System.out.println("subString : " + lastName.substring(0,5));
	//		System.out.println("replace : " + lastName.replace("enya","un"));
	//		char charName[] = lastName.toCharArray();
	//		for(int i=0; i<charName.length; i++) {
	//			System.out.println(charName[i]);
	//		}
	//		System.out.println("hashCode : " + lastName.hashCode());
	//      System.out.println("getBytes : " + lastName.getBytes());
	//      System.out.print("codePointAt : " + lastName.codePointAt(3));
	//      System.out.println("codePointBefore : " + lastName.codePointBefore(4));
	//      System.out.println("codePointCount : " + lastName.codePointCount(0, lastName.length()));


	//1.  codePoints() method in String class
	//Returns a stream of Unicode code points (IntStream) from the string
		IntStream lastNamecodePoints = lastName.codePoints(); 
	
	//Print each code point in "Varenya"
		lastNamecodePoints.forEach(cp -> System.out.println("codePoints : " + cp));


	//2.  compareTo() method in String class
	//Compares two strings in alphabetical order 
	//Determines order of strings based on their characters' Unicode values
	//If characters are different - returns the difference of their Unicode values.
	//If the characters are same, it moves to the next character. 
			System.out.println("compareTo : " + firstName.compareTo(lastName));
			//Result: 
			//compareTo : -54 - firstName comes before lastName alphabetically


	//3.  compareToIgnoreCase() method in String class
	//Compares two strings in alphabetical order, ignoring the case of the characters
			System.out.println("compareToIgnoreCase : " + firstName.compareToIgnoreCase(lastName));
			//Result: 
			//compareToIgnoreCase : -86 - firstName comes before lastName alphabetically (ignoring case)


	//4.  contains() method in String class
	//Checks if a specific sequence of characters exists within a string
	//Case sensitive and returns boolean value (true or false)
			System.out.println("contains : " + lastName.contains(""));
			//"Var"- true - Var exists as a sequence
			//"ey" - false - ey exist individually but not in sequence
			//"" - true - empty string always is present in a string



	//5.  contentEquals(CharSequence cs) method in String class
	//Compares the content of a string with a specified CharSequence or StringBuffer
	//Compares the length of strings first - if not same - immediately returns false
	//Compares the characters one by one 
	//Case sensitive
			CharSequence lastNameTest = "varenya";
			System.out.println("contentEquals : " + lastName.contentEquals(lastNameTest));
			//"Aneyrva" - false - length same as Varenya but character sequence is not same 
			//"Varenya" - true - length and character sequence are both same'
			//"varenya" - false - case sensitive



	//6.  contentEquals(StringBuffer sb)
			StringBuffer sb = new StringBuffer("Varenya");
			System.out.println("contentEquals String Buffer : " + lastName.contentEquals(sb));
			//"Varenya" - true - String and String buffer content match
			//return fullName;



	//7.  describeConstable() method in String class
	//Use cases - Bytecode manipulation and dynamic class generation
	//part of java.lang.constant.Constable interface, implemented by String class
	//Allows a string to describe itself as a constant that can be stored in the constant pool
	//Constant pool - part of Java class file structure - stores constants like strings, integers, and method references.
			Optional<String> lastNameConstable = lastName.describeConstable(); //import java.util.Optional;
			System.out.println("describeConstable : " + lastNameConstable);
			//Result:
			//describeConstable : Optional[Varenya]
			//String "Varenya" is a constant, so the method returns an Optional containing the string itself



	//8.  endsWith() method in String class
	//Check whether a string ends with a specified suffix
	//Case sensitive
	//Returns boolean value
			System.out.println("endsWith : " + lastName.endsWith(""));
			//"enya" - true
			//"enyA" - false - case sensitive
			//"" - true - every string ends with an empty string		
	

	//9.  formatted()
	//Creates a formatted string by replacing placeholders in a atring with specified values.
	//args - values to replace the placeholders in the string
	//returns - new formatted string with the placeholders replaced by the provided arguments
	//string contains placeholders format specifiers 
	// - %s - strings
	// - %d - integers
	// - %f - floating point numbers
	// - %n - newline
			String lastNameFormatted = "Varenya %s";
			System.out.println("formatted : " + lastNameFormatted.formatted("Patkar"));
			//Result - formatted : Varenya Patkar


	//10.  getBytes()
	//Convert a string into a byte array.
	//Encodes the string using default character encoding or a specified character encoding
	//Useful for manipulation of byte representation of string - working with file I/O, network communication, or encryption
			System.out.println("getBytes : " + lastName.getBytes());
			byte[] byteArray = lastName.getBytes();
			System.out.println("Byte Arrays : ");
			for (byte b: byteArray) {
				System.out.println(b + " ");
			}
		


	//11.  getBytes(Charset charset): byte[]
	//Convert a string into a byte array using a specified character encoding (represented by Charset object)
	//Takes a Charset object that defines the character encoding
	//Converts the string into a byte array using the specified encoding

	//Using a Specific Charset (UTF-8)
			byte[] byteArray1 = lastName.getBytes(StandardCharsets.UTF_8);
			System.out.println("Byte Array (UTF-8): ");
			for (byte b: byteArray1) {
				System.out.println(b + " ");
			}

			
			
	//12.  getBytes(int scBegin, int scEnd, byte[] dst, int destBegin): void
	//Copies a specific portion of a string into a byte array
	//Must specify the start index and end index of the substring you want to convert.
	//The method copies this substring into an existing byte array(dst), starting at a specified position.
	//The substring is converted using platform's default character encoding
	//int scBegin - start index (inclusive) of the substring within the string
	//int scEnd - end index (exclusive) of the substring within the string
	//byte[] dst - destination byte array where the byte representation of the substring will be stored
	//int destBegin - start index (inclusive) in the destination byte array where the bytes will be placed
	//Method doesn't return a value (void)
	//Only modifies the provided byte array(dst) directly.
			byte[] byteArray2 = new byte[3];
			lastName.getBytes(0, 2, byteArray2, 0);
			System.out.println("Byte array : ");
			for(byte b : byteArray2) {
				System.out.println(b + " ");
			}


	//13.  getChars(int scBegin, int scEnd, char[] dst, int dstBegin)
	//Extracts a portion of a string and copies it into a character array.
	//Must specify the start index and end index of the substring you want to convert
	//The method copies this substring into an existing character array(dst), starting at a specified position.
	//int scBegin - start index (inclusive) of the substring within the string
	//int scEnd - end index (exclusive) of the substring within the string.
	//char[] dst - destination character array where the byte representation of the string will be stored
	//int desBegin - start index (inclusive) in the destination character array where the bytes will be placed
	//Method doesn't return a value (void)
	//Only modifies the provided character array(dst) directly.
			char[] charArray = new char[7];
			lastName.getChars(0, 7, charArray, 0);
			System.out.println("Char Array : ");
			for(char c : charArray) {
				System.out.println(c + " ");
			}



	//14.  getClass() 
	//Obtain runtime class of an object 
	//Method from the Object class - root class of all Java classes - inherited
	//The method returns a Class object that represents the class of the object.
			Object obj1 = "Dude";
			Class<?> classObj = obj1.getClass();
			Method[] methods = classObj.getDeclaredMethods();
			
			System.out.println(classObj);
			
			System.out.println("Methods in " + classObj.getName() + ":");
			for (Method method : methods) {
				System.out.println(method.getName());
			}


	//15.  hashCode()
	//Return a has code value for an object
	//Inherited from Object class - every class in Java can override it to provide its own implementation.
	//Returns an integer that is used to indentify objects in hash-based collections
	//In String class, the method is overriden to compute a hash code based on the characters in the string
			System.out.println("hashCode : " + lastName.hashCode());


	//16.  indent(int n)
	//Adds indentation to the beginning of each line of a string
	//Usefl for formatting of multi-line strings
	//n - number of spaces to be added +n - increase indentation, -n - decrease indentation
			String text = "Mastering\nJava\nlanguage";
			System.out.println("indent : \n" + text.indent(20)); 



	//17.  indexOf(int ch)
	//Finds the first occurence of a specified character (ch - represented by its Unicode value) in a string.
	//Returns the index of the first occurence of the character.
	//Returns -1 if the character is not found in the string
			System.out.println("indexOf (character) : " + lastName.indexOf('i'));
			//Result:
			//'r' - index 2
			//'i' - index 0

	//18.  indexOf(String str)
	//Finds the first occurence of a specified string (str) within a string.
	//Returns the index of the first occurence of the substring.
	//Returns -1 if the substring in not found.
	//Case sensitive
			System.out.println("indexOf (String) : " + lastName.indexOf("en"));
			//Result:
			//"aren" - index 1
			//"en" - index 3

	//19.  indexOf(int ch, int fromIndex)
	//Finds the first occurence of a specified character (ch - represented by its Unicode value) starting from a given index (fromIndex)
	//Allows to search for a character after a specific position in a string
	//int ch - character whose index is to be found
	//int fromIndex - the index to start searching from. 
	//Returns the index of the first occurence of the character starting from the given index.
	//Returns -1 if the character is not found
			System.out.println("indexOf (character index after a specified position)) : " + lastName.indexOf('r', 3));
			//Result:
			//'r', 3 = -1 - 'r' cannot be found after index 3
			//'r', 1 = 2 - 'r' can be found at index 2 starting the search from specified index 1
	

	//20.  indexOf(String str, int fromIndex)
	//Finds the first occurence of a specified substring (str) starting from a given index (fromIndex)
	//Allows the search for a substring from a specific position in a string.
	//String str - substring whose index is to be found.
	//int fromIndex - the index to start searching from.
	//Returns the index of the first occurence of the substring starting from the given index.
	//Returns -1 if the substring cannot be found starting from the given substring.
			System.out.println("indexOf (string index after a specified position : " + lastName.indexOf("ya", 2));
			//Result:
			//"enya", 2 = 3 - substring "enya" can be found at index 3, starting the search from index 2
			//"ya", 2 = 5 - substring "ya" can be found at index 5, starting the search from index 2


	//21.  indexOf(int ch, int beginIndex, int endIndex) 
	//Finds the first occurence of a specified character (ch - represented by its Unicode value) within a specific substring of the string
	//The substring is defined by beginIndex and endIndex
	//This method searches for the character only within the range specified by these indices.
	//int ch - character whose index is to be found
	//int beginIndex - the index at which to start the search (inclusive)
	//int endIndex - the index at which to end the search (exclusive)
	//Returns the first occurence of the character in the specified range
	//Returns -1 if the character is not found within the range
			System.out.println("indexOf (character index in the specified range) : " + lastName.indexOf('e', 0, 6));
			//Result:
			//'e', 2, 4 - index 3 - 'e' can be found between indices 2 and 4, at index 3
			//'e', 0, 3 - index -1 - 'e' cannot be found in the specified range as it is at index 3


	//22.  indexOf(String str, int beginIndex, int endIndex)
	//Finds the first occurence of a specified substring (str) within a specific range of the string.
	//The range is defined by beginIndex and endIndex
	//This method searches for the string only within the range specified by these indices.
	//String str - substring whose index is to be found
	//int beginIndex - the index at which to start the search (inclusive)
	//int endIndex - the index at which to end the search (exclusive)
	//Returns the index of the first occurence of the string in the specified range
	//Returns -1 if the substring is not found within the range
			System.out.println("indexOf (string index in the specified range) : " + lastName.indexOf("ren", 1, 4));
			//Result:
			//"ren", 1, 5 - index 2 - "ren" first occurence is at index 2, between index range of 1 and 5
			//"ren", 1, 4 - index -1 - "ren" does not fit in the specified range.



	//23.  intern()
	//Ensure that strings are stored in the string pool 
	//Saves memory by reusing instances of identical strings
	//String pool - special memory area in the Java heap where JVM stores String literals.
	//If the string already exists in the pool, this method will return a reference to the pooled instance instead of creating a new one
			String lastName2 = new String("Varenya"); 
			System.out.println("Before intern() : " + (lastName == lastName2));
			//Result - Before intern() : false
			//lastName is created as a literal and stored in the string pool
			//lastName2 is created using new String(), so it is stored in the heap.
			//Before calling intern(), lastName and lastName2 refer to different objects
			
			lastName2 = lastName2.intern();
			System.out.println("After intern() : " + (lastName2 == lastName));
			//After calling intern(), lastName2 refers to the string in the pool, which is the same as lastName
			//Result - After intern() : true
			
			String lastName3 = lastName.intern();
			System.out.println(lastName3 == lastName);
			//Result - true - lastName3 refers to the string in the pool after calling intern() on lastName



	//24.  isBlank()
	//Checks whether a string is empty or contains only whitespace characters. 
	//Returns true if the string is empty or contains only whitespace characters
	//Returns false if the string contains any non-whitespace character
	//Whitespace characters - spaces, tabs, newline, carriage return, and other Unicode whitespace characters.
	//Only checks if the string is empty or has only whitespace
			String str1 = "";
			String str2 = "    ";
			System.out.println(str1.isBlank()); //Result - true (empty string)
			System.out.println(str2.isBlank()); //Result - true (whitespaces)
			System.out.println(lastName.isBlank()); //Result - false (contains text)


	//25.  isEmpty()
	//Checks whether a string is empty, meaning if the string has a length of 0.
	//Does not consider whitespaces - if the string cotnains spaces or non-visible characters - it is not considered empty
	//Returns true if the string has no characters (length is 0)
	//Returns false if the string one or more characters (spaces included)
			System.out.println(str1.isEmpty()); //Result - true (empty string)
			System.out.println(str2.isEmpty()); //Result - false (whitespaces)
			System.out.println(lastName.isEmpty()); //Result - false (contains text)


	//26.	lastIndexOf(int ch)
	//Find the last occurrence of a specified character (ch) in a string.
	//If the character is found, the method returns its index. 
	//If not found, the method returns -1
	//Case sensitive
			System.out.println("lastIndexOf (int ch) : " + lastName.lastIndexOf('a')); //Result - index 6


	//27.	lastIndexOf(String str)
	//Find the last occurrence of a specified substring in the string
	//If the substring is found, the method returns its index.
	//If not found, the method returns -1
			System.out.println("lastIndexOf (String str) : " + lastName.lastIndexOf("ya"));


	//28.	lastIndexOf(int ch, int fromIndex)
	//Find the last occurrence of a specified character (ch) starting the search backwards from a specified index.
	//fromIndex - The index from which to start the search backward.
	//Returns the last occurrence of the character in the string before or at fromIndex. 
	//-1 if the character is not found
			System.out.println("lastIndexOf (ch - backward search from specified index) : " + lastName.lastIndexOf('a', 5)); //Result - index 1


	//29.	lastIndexOf(String str, int fromIndex) 
	//Find the last occurrence of a specified substring, starting the search backwards from a specified index.
	//fromIndex - The index from which to start the search backward.
	//Returns the last occurence of the substring before or at fromIndex.
	//Returns -1 if the character is not found
			System.out.println("lastIndexOf (str - backward search from specified index) : " + lastName.lastIndexOf("aren", 6)); //Result: index 1


	//30.	length()
	//Returns the total count of characters in a string
	//Includes spaces, digits, and special characters
	//Returns an integer representing the number of characters in the string.
	//Returns 0 for empty strings
	//Includes whitespaces
			String str = "  ";
			System.out.println("length : " + lastName.length()); //Result - 7
			System.out.println("length : " + str.length()); //Result - 2 (2 whitespaces)


	//31.	lines() : Stream<String>
	//Returns a Stream of strings, where each string represents a line from the original string.
	//Useful to process multi-line strings by splitting them into individual lines,
			String multiLineString = "Hello\nWorld\nJava Streams";
			Stream<String> lines = multiLineString.lines();
			lines.forEach(System.out::println);
			
			//.count() lines
			long lineCount = multiLineString.lines().count();
			System.out.println("count lines: " + lineCount);
		
	//32.	matches(String regex)
	//Checks if a string matches a given regular expression (regex).
	//Returns a boolean value if the "entire string" matches the regex pattern
	//Case sensitive
			String matchTest = "Sai";
			System.out.println("matches : " + matchTest.matches("Sai")); //Result - True


	//33.	offsetByCodePoints(int index, int codePointOffset) 
	//Calculates the index within the string that is offset by a specified number of Unicode code points from a given starting index.
	//Useful when working with Unicode strings that might contain characters represented by multiple code units (surrogate pairs)
	//int index - the starting index in the string 
	//int codePointOffset - the number of code points to move forward (+ve) or backward (-ve) from the starting index.
	//Returns the resulting index after moving by the specified numebr of code points.
	//IndexOutOfBoundsException - if index is invalid or the resulting index goes out of bounds.
			System.out.println("offsetByCodePoints : " + lastName.offsetByCodePoints(6,-3)); //Result: index 3
			String str20 = "a\uD83D\uDE00b";
			System.out.println("offsetByCodePoints : " + str20.offsetByCodePoints(0, 3));

			
			
	//34.	regionMatches(int toffset, String other, int ooffset, int len) 
	//Compares a specific region (substring) of the current string with a region of another string. 
	//Checks whether the characters in the specified regions are the same
	//int toffset - the starting index in the current string (this string) where the region begins.
	//String other - the string to compare with.
	//ooffset - the starting index in the other string where the region begins
	//len - the length of the region to compare (the number of characters to compare)
	//Return - true if the specified regions are both equal 
	//Return - false if not equal.
			String strRegion = "Varenya";
			System.out.println("regionMatches : " + lastName.regionMatches(2, strRegion, 2, 3)); 
			//"ren" region comparison 
			//starting indices - 2
			//len - 3
			//Result - true

			
	//35.	regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
	//Compares a specific region (substring) of the current string with a region of another string, ignoring the case.
	//Checks whether the characters in the specified regions are the same, regardless of their cases.
	//boolean ignoreCase - true or false condition whether to check the case of the substring in the region or not.
	//int toffset - the starting index in the current string (this string) where the region begins.
	//String other - the string to compare with
	//ooffset - the starting index in the other string where the region begins.
	//len - the length of the region to compare (the number of characters to compare)
	//Retrun - true if the specified regions are both equal
	//Return - false if not equal
			String strRegionCase = "varenya";
			System.out.println("regionMatches (case) : " + lastName.regionMatches(false, 0, strRegionCase, 0, 4));


	//36.	repeat(int count)
	//Creates a new string by repeating the current string a specified number of times
	//count - the number of times the string should be repeated.
	//Must be non-negative integer - >= 0
	//If count = 0, method returns an empty string ""
	//Returns a new string consisting of the original string repeated "count" times
	//If count > 1, the string is concatenated with itself count times
			System.out.println("count : " + lastName.repeat(5));
			//Result: VarenyaVarenyaVarenyaVarenyaVarenya 


	//37.	replace(char oldChar, char newChar)
	//Creates a new string where all occurrences of a specified character in the original string are replaced with another character.
	//char oldChar - The character to be replaced
	//char newChar - The character that will replace oldChar
	//Returns a new string with all occurrences of oldChar replaced by newChar
	//If oldChar does not exist in the string, the original string is returned unchanged
	//Case sensitive
	//Immutable - original string is not modified but a new string is created.
			System.out.println("replace : " + lastName.replace('a', 'e'));
			//Result: Verenye

			String str21 = "Core Java";
			System.out.println("replace : " + str21.replace(' ', '_'));
			//Result: Core_Java - replaces whitespace in between the words with underscore.


	//38.	replace(CharSequence target, CharSequence replacement)
	//Replaces all occurrences of a specified sequence of characters(substring) with another sequence of characters.
	//CharSequence target - the sequence of characters to be replaced.
	//CharSequence replacement - the sequence of characters to replace the target with
	//Returns a new string with all occurrences of target replaced by replacement.
	//If target does not exist in the string, the original string is returned unchanged.
	//Case sensitive
	//Immutable - original string is not modified but a new string is created.
			System.out.println("replace (substring) : " + lastName.replace("are", "eee"));
			//Result: Veeenya




	//39.	replaceAll(String regex, String replacement)
	//Replaces all substrings in a string that match a given regular expression (regex) with a specified replacement string
	//String regex - A regular expression pattern to search for in the string
	//String replacement - The string to replace each match of the regex
	//Returns a new string where all substrings matching the regex pattern are replaced with the replacement string
	//To match special characters literally, you must escape them.
	//Case sensitive
	//Replaces all matches of the given regex
			String str22 = "abc123xyz";
			System.out.println("replace (regex) : " + str22.replaceAll("\\d", "#"));
			//Result: abc###xyz
			// \\d regex pattern matches any digit (0-9)





	//40.	replaceFirst(String regex, String replacement)
	//Replaces the first substring of a string that matches a given regular expression (regex) with a specified replacement string
	//String regex - A regular expression pattern to search for in the string
	//String replacement - The string to replace the first match of the regex/
	//Returns a new string where the first substring matching the given regex pattern is replaced with the replacement string
	//Case sensitive
	//Only the first occurrence of the matching regex pattern is replaced, unlike replaceAll(), which replaces all matched.
			String str23 = "app app web app web";
			System.out.println("replaceFirst (regex) : " + str23.replaceFirst("app", "mouse"));
			//Result: mouse app web app web
			//Only the first occurrence of "app" is replaced with mouse. The rest stay the same.
	
	

	
	
	
	//41.	split(String regex)
	//Splits a string into an array of substrings based on a specified regex.
	//Breaks the string at each match of the regex pattern
	//regex - A regular expression that determines where the string will be split
	//Returns an array of strings which are derived by splitting the original string at the matches of the given regex
	//If no match of regex in the string, the entire string is returned as a single element in the array.
	//Method uses the given regex pattern to determine the delimiters for splitting
	
			String str24 = "apple,banana,cherry";
			String[] result = str24.split(",");
			for (String s : result) {
				System.out.println(s);
			}
			//Result: 
			//apple
			//banana
			//cherry
			//The string str is split at every occurrence of ,
			
			String str25 = "Core Java 2";
			String[] result1 = str25.split("\\s");
			for (String s : result1) {
				System.out.println(s);
			}
			//Result:
			//Core
			//Java	
			//2
			//The string str1 is split at every occurrence of whitespace
			
	
	
	//42.	split(String regex, int limit)
	//Split a string into an array of substrings based on a regex with a specified limit on the number of substrings.
	//Allows to control how many splits should occur
	//String regex - A regular expression that determines where the string should be split
	//int limit - An integer that specifies the maximum number of substrings to return
	//if limit = 0, method will split as many times as possible - split(String regex)
	//if limit is negative , no limit on the number of splits - will split as many times as possible
	//if limit is greater than the number of matches, the string is split as usual
	//Returns an array of strings containing the substrings after splitted the original string.
	//Number of strings is determined by the limit parameter.
	
			@SuppressWarnings("unused")
			String str26 = "apple,cherry,mango,pineapple";
			String[] result2 = str.split(",", 5);
			for (String s : result2) {
				System.out.println(s);
			}
			//Result
			//apple
			//banana
			//cherry,pineapple
			//The string is split at the first two commas, remainder of the string (cherry,pineapple) is returned as the last element
	
	
	

	
	
	//43.	startsWith(String prefix)
	//Checks if a given string starts with a specified prefix
	//Returns boolean value depending on whether the string starts with the provided prefix
	//String prefix - A string to check at the beginning of the original string
	//Return - true or false
	//Case sensitive
	//If prefix is empty string - return true
	//If string does not start with the specified prefix - returns false
			System.out.println("startsWith : " + lastName.startsWith("Sai")); 
			//"Var" - Result: true
			//"var" - Result: false
			//"" - Result: true
			//"Sai" - Result: false
	
	
	
	//44.	startsWith(String prefix, int toffset)
	//Check if a substring of a string, starting from a specified offset, begins with a given prefix
	//String prefix - the string that you want to check as the prefix
	//toffset - the index in the strign from which to start checking the prefix.
	//Method checks if the substring starting at this index (toffset) begins with the specified prefix.
	//Returns true if the substring of the string, starting from the specified offset, starts with the given prefix.
	//Returns false if it does not
	//If toffset is > than the length of the string, returns false because there is no substring to check
	//Case sensitive
			System.out.println("startsWith (toffset) : " + lastName.startsWith("nya", 8));
			//"nya", 4 - Result: true - nya starts at index 4 in the string
			//"nya", 3 - Result: false - nya does not start at index 3
			//"nya", 8 - Result: false - toffset (8) is greater than the length of string (7) - no substring to check
	
	//45.	strip()
	//Removes leading and trailing whitespace characters from a string
	//Reliable and efficient way of trimming whitespace
	//Returns a new string with all leading and trailing whitespace removed
	//Immutalble - does not modify original string
					String str28 = "   Varenya Patkar   ";
					System.out.println("strip : " + str28.strip());
	
	//46.	stripIndent()
	//Removes any common leading whitespace (indentation) from every line of a multi-line string
	//Returns a new string with the common leading whitespace removed from each line of the original string
	//Removes the leading whitespace from each line of a multi-line string
	//Ensures all lines are aligned to the left as much as possible
	//Removes the smallest amount of whitespace that is common to all lines.
	//If one line has more indentation than others, only the common indentation is removed
			String str29 = "    Hello world!\n    This is a test\n    Goodbye";
			System.out.println("stripIndent : ");
			System.out.println(str29.stripIndent());
			//Result: 		
			//Hello world!\n    This is a test\n    Goodbye" 
			//Hello world!
			//This is a test
			//Goodbye
			
			
	//47.	stripLeading()
	//Removes the leading white spaces from a string
	//Only removes leading white spaces
	//Does not modify original string, returns a new string
			String str33 = "   Hello World";
			System.out.println("Original : '" + str33 + "'");
			System.out.println("stripLeading : '" + str33.stripLeading() + "'");
			//Result:
			//Original : '   Hello World'
			//stripLeading : 'Hello World'
	
	
	
	//48.	stripTrailing()
	//Removes the trailing white spaces from a string
	//Only removes trailing white spaces
	//Does not modify original string, returns a new string
			String str32 = "Hello World   ";
			System.out.println("Original : '" + str32 + "'");
			System.out.println("stripTrailing : '" + str32.stripTrailing() + "'");
			//Result:
			//Original : 'Hello World   '
			//stripTrailing : 'Hello World'
	
	
	//49.	subSequence(int beginIndex, int endIndex)
	//Extracts a portion of a string (a subsequence of characters) from the given beginIndex(inclusive) to the endIndex (exclusive)
	//beginIndex: starting index (inclusive) of the subsequence
	//endIndex: ending index (exclusive) of the subsequence. Not included in the subsequence
	//Returns a CharSequence containing the characters from beginIndex to endIndex - 1;
	//Similar to subString but returns a CharSequence (can be used as a String)
			System.out.println("subSequence : " + lastName.subSequence(1, 5));
			//Result - aren (index 1 included but index 5 not included)
	
	
	
	//50.	subString(int beginIndex)
	//Extracts a portion of a string starting from a specified beginIndex to end of the string.
	//beginIndex: starting index (inclusive) from which to extract the substring.
	//Returns a new string containing the characters from the specified beginIndex to the end of the original string.
			System.out.println("subString (beginIndex) : " + lastName.substring(3));
			//Result: enya (starting at index 3 until end of string)
	
	//51.	subString(int beginIndex, int endIndex)
	//Extracts a portion of a string starting from the specified beginIndex (inclusive) to the endIndex (exclusive)
	//beginIndex: starting index (inclusive) from which to begin extracting the substring.
	//endIndex: ending index (exclusive) where the substring extraction should stop
	//Returns a new String containing characters from beginIndex to endIndex - 1
			System.out.println("subString(int beginIndex, int endIndex) : " + lastName.substring(2, 6));
			//Result: reny (starting at index 2 and ending at index 5 (index 6 - 1))
	
	
	//52.	toCharArray()
	//Converts a String into a new character array char[]
	//Each character in the string is copied into the corresponding index of the character array.
	//Does not take any parameters
	//Returns a new char[] array containing all the characters from the string in the same sequence
	//Useful for individual character manipulation in string
	//If the string is empty, returns an empty char[]
			char[] charArray2 = lastName.toCharArray();
			for (char c : charArray2) { //iterates over the array and prints each character
				System.out.println(c + " ");
			}
			//Result:
			//V 
			//a 
			//r 
			//e 
			//n 
			//y 
			//a 

	
	//53.	toLowerCase()
	//Converts all characters of a string to lowercase
	//Returns a new string with all characters converted to lowercase
	//Uses default locale of Java Virtual Machine
	//No parameters needed
			System.out.println("toLowerCase : " + lastName.toLowerCase());
			//Result: varenya
	
	//54.	toLowerCase(Locale locale)
	//Converts all characters of a string to lowercase using rules of a specific locale.
	//locale: a Locale object specifying the rules for lowercase conversion (e.g., Locale.US)
	//Ensures proper handling of language specific rules.
			String str99 = "İSTANBUL";
			System.out.println("toLowerCase (Locale) : " + str99.toLowerCase(Locale.forLanguageTag("tr")));
			//Result: istanbul
	
	//55.	toString()
	//Returns a string representation of an object.
	//Defined in the Object class 
	//Overriden in other classes
	//When not overriden, this method returns a string in the format java.lang.String@15db9742
	//In the String class, toString() returns the string itself.
	//In other classes, overriding toString() can be override to provide meaningful input
	
	
	//56.	toUpperCase()
	//Converts all characters of a string to uppercase
	//Returns a new string with all characters converted to uppercase
	//Uses default locale of JVM
	//No parameters needed
			System.out.println("toUpperCase : " + lastName.toUpperCase());
			//Result: VARENYA
	
	
	//57.	toUpperCase(Locale locale)
	//Converts all characters of a string to uppercase using rules of specific locale
	//locale: a Locale object specifying the rules for uppercase conversion (e.g., Locale.FRANCE)
	//Ensures proper handling of language specific rules
			String str9 = "istanbul";
			System.out.println("toUpperCase (Locale) : " + str9.toUpperCase(Locale.forLanguageTag("tr")));
			//Result: İSTANBUL

	
	//58.	transform(Function<? super String? extends R> f)
	//Transforms a string using a provided function
	//Provided function can perform any operation on the string 
	//Can return a result of a different type
	//f - function<? super String, ? extends R> that takes a String(or a super type of String)
	//as input and returns a result of type R.
	//Returns the result of applying the provided function f to the string, which can be any type.
	//Flexible transformation of a string into any other type, such as a new string, a number, a list, or any other object
	//Function can perform any kind of transformation - converting it to uppercase, parsing it into a number, etc
			String strr = "hello, world!";
			System.out.println("transform to uppercase : " + strr.transform(s -> s.toUpperCase())); 
			//Result: HELLO, WORLD!
	
			System.out.println("transform to show length : " + strr.transform(s -> s.length()));
			//Result: 13;
	
	//59.	translateEscapes()
	//Translates escape sequences into their corresponding characters in a string.
	//Returns a new String with all escape sequences replaced by their corresponding characters.
	//Escape sequences are special character combinations that represent certain characters in strings
	//   \n - newline
	//   \t - tab
	//   \\ - backslash
	//   \'- single quote
	//   \" - double quote
			String strT = "Hello\\nWorld\\tJava!";
			System.out.println("translate : " + strT.translateEscapes());
			//Result: 
			//Hello
			//World	Java!

	
	
	
	//60.	trim()
	//Removes any leading and trailing whitespace from a string
	//Does not affect spaces between the words within the string
	//Cleans up strings by removing unnecessary spaces - ensures consistency
	//Returns a new string with leading and trailing whitespace removed.
	//Does not handle all Unicode whitespace characters
	//Only removes ASCII whitespace
			String str10 = "    [    ]     ";
			System.out.println("Original : " + str10);
			System.out.println("trim() : " + str10.trim());
			//Result:		
			//Original :     [    ]     
			//trim() : [    ]
	
	
	
	
	//61.	copyValueOf(char[] data)
	//Creates a new string by copying the contents of the provided character array (char[])
	//data: character array(char[]) that needs to be copied to a new string
	//Returns a new String object that represents the sequence of characters in the provided char[] array/
	//Equivalent to calling the String constructpor that taskes char[] as an argument	
			char[] charArray1 = {'H', 'e', 'l', 'l', 'o'};
			String strC = String.copyValueOf(charArray1);
			System.out.println("copyValueOf (char[] array : " + strC);
			//Result: Hello
			//The method creates a new string "Hello" from the characters in charArray {'H', 'e', 'l', 'l', 'o'}
	
	
	
	
	//62.	copyValueOf(char[] data, int offset, int count)
	//Creates a new string by copying a portion of a character array, starting from a specified offset and copying up to a specified count of characters.
	//data - character array from which to copy the characters
	//offset - starting index (inclusive) in the data array from where to begin copying characters
	//count - number of characters to copy from the data array, starting from offset
	//Returns a new String object that represents the sequence of characters starting from offset and copying count characters from the provided char[] array.
	//Allows to copy a subset of character array, starting at a specified offset 
			@SuppressWarnings("unused")
			char[] charArray3 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
			String str45 = String.copyValueOf(charArray, 6, 5);
			System.out.println(str45);
			//Result: World
			//Method copies the portion of the array starting from index 6 ('W') up until 5 characters ('D')
			
	
	
	
	//63.	format(String format, Object... args)
	//Formats a string using a specified format string and arguments
	//Similar to printf-style formatting
	//Placeholders in the format string are replaced by provided arguments
	//String format: A format string containing format specifiers (placeholders) that define how the arguments should be formatted
	//args: A varargs parameter that allows the passing of a list of objects that will be inserted into the format string at the corresponding placeholders
	//Returns a new String that is the result of formatting the format string with the specified arguments.
	//format string - can contain special format specifiers (%s, %d, %f) that determine how each argument is represented in the resulting string.
	//args are substituted into the format string at the locations of the format specifiers.
	//The method interally uses java.util.Formatter to perform the formatting
	//Format Specifiers:
	//%s - String
	//%d - Integer
	//%f - Floating-point number	
	//%x - Hexadecimal integer
	//%c - Character	
	//%b - Boolean
			String formattedString = String.format("Hello, %s! You have %d new messages.", "Alice", 5);
			System.out.println(formattedString);
			//Result: Hello, Alice! You have 5 new messages.
			//The format string contains 2 format specifiers - %s, %d
			//%s is replaced by the first argument "Alice"
			//%d is replaced by the second argument 5
			
	
	
	
	
	//64.	format(Locale l, String format, Object... args)
	//Allows to format a string according to a specific locale.
	//Variant of format() method
	//Useful to format numbers, dates, other things according to the conventions of a particular country or region.
	//Locale l - a locale object that specifies the locale to be used for formatting
	//Locale l - determines how certain data types, such as numbers or dates, should be formatted
	//String format - a format string that contains placeholders (format specifiers) to be replaced by the arguments.
	//Object args - A varargs parameter that represents the arguments to be inserted into the format string at the corresponding placeholders.
	//Returns a new String that is the result of formatting the format string with the specified arguments, using th4e specified locale.
	//Locale object specifies the region or language that the formatting needs to adhere to.
	//Can affect how numbers are formatted (using commas or periods) or how dates are represented.
			Locale uslocale = Locale.US;
			String formattedString3 = String.format(uslocale, "The price is $%.2f", 1234.56);
			System.out.println(formattedString3);
			//Result:
			//Locale.US is used to format the string. In the US locale, the currency symbol for dollars is used, and the number is formatted using the US conventions
			//%.2f format specifier is used to format the floating point number with 2 decimal places.
			
	
	//65.	join(CharSequence delimiter, CharSequence... elements)
	//Concatenates a sequence of strings (or other CharSequence objects) with a specified delimiter between them.
	//Joins multiple strings into a single string, with a delimiter separating each element.
	//CharSequence delimiter - the CharSequence that will be placed between each element. For ex, a comma or space.
	//elements - a varargs parameter that represents the elements to be joined.
	//These elements can be of type CharSequence, which includes String, StringBuilder, StringBuffer, or other types that implement a CharSequence interface
	//Returns a new string that contains the elements concatenated together, with a specified delimiter inserted between each element
	//If the elements array is empety or null, the method returns an empty string.
			String result3 = String.join(", ","apple","banana","cherry");
			System.out.println(result3);
			//Result: apple, banana, cherry
			//The method joins the three strings "apple","banana","cherry" with a comma and space as the delimiter
	
	
	
	//66.	join(CharSequence delimiter, Iterable<? extends CharSequence>)
	//Allows to join a sequence of CharSequence elements from an Iterable (List, Set, etc) with a specified delimiter between them.
	//delimiter - A CharSequence that will be placed between each element. For e.g, a comma, a space, etc.
	//elements - An Iterable<? extends CharSequence that contains the elements to be joined.
	//Can be any collection that implements the Iterable interface, such as List, Set, etc.
	//Elements can be any object that implements CharSequence, such as String, StringBuilder, StringBuffer.
	//Returns a new String that contains the elements concatenated together, with the specified delimiter between them.
			List<String> fruits = List.of("apple", "banana", "cherry");
			String result9 = String.join(", ", fruits);
			System.out.println(result9);
			//Result: 
			//apple, banana, cherry
			//String.join(", ", fruits) call joins elemnts in the List(fruits) with a comma and space as the delimiter.
			
	
	
	//67.	valueOf method in String
	//Converts various types of data (such as primitive types, arrays, objects) into a string representation
	//Static method
	//Overloaded to handle different input types
	
	//68.	valueOf(boolean b)
	//Converts boolean value to string representation
	//Parameters - boolean value (true or false)
	//Returns - string representation of boolean value ("true" or "false")
			String str87 = String.valueOf(true);
			System.out.println(str87);
			//Result: true
	
	
	//69.	valueOf(char c)
	//Converts char to its string representation
	//Parameters - char value
	//Returns - a string containing the single character
			String str11 = String.valueOf('A');
			System.out.println(str11);
			//Result: A
	
	//70.	valueOf(char[] data)
	//Converts a character array into a string
	//Parameters - a char[] array
	//Returns - a string containing the characters from the array
			char[] data = {'H', 'e', 'l', 'l', 'o'};
			String str3 = String.valueOf(data);
			System.out.println(str3);
			//Result: Hello
	
	
	//71.	valueOf(double d)
	//Converts a double value to its string representation
	//Parameters - a double value
	//Returns - a string representation of the double value
			String str4 = String.valueOf(12.34);
			System.out.println(str4);
			//Result: 12.34
	
	
	//72.	valueOf(float f)
	//Converts a float value to its string representation
	//Parameters - a float value
	//Returns - a string representation of the float value
			String str5 = String.valueOf(12.34f);
			System.out.println(str5);
			//Result: 12.34

	//73.	valueOf(int i)
	//Converts a int value to its string representation
	//Parameters - a int value
	//Returns - a string representation of the int value
			String str6 = String.valueOf(123);
			System.out.println(str6);
			//Result: 123
	
	
	//74.	valueOf(long l)
	//Converts a long value to its string representation
	//Parameters - a long value
	//Returns - a string representation of the long value
			String str7 = String.valueOf(123456789L);
			System.out.println(str7);
			//Result: 123456789L
	
	
	//75.	valueOf(Object obj)
	//Converts an object to its string representation
	//Parameters - an object. If the object is null, the string "null" is returned.
	//Returns - string representation of the object (via obj.toString()).
			Object obj = new Object();
			@SuppressWarnings("unused")
			String str8 = String.valueOf(obj); //Calls obj.toString()
	
	
	//76.	valueOf(char[] data, int offset, int count)
	//Converts portion of a character array to a string
	//Parameters:
	//char[] data - the character array
	//int offset - the starting index from where to begin copying
	//int count - the number of characters to copy
	//Returs a string containong a specified portion of the character array.
			char[] data1 = {'H', 'e', 'l', 'l', 'o'};
			System.out.println(String.valueOf(data1, 0, 4)); 
			//Result: Hell - starting at index 0, the first 4 characters are copied and converted to string
	
	
	//splitWithDelimiters(String regex, int limit)
	//notify()
	//notifyAll()
	//resolveConstantDesc(Lookup lookup)
		
		
	}
}
