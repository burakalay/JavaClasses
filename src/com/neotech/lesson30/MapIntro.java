package com.neotech.lesson30;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Burak");
		map.put(2, "Aslı");
		map.put(3, "Ballito");
		
		// Key, Value pair
		
		
		boolean isEmpty = map.isEmpty();
		System.out.println("Is my map empty? "+isEmpty);
		
		System.out.println("The size of the map: "+map.size());
		System.out.println(map);
		// Value can be dublicate, but key has to be unique.
		map.put(4, "Burak");
		
		// how do we replace a value?
		
		map.replace(2, "Büşra");
		System.out.println(map);
		
		//how do we remove value from map?
		map.remove(3);
		System.out.println(map);
		
		//check if an entry exists
		boolean checkKey = map.containsKey(2);
		System.out.println(checkKey);
		
		//check if Yasemin is in the map?
		
		boolean checkValue = map.containsValue("yasemin");
		System.out.println(checkValue);
	}

}
