package com.neotech.lesson24;

/**
 * 
 * Homework: ▪ Create a Class Computer that will have 4 subclasses as Apple,
 * Lenovo, HP, Dell. ▪ Define some common behavior (methods) and some fields in
 * the parent class, and override some of the methods in the child classes. ▪
 * Define some methods specific to the child classes. ▪ Create objects of the
 * child classes and store them in an array. ▪ Loop through each object and
 * execute available methods.
 *
 */
public class Computer {

	public void Process() {
		System.out.println("Computer is processing");
	}

	public void Render() {
		System.out.println("computer is rendering");
	}

	public void Upload() {
		System.out.println("Computer uploads files");
	}

	public void Download() {
		System.out.println("Computer downloads something");
	}
}

class Apple extends Computer {
	@Override
	public void Process() {
		System.out.println("Apple is processing");
	}

	@Override
	public void Render() {
		System.out.println("Apple is rendering");
	}

	@Override
	public void Upload() {
		System.out.println("Apple uploads files");
	}

	@Override
	public void Download() {
		System.out.println("Apple downloads something");
	}
	
	public void Price() {
		System.out.println("Apple is really pricey");
	}
}

class Lenovo extends Computer {
	@Override
	public void Process() {
		System.out.println("Lenovo is processing");
	}

	@Override
	public void Render() {
		System.out.println("Lenovo is rendering");
	}

	@Override
	public void Upload() {
		System.out.println("Lenovo uploads files");
	}

	@Override
	public void Download() {
		System.out.println("Lenovo downloads something");
	}
	
	public void Design() {
		System.out.println("Lenovo's design is really cool");
	}
}

class HP extends Computer {
	@Override
	public void Process() {
		System.out.println("HP is processing");
	}

	@Override
	public void Render() {
		System.out.println("HP is rendering");
	}

	@Override
	public void Upload() {
		System.out.println("HP uploads files");
	}

	@Override
	public void Download() {
		System.out.println("HP downloads something");
	}
	
	public void CoolingDown() {
		System.out.println("HP is cooling down");
	}
}

class DELL extends Computer {
	@Override
	public void Process() {
		System.out.println("DELL is processing");
	}

	@Override
	public void Render() {
		System.out.println("DELL is rendering");
	}

	@Override
	public void Upload() {
		System.out.println("DELL uploads files");
	}

	@Override
	public void Download() {
		System.out.println("DELL downloads something");
	}
	
	public void Quality() {
		System.out.println("DELL produces high-quality products");
	}
}
