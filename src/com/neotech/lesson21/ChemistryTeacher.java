package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher {

	boolean teachesApChemistry;

	public void doesExperiment() {
		System.out.println(fullName + " does chemistry experiments");
		if (teachesApChemistry==true) {

			System.out.println(fullName + " also teaches AP chemistry");
		}

	}

	public static void main(String[] args) {
      
		ChemistryTeacher ct = new ChemistryTeacher();
		ct.fullName="Walter White";
		ct.major="Chemistry";
		ct.teachesApChemistry=true;
		ct.yearsOfExperience=15;
		
		ct.teaches();
		ct.doesExperiment();
		
	}

}
