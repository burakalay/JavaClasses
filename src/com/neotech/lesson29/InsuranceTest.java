package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {

		ArrayList<Insurance> ins = new ArrayList<>();
		
		ins.add(new CarInsurance("Geico", "E63"));
		ins.add(new PetInsurance("Progressive", "Dog"));
		ins.add(new HealthInsurance("Metlife"));
		
		//using iterator
		
		Iterator<Insurance> it = ins.iterator();
		
		while(it.hasNext()) {
			Insurance insurance = it.next();
			insurance.getQuote();
			insurance.calcelInsurance();
		
		
		}
		
		
	}

}
