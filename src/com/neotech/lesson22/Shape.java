package com.neotech.lesson22;

public class Shape {
	
	/**
	 * Homework 5:
    Write program: Shape class has a constructor that takes
    the radius and has a subclass as Circle class. In Circle
    class create a method to calculate the area of circle. Test
    your code
	 */
	
	
	int radius;
	
	public Shape(int radius) {
		this.radius=radius;
		}

}

class Circle extends Shape {

  Circle(int radius){
	  super(radius);
  }

	void areaOfCircle() {
		
		double pi=3.14;
		double area = pi*radius*radius;
	    System.out.println(area);
	}
	
}
