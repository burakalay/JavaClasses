package review_interface;

public class Walnut extends Fruit implements Crackable {
	// In Java we don't allow multiple inheritance
	// In Java we achieve multiple inheritance through interfaces :)
	public Walnut(String color) {
		super(color);
	}

	@Override
	public void crack() {
		System.out.println("Cracking the walnut");
	}

}
