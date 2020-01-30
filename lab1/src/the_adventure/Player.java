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
	Map<String, Runnable> commands = new HashMap<>();

	public Player(String name, Location currentLocation) {
		super();
		this.setName(name);
		this.moveTo(currentLocation);
	}
	
	@Override
	public void doCommand(String cmd) {
		super.doCommand(cmd);
	}
	
	public void moveTo(Location loc) {
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
}
