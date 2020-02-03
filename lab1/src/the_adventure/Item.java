package the_adventure;

public abstract class Item extends Commandable {
	private double weight;
	private int price;
	public Item(String name, double weight, int price) {
		super(name);
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	protected void commandNotFound(String cmd) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void addCommands() {
		// TODO Auto-generated method stub

	}

	

}
