package items;

import the_adventure.Player;

public abstract class Tool extends Item {
	public Tool(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void addCommands() {
		this.addCommand("use " + this.getName(), (Player player) -> this.use(player));
	}

	public abstract void use(Player player);

}
