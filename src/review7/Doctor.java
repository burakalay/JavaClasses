package review7;
//OOP -> Object Oriented Programming
//1. Inheritance (Trashegimi, Miras, Herencia, Nasledstvo, Meros, Jicheng, Morodok, Spadshuna, Moshtenire)
//2. Polymorphism
//3. Abstraction
//4. Encapsulation
//Every class in Java is extending the Object
//Object class is like Adam in humanity :)
public class Doctor {

	
	String name;
	int salary;
	String licenceId;
	
	//It's a good practice to leave a default constructor
	Doctor() {}
	
	Doctor  (String name, int salary, String licenceId) {
		
		this.name=name;
		this.salary=salary;
		this.licenceId=licenceId;
		                                                }
	
	public void checksUp(String name) {
		System.out.println("Doctor " + this.name + " makes a checkup on " + name);
	}
	
	
	
}
