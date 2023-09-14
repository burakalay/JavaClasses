package review_interface;

public class FruitDemo {

	public static void main(String[] args) {

		Apple a = new Apple("Yellow");
		a.peel();
		a.wash();
		
		Walnut w = new Walnut("Brown");
		w.crack();
		
		Fruit f = new Apple("Red"); //up-casting
	//	f.peel();
	//	f.wash();
		
		Apple a2 = (Apple) f; // down-casting
		a2.peel();
		a2.wash();
		
		// We cannot create an object from an interface
		// Peelable p = new Peelable();
		
		Peelable p2 = new Apple("Green");
		// wash() method is not defined in the Peelable Interface
		// p2.wash();
		
		Apple a3 = (Apple)p2; // down-casting
		a3.wash();
		
		Orange o1 = new Orange("Orange");
		o1.peel();
		
		Orange o2 = new Orange("Orange");
		o2.peel();
		System.out.println("-----------------------------------");
		Peelable[] peelAbleArray = {a,o1,o2};
		
		for(Peelable m: peelAbleArray) {
			
			m.peel();
		}

		
		
		
	}

}
