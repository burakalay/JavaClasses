package review7;

public class Dermatologist extends Doctor{
	
	String dermId;
	
	Dermatologist() {}
	
	
	//The constructors are not inherited
	
	Dermatologist(String name, int salary, String licenceId, String dermId) {
		
		super(name,salary,licenceId);
		// super.name = name;
				// super.salary = salary;
				// super.licenceId = licenceId;
	
		this.dermId = dermId;
	}
	public void applySkinTreatment(String name) {
		System.out.println("Doctor " + this.name + " applies skin treatment on "+ name);
	}

}
