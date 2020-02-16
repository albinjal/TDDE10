package the_adventure;

import java.util.ArrayList;

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
		for (Item item : this.items) {
			item.help();
		}
		System.out.println();
	}

	private void commandNotFound(String cmd, Player player) {
		int x = this.getLocation().doCommand(cmd, player);
		if (this.getLocation().getNpc() != null) {
			x += this.getLocation().getNpc().doCommand(cmd, player);
		}
		for (Item item : this.items) {
			x += item.doCommand(cmd, player);
			if (x > 0) {
				break;
			}

		}
		if (0 == x) {
			System.out.println("Command not found, use command: 'help' for options");
		}
		System.out.println();

	}

	@Override
	public void addCommands() {
		this.addCommand("help", (Player player) -> this.help());
		this.addCommand("north", (Player player) -> this.move('n'));
		this.addCommand("east", (Player player) -> this.move('e'));
		this.addCommand("south", (Player player) -> this.move('s'));
		this.addCommand("west", (Player player) -> this.move('w'));
		this.addCommand("items", (Player player) -> this.items());
		this.addCommand("stamina", (Player player) -> this.stamina());
		this.addCommand("ls", (Player player) -> this.help());
	}

	private void items() {
		System.out.println("Items in inventory:");
		Item.printItems(this.items);
		System.out.println("Worn items:");
		Item.printItems(this.wornItems);

	}

	@Override
	public int doCommand(String cmd, Player player) {
		int x = super.doCommand(cmd, player);
		if (x == 0) {
			this.commandNotFound(cmd, player);
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
