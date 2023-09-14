package com.neotech.lesson32;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//Create a Map that will store Employee name and salary.
//Write a logic to retrieve an employee who gets the highest salary.
//Output should be in the below format
//	- John Smith=$100000
public class Homework1 {

	public static void main(String[] args) {
		
		Map<String, Integer> emp = new TreeMap<>();
		
		//it should be from key to value
		
		emp.put("Burak", 150000);
		emp.put("Aslı", 120000);
		emp.put("Ballito", 110000);
		emp.put("Davut", 180000);
		emp.put("Meryem", 100000);
		
		System.out.println(emp);
		
		
		
	    Set<String> keys =	emp.keySet();
		Collection<Integer> value = emp.values();
		Integer max=0;
		for(String m: keys) {
			System.out.println(m);
		}
		
		for(Integer v: value) {
			
			if(v>max) {
				max=v;
			}
			
		}
		
		System.out.println(max);
		
		System.out.println("---------------------------------------------------");
		
		Set<Entry<String, Integer>> entrySet = emp.entrySet();
		
		Iterator<Entry<String, Integer>> it=entrySet.iterator();
		
		Entry<String, Integer> maxEntry = it.next();
		
		while(it.hasNext()) {
			
			Entry<String, Integer> entry = it.next();
			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
			
		}
		System.out.println(maxEntry);
	}

}
