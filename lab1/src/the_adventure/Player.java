package the_adventure;

public class Player {
	private String name;
	private Location position;
	private int csn;
	private int stamina;

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
