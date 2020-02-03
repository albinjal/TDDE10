package the_adventure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player extends Commandable {
	private String name;
	private Location position;
	private int csn;
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

	protected void move(Character dir) {
		this.moveTo(this.position.getPath(dir));
	}
	
	@Override
	protected void help() {
		System.out.println("\nAvailable commands:");
		super.help();
		this.position.help();
		for (Item item: this.items) {
			item.help();
		}
		System.out.println();
	}
	
	@Override
	protected void commandNotFound(String cmd) {
		int x = this.position.doCommand(cmd);
		for (Item item: this.items) {
			x += item.doCommand(cmd);
			if (x > 0) {
				break;
			}
		}
		System.out.println(0 == x ? "Command not found, use command: 'help' for options" : "");
		
	}
	
	@Override
	protected void addCommands() {
		this.addCommand("help", () -> this.help());
		this.addCommand("north", () -> this.move('n'));
		this.addCommand("east", () -> this.move('e'));
		this.addCommand("south", () -> this.move('s'));
		this.addCommand("west", () -> this.move('w'));
		this.addCommand("items", () -> this.items());
		this.addCommand("stamina", () -> this.stamina());
	}
	
	private void items() {
		System.out.print("Items in inventor:");
		printItems(this.items);
		System.out.print("Worn items:");
		printItems(this.wornItems);

	}
	 
	private static <T extends Item>void printItems(ArrayList<T> items) {
		// Denna va inte dålig ^^
		int i = 1;
		for (Item item : items) {
			System.out.printf(" %s%s", item.getName(), i == items.size() ? "." : ",");
			i++;
		}
		System.out.println();
	}
	
	protected void addItem(Item item) {
		this.items.add(item);
	}
	
	protected void addStamina(int amount) {
		this.stamina += amount;
	}
	
	protected void stamina() {
		System.out.printf("Current stamina: %s\n", this.stamina);
	}
	
	protected boolean popItem(Item item) {
		return this.items.remove(item);
	}
}
