package com.neotech.lesson22;

public class CalculateArea {

	void area(int a) {
				
		System.out.println("Area of square is: "+a*a);
	}
	
	void area(int side1, int side2) {
		System.out.println("Area of rectangle is: "+side1*side2);
	}
	
	void area(int length, int width, int height) {
		
		System.out.println("Area of box is: "+length*width*height);
		
	}
}
