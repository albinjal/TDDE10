package location;

public class RoomWithLocked extends Location {
	private Location locked;
	private boolean light = false;
	public RoomWithLocked(String name, String description, Location locked) {
		super(name, description);
		this.setLocked(locked);
	}
	
	private void describeLocked() {
		System.out.println("There is also a locked door.");
	}
	
	public void lightUp() {
		this.light = true;
		this.look();
	}
	
	public void setLocked(Location loc) {
		this.locked = loc;
	}
	
	@Override
	public String pathName() {
		return "door";
	}
	
	@Override
	public void look() {
		super.look();
		if (!this.light) {
			System.out.print("The room is dark and you cant see a thing. I wish we had som light...\n");
		} else {
		this.describeLocked();
		}
	}
}
