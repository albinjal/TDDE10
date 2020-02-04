package the_adventure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import items.Item;
import items.WearableItem;
import location.Location;

public class Player extends Commandable {
	private String name;
	private Location position;
	private int stamina = 100;
	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<WearableItem> wornItems = new ArrayList<WearableItem>();


	public Player(String name, Location currentLocation) {
		super(name);
		this.position = currentLocation;
	}

	public void moveTo(Location loc) {
		if (loc == null) {
			this.cantExecuteCommand();
			return;
		}
		this.position = loc;
		loc.describeYourself();
		
	}

	public Location getLocation() {
		return this.position;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void move(Character dir) {
		this.moveTo(this.position.getPath(dir));
	}
	
	@Override
	public void help() {
		System.out.println("\nAvailable commands:");
		super.help();
		this.position.help();
		for (Item item: this.items) {
			item.help();
		}
		System.out.println();
	}
	
	private void commandNotFound(String cmd) {
		int x = this.getLocation().doCommand(cmd);
		if (this.getLocation().getNpc() != null) {
			x += this.getLocation().getNpc().doCommand(cmd);
		}
		for (Item item: this.items) {
			x += item.doCommand(cmd);
			if (x > 0) {
				break;
			}
		
		}
		System.out.println(0 == x ? "Command not found, use command: 'help' for options" : "");
		
	}
	
	@Override
	public void addCommands() {
		this.addCommand("help", () -> this.help());
		this.addCommand("north", () -> this.move('n'));
		this.addCommand("east", () -> this.move('e'));
		this.addCommand("south", () -> this.move('s'));
		this.addCommand("west", () -> this.move('w'));
		this.addCommand("items", () -> this.items());
		this.addCommand("stamina", () -> this.stamina());
		this.addCommand("ls", () -> this.help());
	}
	
	private void items() {
		System.out.println("Items in inventory:");
		Item.printItems(this.items);
		System.out.println("Worn items:");
		Item.printItems(this.wornItems);

	}

	
	@Override
	public int doCommand(String cmd) {
		int x = super.doCommand(cmd);
		if (x == 0) {
			this.commandNotFound(cmd);
		}
		return x;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void addWornitem(WearableItem item) {
		this.wornItems.add(item);
	}
	
	public void addStamina(int amount) {
		this.stamina += amount;
	}
	
	public void subtractStamina(int amount) {
		this.stamina -= amount;
	}
	
	public void stamina() {
		System.out.printf("Current stamina: %s\n", this.stamina);
	}
	
	public boolean popItem(Item item) {
		return this.items.remove(item);
	}
	
	public int getStamina() {
		return stamina;
	}
	
	
}
