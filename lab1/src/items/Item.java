package items;

import java.util.ArrayList;

import the_adventure.Commandable;
import the_adventure.Player;

public abstract class Item extends Commandable {
	private Player player;
	private double weight;
	private int price;
	public Item(String name, double weight, int price, Player player) {
		super(name);
		this.weight = weight;
		this.price = price;
		this.player = player;
	}
	
	@Override
	public void addCommands() {
		// TODO Auto-generated method stub

	}
	 
	public static <T extends Item>void printItems(ArrayList<T> items) {
		// Denna va inte dålig ^^
		int i = 1;
		for (Item item : items) {
			System.out.printf("%s (%s kg)\n", item.getName(), item.getWeight());
			i++;
		}
		System.out.println();
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public double getWeight() {
		return this.weight;
	}

}
