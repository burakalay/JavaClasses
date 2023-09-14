package review_abstraction;

public class Albanian extends Human {

	public Albanian(String name) {
		super(name);
                               	}

	@Override
	public void talk() {
		System.out.println(name+" says Pershandetje");
	}
	
	public void albanianDance() {
		System.out.println("Dancing valle Kosovare!");
	
	}
}
