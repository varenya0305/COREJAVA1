package com.iorta.myowntest;

public class MyOwn {
	
	
	public static void main(String[] args) {
		String familyDetails = "Satish-53,Meera-50,Sushant-28,Varenya-20,Siri-17";
		findVoterEligibility(familyDetails,19);
	}
	
	public static void findVoterEligibility(String familyDetails, int eligibilityAge) {
		String[] members = familyDetails.split(",");
		for(int i=0; i < members.length; i++) {
			
			//System.out.println("Family Member: " + members[i]);
			
			String[] nameAge = members[i].split("-");
			//System.out.println("Member Name: " + nameAge[0]);
			
			int age = Integer.parseInt(nameAge[1]);
			//System.out.println(age);
			
			if(age >= eligibilityAge) {
				System.out.println("Eligible Voter Name: " + nameAge[0]);
				
				if(age == eligibilityAge) {
					System.out.println("First Time Voter Name: " + nameAge[0]);
				}
				
			} else {
				System.out.println("Non eligible Voter Name: " + nameAge[0]);
			}
		}
	}

}
