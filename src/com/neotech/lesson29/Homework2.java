package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework2 {
	
	public static void main(String[] args) {
		
		//	Create an arrayList of even numbers from 1 to 50. 
		//	Using Iterator remove any number that is divisible by 5 from 
		//	that arrayList.
		
		ArrayList<Integer> numbers = new ArrayList();
		
		for(int i=0; i<=50; i=i+2) {
			
		numbers.add(i);
		}
		
		Iterator<Integer> it = numbers.iterator();
		
		while(it.hasNext()) {
			Integer num = it.next();
			
			if(num%5==0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
