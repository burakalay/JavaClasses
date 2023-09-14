package com.neotech.lesson31;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {

		Map<String, Integer> cities = new TreeMap<>();
		
		cities.put("Paris", 5);
		cities.put("Moscow", 6);
		cities.put("Washington DC", 13);
		cities.put("İstanbul", 8);
		cities.put("Edmonton", 8);
		
System.out.println(cities);
		
		Set<Entry<String, Integer>> entry = cities.entrySet();
		
		Iterator<Entry<String, Integer>> it = entry.iterator();
		
		while(it.hasNext()) {
			
			Entry<String, Integer> eee = it.next();
			
			if(eee.getKey().length()>7) {
				it.remove();
			}
			
			
		}
		
		System.out.println(cities);
		
		
	}

}
