package review7;

public class HospitalApplication {

	public static void main(String[] args) {

		Doctor d1 = new Doctor("Burak", 150000, "TR1907");
		d1.checksUp("Aslı");
		
		// These are variables and methods of the child class
				// d1.dermId = "XYZ";
				// d1.applySkinTreatment();
				
				// Creating a Dermatologist with NO initial information
		
		Dermatologist d2 = new Dermatologist();
		d2.name="Aslı";
		d2.salary=150000;
		d2.licenceId="TR19072";
		d2.dermId="TRD1907";
		
		d2.checksUp("Burak");
		d2.applySkinTreatment("Burak");
		
System.out.println("----------------");
		
		// Creating a Dermatologist with 4 parameters
		Dermatologist d3 = new Dermatologist("Alban", 380000, "AL352", "D938");
		d3.checksUp("Cihan");
		d3.applySkinTreatment("MEL");
		
		System.out.println("----------------");
	// The Constructors are NOT inherited
		// Dermatologist d4 = new Dermatologist("Can", 390000, "TR352");	
	}

}
