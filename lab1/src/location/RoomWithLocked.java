package location;

import the_adventure.Player;

public class RoomWithLocked extends DarkLocation {
	private Location locked;
	private boolean unlocked = false;

	public RoomWithLocked(String name, String description, Location locked) {
		super(name, description);
		this.setLocked(locked);
	}
	
	private void describeLocked() {
		System.out.println(unlocked ? "There is also a door previously locked." : "There is also a locked door.");
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
		if (this.getLit()) {
			this.describeLocked();
		}
	}

	
	private void enterLocked(Player player) {
		player.moveTo(locked);
	}
	
	@Override
	public void insertLiuCard(Player player) {
		if (this.unlocked) {
			System.out.println("The door at this location has already been unlocked.");
		} else {
			System.out.println("The Liu card unlocked a new door, which can now be entered.");
			this.addCommand("enter door", () -> this.enterLocked(player));

		}

	}
}
