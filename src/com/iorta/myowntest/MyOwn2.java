	package com.iorta.myowntest;
	
	public class MyOwn2 {
		
		public static void main(String[] args) {
			String familyDetails = "Satish-53-M,Meera-50-F,Sushant-28-M,Siri-20-F";
		findFullName(familyDetails);
	}
	
	public static void findFullName(String familyDetails) {
		String myName = "";
		String dadName = "";
		String[] nameAgeGender = familyDetails.split(",");
		for(int i=0; i < nameAgeGender.length; i++) {
			//System.out.println("Family Member: " + nameAgeGender[i]);
			String[] name = nameAgeGender[i].split("-");
			//System.out.println("Member Name: " + name[0]);
			if(name[0].equals("Satish")) {
				System.out.println("My father's name is " + name[0]);
				 dadName = name[0]; 
			} 
			if(name[0].equals("Siri")) {
				System.out.println("My name is " + name[0]);
				 myName += name[0];
			}
		}
		System.out.println("My full name is " + myName + " " + dadName);
		}
	}
