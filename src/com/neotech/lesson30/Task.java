package com.neotech.lesson30;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {

		HashMap<Integer, String> building = new HashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "NeoTech");
		building.put(4, "Sixt");
		building.put(5, "Apple");
		building.put(3, "Nissan" );
		building.put(6, "Garenta");
		building.put(7, "Dokay");
		System.out.println(building);
		System.out.println();
		System.out.println("The size of building is: "+building.size());
		System.out.println();
		
		building.replace(4, "Avis");
		System.out.println(building);
		
		building.remove(7);
		System.out.println(building);
		
		
		
	}

}
