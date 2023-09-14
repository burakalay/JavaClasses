package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList();
		
		words.add("Burak");
		words.add("Ali Rıza");
		words.add("Fenerbahce");
		words.add("Hatice");
		words.add("Halime");
		words.add("apple");
		
		System.out.print(words+" ");
		System.out.println();
		
		Iterator<String> it = words.iterator();
			
		while(it.hasNext()) {
			String word = it.next();
			
			if(word.endsWith("e")) {
				it.remove();
			}
		}
		
		System.out.println("The new list is: "+words);
	}

}
