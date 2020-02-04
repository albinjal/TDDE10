package items;

import java.util.ArrayList;

import the_adventure.Commandable;
import the_adventure.Player;

public abstract class Item extends Commandable {
	private Player player;
	private double weight;
	public Item(String name, double weight, Player player) {
		super(name);
		this.weight = weight;
		this.player = player;
	}
	
	@Override
	public void addCommands() {
		// TODO Auto-generated method stub

	}
	 
	public static <T extends Item>void printItems(ArrayList<T> items) {
		// Denna va inte dålig ^^
		for (Item item : items) {
			System.out.printf("%s (%s kg)\n", item.getName(), item.getWeight());
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
