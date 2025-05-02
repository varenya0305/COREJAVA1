package com.iorta.string;

public class StringMethods2 {
	
	public static void main(String[] args) {
		String str = "Sai-Family1,Shana-Family3,Meera-Family1,Ritesh-Family3,Satish-Family1,Ashta-Family2,Sushant-Family1,Rohan-Family2,Milan-Family2";
		StringBuilder family = collectFamilyMembers(str);
		System.out.println(family);
	}

	public static StringBuilder collectFamilyMembers(String str) {
		StringBuilder family = new StringBuilder();
		StringBuilder family1 = new StringBuilder();
		StringBuilder family2 = new StringBuilder();
		StringBuilder family3 = new StringBuilder();
		
		String[] familyMembers = str.split(",");
		for(int i=0; i<familyMembers.length; i++) {
			//System.out.println(familyMembers[i]);
			String[] familyType = familyMembers[i].split("-");
			//System.out.println("Family Type: " + familyType[1]);
			if (familyType[1].equals("Family1")) {
				//System.out.println("Family 1 Members: " + familyType[0]);
				family1.append(familyType[0] + ",");
			} 
			if (familyType[1].equals("Family2")) {
				//System.out.println("Family 2 Members: " + familyType[0]);
				family2.append(familyType[0] + ",");
			}
			if (familyType[1].equals("Family3")) {
				//System.out.println("Family 3 Members: " + familyType[0]);
				family3.append(familyType[0] + ",");
			}
		}
		
		family.append("Family 1 count: " + family1.toString().split(",").length + " and its Members: " + family1.substring(0, family1.lastIndexOf(",")));
		family.append("\n");
		family.append("Family 2 count: " + family2.toString().split(",").length + " and its Members: " + family2.substring(0, family2.lastIndexOf(",")));
		family.append("\n");
		family.append("Family 3 count: " + family3.toString().split(",").length + " and its Members: " + family3.substring(0, family3.lastIndexOf(",")));
		return family;
		
	}
}
