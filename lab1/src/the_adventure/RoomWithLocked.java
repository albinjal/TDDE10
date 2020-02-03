package the_adventure;

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
	
	protected void lightUp() {
		this.light = true;
		this.look();
	}
	
	protected void setLocked(Location loc) {
		this.locked = loc;
	}
	
	@Override
	protected String pathName() {
		return "door";
	}
	
	@Override
	protected void look() {
		if (this.light) {
			System.out.print("The room is dark and you cant see a thing. I wish we had som lighting...");
		} else {
		super.look();
		this.describeLocked();
		}
	}
}
