package com.neotech.lesson26;

public class Square implements Shape {
	int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public void calculateArea() {

		System.out.println("Area of square is: "+side*side);
	}

	@Override
	public void calculatePerimeter() {
System.out.println("Perimeter of a square is: "+4*side);
	}

}
