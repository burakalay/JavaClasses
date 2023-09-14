package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.name="DayDay";
		a.color="Yellow";
		a.age=5;
		
		a.sleep();
		a.eat();
		a.displayInfo();
		
		System.out.println("-----------------------------------------");
		
		Dog d = new Dog();
		d.name="Dwight"; //coming from animal class
		d.age=2; //coming from animal class
		d.color="brown"; //coming from animal class
		d.breed="French bulldog"; //coming from Dog class
		
		d.eat(); //coming from animal class
		d.sleep(); //coming from animal class
		d.displayInfo(); //coming from animal class
		d.bark(); //coming from dog class

		System.out.println("-----------------------------------------");
		Cat c = new Cat();
		c.name="Ballito";
		c.age=3;
		c.color="white";
		c.weight=5;
		c.displayInfo();
		c.eat();
		c.sleep();
		c.meow();
		
		System.out.println("-----------------------------------------");
		
		Puppy p = new Puppy();
		p.name="Tiny";
		p.age=1;
		p.breed="pug";
		p.color="black";
		p.hasPottyTraining=false;
		p.displayInfo();

		
	}

}
