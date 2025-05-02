package com.iorta.collections;

import java.util.TreeMap;

public class MapTreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(3, "Banana");
		treeMap.put(1, "Apple");
		treeMap.put(4, "Cherry");
		treeMap.put(2, "Date");
		
		//Printing TreeMap (Keys will be in sorted order)
		System.out.println("TreeMap (Sorted by Keys): " + treeMap);
		
		//Accessing values by keys
		System.out.println("Value for key 2: " + treeMap.get(2));
		
		//Removing an element
		treeMap.remove(3);
		System.out.println("After removing key 3: " + treeMap);
		
		TreeMap<Integer, String> treeMap1 = new TreeMap<>();
		
		treeMap1.put(10, "Ten");
        treeMap1.put(20, "Twenty");
        treeMap1.put(30, "Thirty");
        treeMap1.put(40, "Forty");
		
		//System.out.println("TreeMap (Sorted in Descending Order): " + treeMap1);
		
		//Retrieving first and last keys
		System.out.println("First Key: " + treeMap1.firstKey());
		System.out.println("Last Key: " + treeMap1.lastKey());
		
		//Finding next higher and lower key
		System.out.println("Higher than 20: " + treeMap1.higherKey(20)); //Returns the smallest key greater than k
		System.out.println("Lower than 20: " + treeMap1.lowerKey(20)); //Returns the largest key smaller than k
	}

}
