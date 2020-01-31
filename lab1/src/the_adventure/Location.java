package the_adventure;

import java.util.ArrayList;

public class Location extends Commandable {
	private String name;
	private String description;
	private Location north;
	private Location west;
	private Location south;
	private Location east;
	public Location(String name, String description) {
		this.north = null;
		setName(name);
		setDesc(description);
	}
	
	private void setName(String name) {
		this.name = name;
	}

	private void setDesc(String desc) {
		this.description = desc;
	}
	
	public void describeYourself() {
		System.out.println(this.description);
	}
	
	protected void help() {
		
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
		return this.name;
	}

	@Override
	protected void commandNotFound(String cmd) {
		
	}
	

}
