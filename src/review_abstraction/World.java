package review_abstraction;

public class World {

	public static void main(String[] args) {

		//I cannot create an object from an abstract class
		//Human h1 = new Human("Olga");

		//up-casting and down-casting
		//can ONLY be done because of INHERITANCE
		
		Human a1 = new Albanian("Alban");//this is an up-casting
		a1.talk();
		a1.sleep();
		//a1.albanianDance(); // this can't be done, bc it's not defined in human class
		Albanian alb = (Albanian) a1;
		alb.albanianDance();
		
		System.out.println("------------------------------");
		Human t1 = new Turkish("Mesut"); //this is another up-casting
		t1.talk();
		t1.sleep();
		//t1.makeBaklava(); this can't be done
		
		Turkish tur = (Turkish) t1; // this is a down-casting
		tur.makeBaklava();
	}

}
