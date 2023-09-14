package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.HashSet;

public class Task {

	public static void main(String[] args) {

		ArrayList<String> task1 = new ArrayList();
		
		task1.add("burak");
		task1.add("aslı");
		task1.add("messi");
		task1.add("hayrettin");
		task1.add("burak");
		task1.add("davut");
		task1.add("aslı");
		
		
		
		HashSet<String> removeDuplicate = new HashSet(task1);
		
		task1.clear();
		task1.addAll(removeDuplicate);
		System.out.println(task1);
		
		
		
	}

}
