package review8;

public class Greek extends Human{
	
	Greek() {
		
	}
	
	public Greek(String name) {
		
		super(name);
	}
	
	@Override
  public void talk() {
		System.out.println("Greek speaks Greek");
	}

}
