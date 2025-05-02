package com.iorta.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//1
		LinkedHashMap<String, String> map  = new LinkedHashMap<>();
		
		map.put("Father", "Satish");
		map.put("Mine", "Sai");
		map.put("Mother", "Meera");
		map.put("Brother", "Sushant");
		
		System.out.println(map);
	
		StringBuilder sb = new StringBuilder();
		if(map.containsKey("Mine") && map.get("Mine") != null && map.get("Mine") != "") {
			sb.append(map.get("Mine") + " ");
		}
		if(map.containsKey("Father")) {
			sb.append(map.get("Father"));
		}
	    System.out.println("Full Name: " + sb);
	    
		//2
		LinkedHashMap<String, String> family = new LinkedHashMap<>();

		List<LinkedHashMap<String, String>> familyList = new ArrayList<>();
		
		family.put("Father", "Satish");
		family.put("Mine", "Sai");
		family.put("Mother", "Meera");
		family.put("Brother", "Sushant");
		
		familyList.add(0, family);
		
		family = new LinkedHashMap<>();
		
		family.put("Father", "Suresh");
		family.put("Mine", "Siri");
		family.put("Mother", "Sheila");
		family.put("Brother", "Divesh");		
				
		familyList.add(1, family);
		
		System.out.println(familyList);
	}
}
