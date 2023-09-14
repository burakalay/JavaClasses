package com.neotech.lesson29;

import java.util.ArrayList;

public class Homework1 {

	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList();
		drinks.add("coffee");
		drinks.add("soda");
		drinks.add("latte");
		drinks.add("fanta");
		drinks.add("tea");
		
		for(String drink: drinks) {
			
			if(drink.contains("e") || drink.contains("a")) {
				
				drink = drink.replaceAll(drink, "water");
				}
			System.out.print(drink+" ");
		}
		System.out.println();
		System.out.println(drinks);
	}

	}

