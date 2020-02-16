package items;

import java.util.ArrayList;

import the_adventure.Commandable;

public abstract class Item extends Commandable {
	private double weight;

	public Item(String name, double weight) {
		super(name);
		this.setWeight(weight);
	}

	public static <T extends Item> void printItems(ArrayList<T> items) {
		for (Item item : items) {
			System.out.printf("%s (%s kg)\n", item.getName(), item.getWeight());
		}
		System.out.println();
	}

	public double getWeight() {
		return this.weight;
	}

	private void setWeight(double weight) {
		this.weight = weight;
	}

}
