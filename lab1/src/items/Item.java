package items;

import the_adventure.Commandable;

public abstract class Item extends Commandable {
	private double weight;
	private int price;
	public Item(String name, double weight, int price) {
		super(name);
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	public void addCommands() {
		// TODO Auto-generated method stub

	}

	

}
