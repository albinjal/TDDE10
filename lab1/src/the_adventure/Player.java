package the_adventure;

import java.util.Map;
import java.util.function.Function;

public class Player {
	private String name;
	private Location position;
	private int csn;
	private int stamina;
	Map<String, Function<T,R>> mapping;

	public Player(String name, Location currentLocation) {
		this.setName(name);
		this.moveTo(currentLocation);
	}
	
	public void doCommand(String command) {
		
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
