package com.neotech.lesson26;

public class Circle implements Shape {

	int radius;
	
	Circle(int radius) {
		this.radius=radius;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of Circle is: "+radius*radius*3);
		
	}

	@Override
	public void calculatePerimeter() {

		System.out.println("Perimeter of Circle is: "+radius*2*3);
		
	}
	
	
}
