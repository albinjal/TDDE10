package npc;

import the_adventure.Player;

public class Torbjorn extends Human {

	
	public Torbjorn(String name) {
		super(name);
		
	}
	
	@Override
	public void interactWith(Player player) {
		System.out.printf("I am you course admin. I hope you have studied well so that you are prepared for whats to come!\n"
				+ "I dare you to do my Ada exam...");
		this.addCommand("do exam", (Player p) -> this.exam(p));

	}
	
	@Override
	public void observe() {
		System.out.printf("%s is standing, lurking in the shadows...\n", this.getName());
	}
	
	private void exam(Player player) {
		
		if (player.getStamina() > 70) {
			System.out.print("You did not pass the exam due too exhaustion!!");
		}
		else {
			System.out.print("You passed the exam!!");
		}
	}
	
	

}
