package the_adventure;

import java.util.ArrayList;

public class Location extends Commandable {
	private String description;
	private Location north;
	private Location west;
	private Location south;
	private Location east;
	private ArrayList<Item> items = new ArrayList<Item>();
	public Location(String name, String description) {
		super(name);
		setDesc(description);
	}
	
	private void setDesc(String desc) {
		this.description = desc;
	}
	
	public void describeYourself() {
		System.out.println(this.description);
	}
	
	
	public void setPath( int path, Location loc) {
		switch(path) {
		case 0: this.north = loc; break;
		case 1: this.east = loc; break;
		case 2: this.south = loc; break;
		case 3: this.west = loc; break;
		}
	}
	
	public Location getPath(Character dir) {
		switch (dir) {
		case 'n': return this.north;
		case 'e': return this.east;
		case 's': return this.south;
		case 'w': return this.west;
		default: return null;
		}
	}
	
	public void printPath() {
		System.out.println(this.east);
	}

	@Override
	public String toString() {
		return this.getName();
	}

	@Override
	protected void commandNotFound(String cmd) {

	}
	
	@Override
	protected void addCommands() {
	}
	
	protected void addItem(Item item, Player player) {
		this.items.add(item);
		this.addCommand("take " + item.getName(), () -> this.giveItem(item, player));
	}
	
	protected void giveItem(Item item, Player player) {
		player.addItem(item);
		this.removeItem(item);
	}
	
	private void removeItem(Item item) {
		this.items.remove(item);
		this.deleteCommand("take " + item.getName());
	}
	

}
