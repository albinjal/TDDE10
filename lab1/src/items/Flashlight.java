package items;

import the_adventure.Player;

public class Flashlight extends Tool {

	public Flashlight(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void use(Player player) {
		player.getLocation().useFlashLight();
	}

}
