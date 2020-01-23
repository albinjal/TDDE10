package the_adventure;

import java.util.ArrayList;

public class Location {
	private String name;
	private String description;
	private ArrayList<Location> paths;
	public Location(String name, String description) {
	}
	
	public void describeYourself() {
		System.out.println(this.description);
	}

	@Override
	public String toString() {
		return String.format("Plats: %s", this.name);
	}

}
