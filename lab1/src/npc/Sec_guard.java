package npc;

import the_adventure.Player;

public class Sec_guard extends Human {

	public Sec_guard(String name) {
		super(name);
	}
	
	@Override
	public void interactWith(Player player) {
		System.out.printf("I am THE campus security. Make sure to close doors and windows after you open them!\nNow leave me be, can you not se that I am doing importand stuff here??\n");

	}
	
	@Override
	public void observe() {
		System.out.printf("There is a %s searching for something on a desk.\n", this.getName());

	}

}
