package com.iorta.myowntest;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 60;
		
		char grade;
		
		switch(marks/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;		
		}
		System.out.println("Grade: " + grade);
	}
}
