package the_adventure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player extends Commandable {
	private String name;
	private Location position;
	private int csn;
	private int stamina;
	private ArrayList<Item> items;

	public Player(String name, Location currentLocation) {
		super();
		this.setName(name);
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
	}
	
	protected void commandNotFound(String cmd) {
		boolean x = this.position.doCommand(cmd);
	}
	
	@Override
	protected void addCommands() {
		super.addCommands();
		this.addCommand("north", () -> this.move('n'));
		this.addCommand("east", () -> this.move('e'));
		this.addCommand("south", () -> this.move('s'));
		this.addCommand("west", () -> this.move('w'));
	}
}
