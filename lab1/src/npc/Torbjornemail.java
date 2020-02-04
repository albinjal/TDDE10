package npc;

import the_adventure.Player;

public class Torbjornemail extends Npc {

	private static int damage = 20;
	private Boolean redemail = false;
	
	public Torbjornemail(String name, Player player) {
		super(name, player);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addCommands() {
		this.addCommand("read " + this.getName(), () -> this.attack(this.getPlayer(), damage));
	}
	
	@Override
	public void observe() {
		if (!redemail) {
			System.out.print("You have a email on your phone.\n");
		}
	}
	
	public void attack(Player player, int amount) {
		player.subtractStamina(amount);
		System.out.printf("%s: Welcome to the course! \n ....\n", this.getName());
		redemail = true;
	}
	


}
