package items;

import the_adventure.Player;

public abstract class Tool extends Item {
	private Player player;
	public Tool(String name, double weight, int price, Player player) {
		super(name, weight, price);
		this.player = player;
	}
	
	@Override
	public void addCommands() {
		this.addCommand("use " + this.getName(), () -> this.use());
	}
	
	public abstract void use();
	
	protected Player getPlayer() {
		return this.player;
	}

}
