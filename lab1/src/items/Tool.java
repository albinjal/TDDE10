package items;

import the_adventure.Player;

public abstract class Tool extends Item {
	public Tool(String name, double weight, Player player) {
		super(name, weight, player);
	}
	
	@Override
	public void addCommands() {
		this.addCommand("use " + this.getName(), () -> this.use());
	}
	
	public abstract void use();
	


}
