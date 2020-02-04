package npc;

import the_adventure.Player;

public abstract class Human extends Npc {

	public Human(String name, Player player) {
		super(name, player);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addCommands() {
		this.addCommand("talk to " + this.getName(), () -> this.interactWith(this.getPlayer()));
	}
	
	public void interactWith(Player player) {
		if (!this.getTalkState()) {
			this.setTalkState(true);
			System.out.printf("%s: Hello %s!\n My name is %s.\n",this.getName(), player.getName(), this.getName());
		}
		else {
			System.out.printf("%s: Hi there!\n", this.getName());
		}
		
	}


}
