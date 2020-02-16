package items;

import the_adventure.Player;

public abstract class WearableItem extends Item {
	public WearableItem(String name, float weight) {
		super(name, weight);
	}

	@Override
	public void addCommands() {
		this.addCommand("wear " + this.getName(), (Player player) -> this.wear(player));

	}

	public void wear(Player player) {
		player.addWornitem(this);
		player.popItem(this);

	}

}
