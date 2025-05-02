package com.iorta.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//By default LinkedHashMap maintains insertion order (the order elements were added)
		//But, can enable access order by passing true in the constructor
		//When true, LinkedHashMap maintains access order - elements are moved to the end when accessed
		Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
		
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");

		map.get(1); //Element 1, Apple is accessed {2=Banana, 3=Cherry, 1=Apple}
		map.get(3); //Element 3, Cherry is accessed {2=Banana, 1=Apple, 3=Cherry}
		//2=Banana is now the oldest, since it was not accessed
		
		System.out.println("After accessing some entries:");
		System.out.println(map);
		//Output: {2=Banana, 1=Apple, 3=Cherry}
		//Third parameyer - true for access order
		//After accessing map, order of elements is based on the most recently accessed entry
		
		
		Integer oldestKey = map.keySet().iterator().next();
		//keySet() returns a Set of all the keys in the map
		//The first key in the Set will be the oldest (Banana)
		//iterator() returns an iterator over the Set of keys
		//.next() retrieves the first key from this iterator
		
		map.remove(oldestKey); //Banana is removed
		
		
		System.out.println("After removing the oldest entry:");
		System.out.println(map);
	}

}
