package items;

import the_adventure.Player;

public abstract class WearableItem extends Item {
	private Player player;
	public WearableItem(String name, float weight, int price, Player player) {
		super(name, weight, price);
		this.player = player;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addCommands() {
		this.addCommand("wear " + this.getName(), () -> this.wear(player));
		
	}
	
	public void wear(Player player) {
		this.player.addWornitem(this);
		this.player.popItem(this);
		
	}

}
