package review_abstraction;

public abstract class Human {

	String name;
	static String planet;
	
	public Human(String name) {
		this.name=name;
	}
	
	public abstract void talk(); //unimplemented method
	
	public void sleep() {
		// implemented method, has a method
		System.out.println("Every human sleeps the same.");
	}
	
	
}
