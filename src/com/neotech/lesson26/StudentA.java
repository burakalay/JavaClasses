package com.neotech.lesson26;

public class StudentA extends Marks {

	int mark1, mark2, mark3;
	
	public StudentA(int mark1, int mark2, int mark3) {
		
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	
	@Override
	public double getAverage() {
				
		return (mark1+mark2+mark3)/3;
	}

	
	

	

}
