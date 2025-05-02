package com.iorta.string;

public class StringMethods {
	public static void main(String[] args) {
				String familyMember = "Sai-20,Satish-53,Meera-50,Sushant-28";
				findVoterEligibility(familyMember, 20);
		//		String familyPeople = "Satish-Father-M,Meera-Mother-F,Sushant-Brother-M,Varenya-Own-F";
		//		findFullName(familyPeople);
	}
	public static void findVoterEligibility(String familyMembers, int eligibility) {
		String[] familyArray = familyMembers.split(",");
		for(int i=0; i<familyArray.length; i++) {
			
			//System.out.println(familyArray[i]);
		String[] familyNames = familyArray[i].split("-");
			System.out.println("Family Members: " + familyNames[0]);
//			int age = Integer.parseInt(familyNames[1]);
//			if (age >= eligibility) {
//				System.out.println("Eligible voter name: " + familyNames[0]);
//				if (age == eligibility) {
//					System.out.println("First time voter name: " + familyNames[0]);
//				}
//			} else {
//				System.out.println("Non eligible voter name: " + familyNames[0]);
//			}
		}	
	}

//	public static void findFullName(String familyPeople) {
//		String[] newLine = familyPeople.split(",");
//		String myName = "";
//		String myFatherName = "";
//		for(int i=0; i<newLine.length; i++) {
//			//System.out.println(newLine[i]);
//			String [] hyphen = newLine[i].split("-");
//			System.out.println("Test: " + hyphen[1]);
//			if (hyphen[1].equals("Father")) {
//				System.out.println("My father's name is: " + hyphen[0]);
//				myFatherName = hyphen[0];
//			} 
//			if(hyphen[1].equals("Own")) {
//				System.out.println("My name is: " + hyphen[0]);
//				myName += hyphen[0];
//			}
//		}
//		System.out.println("My full name is: " + myName + " " + myFatherName);
//	}
}
