package com.iorta.string;

import java.util.HashMap;
import java.util.Map;

public class StringMethods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Muru","Varenya","Priya","varun","harish","piyush","meera","veera"};


		Map<String, Object> map = new HashMap<>();

		for(int i=0; i < names.length; i++) {
			char c = names[i].charAt(0);
			if(names[i].toUpperCase().startsWith(String.valueOf(c).toUpperCase())) {
				if(map.containsKey(String.valueOf(c).toUpperCase())) {
					String namesStr = map.get(String.valueOf(c).toUpperCase()) + names[i] + ",";
					int count = Integer.parseInt(map.get(String.valueOf(c).toUpperCase()+"-Count").toString());
					map.put(String.valueOf(c).toUpperCase(), namesStr);
					map.put(String.valueOf(c).toUpperCase() + "-Count", count + 1);
				} else {
					map.put(String.valueOf(c).toUpperCase(), names[i]+",");
					map.put(String.valueOf(c).toUpperCase() + "-Count", 1);
				} 
			}
		}
		System.out.println(map);
	}
}
