package review8;

public class World {

	public static void main(String[] args) {

		Human.planet = "Earth";
		Human h1 = new Human();
		System.out.println(h1.name + " lives in " + Human.planet);

		Human h2 = new Human("Burhan");
		System.out.println(h2.name + " lives in " + Human.planet);
		Human.planet = "Mars"; // We are sending everyone to Mars
		System.out.println("--------------------------------");
		System.out.println(h2.name + " lives in " + Human.planet);
		// Declaring a variable of type Human
		Human h3;
		// Creating an Albanian and assigning to h3
		h3 = new Albanian("Ermal"); // up-casting
		System.out.println(h3.name + " lives in " + Human.planet);
		Human h4 = new Turkish("Elif"); // up-casting, automatically

		System.out.println("----Let us make the people talk, by giving money :) ----");
		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();
		// Polymorphism
		// Method overriding
		// Run time Polymorphism/late binding/dynamic binding

		// Compile Error, because h4 is of type human
		// h4.makeBaklava();

		System.out.println("--------------------------------");
		Turkish t1 = (Turkish) h4; // down-casting, manually
		t1.makeBaklava();

		// This will give a runtime error
		// Turkish t2 = (Turkish) h3;
		// t2.makeBaklava();

		System.out.println("--------------------------------");

		// This is a safe way to down-cast
		if (h3 instanceof Albanian) {
			// Can cast/convert into Albanian
			Albanian alb = (Albanian) h3;
			alb.albanianDance();
		} else if (h3 instanceof Turkish) {
			// Can cast/convert into Turkish
			Turkish tur = (Turkish) h3;
			tur.makeBaklava();

		}

		System.out.println("--------------------------------");
		
		Human h5 = new Greek("Kosta");
		h5.talk();
		System.out.println(h5.name+" lives in "+Human.planet);

		System.out.println("------------------------------------");
		
		Human[] humArray={h1,h2,h3,h4,h5};
		
		for(Human h: humArray) {
			h.talk();
			h.sleep();
		}
	}

}
