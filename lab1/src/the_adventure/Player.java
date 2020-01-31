package the_adventure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player extends Commandable {
	private String name;
	private Location position;
	private int csn;
	private int stamina;
	private ArrayList<Item> items = new ArrayList<Item>();


	public Player(String name, Location currentLocation) {
		super(name);
		this.moveTo(currentLocation);
	}

	public void moveTo(Location loc) {
		if (loc == null) {
			this.cantExecuteCommand();
			return;
		}
		this.position = loc;
		
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
	}
	
	@Override
	protected void commandNotFound(String cmd) {
		int x = this.position.doCommand(cmd);
		for (Item item: this.items) {
			x += item.doCommand(cmd);
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
	}
	
	protected void addItem(Item item) {
		this.items.add(item);
	}
}
