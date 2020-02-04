package items;

import the_adventure.Player;

public class Flashlight extends Tool {

	public Flashlight(String name, double weight, Player player) {
		super(name, weight, player);
	}

	@Override
	public void use() {
		this.getPlayer().getLocation().useFlashLight();
	}

}
