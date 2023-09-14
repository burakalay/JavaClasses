package com.neotech.lesson21;

public class MathTeacher extends Teacher{
	
	boolean goodWithNumbers;
	
	public void teachesMath() {
		System.out.println(fullName+" is teaching Math");
	}
		
	public static void main(String[] args) {
	
		MathTeacher mt = new MathTeacher();
		
		mt.fullName="Burak Alay";
		mt.goodWithNumbers=true;
		mt.major="Math";
		
		mt.teaches();
		mt.teachesMath();
		
		
		
	}

}
