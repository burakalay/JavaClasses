package com.neotech.lesson31;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {

	public static void main(String[] args) {

		/**
		 * Create a map of countries with its capital that will store countries in alphabetical order.
Add them randomly in the map.
Example:
    "France" -> "Paris"
    "Kosovo" -> "Prishtina"
    "Turkey" -> "Ankara"
    "USA" -> "Washington DC"
    "Albania" -> "Tirana"
    "Italy" -> "Rome"

    - Print the list and check the order of the countries.
    - Verify if you have your contry (Albania, Turkey) in the list ( use containsKey() method )
    - Verify if a specific capital city is in the list ( use containsValue() method )
    - Get all the keys (countries names) in a Set. Print all country names using for each loop.
    - Get all the values (capital names) in a Collection. Print all capital names using iterator.
		 */
		
		TreeMap<String, String> c = new TreeMap();
		
		c.put("France", "Paris");
		c.put("Kosova", "Prishtina");
		c.put("Turkiye", "Ankara");
		c.put("USA", "Washington, DC");
		c.put("Albania", "Tirana");
		c.put("Italy", "Rome");
		
		System.out.println(c);
		
		System.out.println(c.containsKey("Turkiye"));
		
		System.out.println(c.containsValue("Tokyo"));
		
		Set<String> keys = c.keySet();
		System.out.println(keys);
		
		Collection<String> values = c.values();
		
		System.out.println(values);
		
		
		
	}

}
