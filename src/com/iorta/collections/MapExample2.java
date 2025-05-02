package com.iorta.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, Object> personalDetails = new LinkedHashMap<>();
		
		List<LinkedHashMap<String, Object>> detailsList = new ArrayList<>();
		
		LinkedHashMap<String, String> countryCode = new LinkedHashMap<>();

		countryCode.put("Malaysia", "+60");
		countryCode.put("Thailand", "+66");
		countryCode.put("India", "+91");
		
		personalDetails.put("Name: ", "Sai Varenya Patkar");
		personalDetails.put("Age: ",  20);
		personalDetails.put("Nationality: ", "Indian");
		personalDetails.put("Country: ", "India");
		personalDetails.put("Phone Number: ", "986255182");
		personalDetails.put("Voter Eligibility: ", true);

		detailsList.add(0, personalDetails);

		personalDetails = new LinkedHashMap<>();

		personalDetails.put("Name: ", "Dhrriti Kumar");
		personalDetails.put("Age: ",  20);
		personalDetails.put("Nationality: ", "Malaysian");
		personalDetails.put("Country: ", "Malaysia");
		personalDetails.put("Phone Number: ", "107637892");
		personalDetails.put("Voter Eligibility: ", true);

		detailsList.add(1, personalDetails);
		
		personalDetails = new LinkedHashMap<>();

		personalDetails.put("Name: ", "John Smith");
		personalDetails.put("Age: ",  54);
		personalDetails.put("Nationality: ", "Thai");
		personalDetails.put("Country: ", "Thailand");
		personalDetails.put("Phone Number: ", "107637892");
		personalDetails.put("Voter Eligibility: ", true);

		detailsList.add(2, personalDetails);
		
		for (LinkedHashMap<String, Object> details : detailsList) {
			for (Map.Entry<String, Object> entry : details.entrySet()) {
				if (entry.getKey().equals("Country: ")) {
					details.put("Phone Number: ", countryCode.get(entry.getValue()) + details.get("Phone Number: "));
				}	
			}
		}
		System.out.println(detailsList);
	}
}
