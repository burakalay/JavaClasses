package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		
		//Treemap: will order the entries(pairs)alphabetically according to Key
		
		Map<String, Integer> groceries = new TreeMap<>();
		
		
		//first one is key, second one is value, always!
		groceries.put("Milk", 2);
		groceries.put("Bread", 3);
		groceries.put("Eggs", 12);
		//groceries.put(3, "Oil"); Order matters!!!!
	
		groceries.put("Oil", 3);
	    groceries.put("Apple", 2);
		System.out.println(groceries);
		
		groceries.replace("Eggs", 6);
		System.out.println(groceries);

		
		Set<String> keys = groceries.keySet();
		
		System.out.println(keys);
		
		Collection<Integer> values = groceries.values();
		System.out.println(values);
		
		for(String key: keys) {
			
			System.out.println(key);
		}
		
		Iterator<Integer> it = values.iterator();
		
		while(it.hasNext()) {
			
			Integer value = it.next();
			System.out.print(value+" ");
		}
		
	}
}
