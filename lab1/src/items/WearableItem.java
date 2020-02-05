package items;

import the_adventure.Player;

public abstract class WearableItem extends Item {
	public WearableItem(String name, float weight, Player player) {
		super(name, weight, player);
	}

	@Override
	public void addCommands() {
		this.addCommand("wear " + this.getName(), () -> this.wear());

	}

	public void wear() {
		this.getPlayer().addWornitem(this);
		this.getPlayer().popItem(this);

	}

}
