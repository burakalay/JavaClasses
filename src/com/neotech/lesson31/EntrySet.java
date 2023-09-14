package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class EntrySet {

	public static void main(String[] args) {

		Map<String, String> cities = new TreeMap<>();
        
		cities.put("Turkiye", "İzmir");
		cities.put("Albania", "Shkoder");
		cities.put("Taiwan", "Taipei");
		cities.put("USA", "NYC");
		cities.put("Montenegro", "Ulqin");
		
		
		System.out.println(cities);
		
		Set<Entry<String, String>> allEntries = cities.entrySet();
		
		System.out.println(allEntries);
		
		//print all the entries in UPPERCASE letters
		
		for(Entry<String, String> entry: allEntries) {
			
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key.toUpperCase()+" "+value.toUpperCase());
			
			//how would we do this with an iterator??
			
			System.out.println("-------------------------------------------------");
			
			Iterator<Entry<String, String>> it = allEntries.iterator();
			
			while(it.hasNext()) {
				
				Entry<String, String> entry2 = it.next();
				System.out.println(entry2.getKey().toUpperCase()+" "+entry2.getValue().toUpperCase());
				
				
			}
			
		}
		
		
	}

}
