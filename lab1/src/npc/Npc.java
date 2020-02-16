package npc;

import the_adventure.Commandable;
import the_adventure.Player;

public abstract class Npc extends Commandable {

	private int stamina;

	private Boolean talkState = false;
		
	public Npc(String name) {
		super(name);
		setStamina(100);
	}

	public void setStamina(int stam) {
		this.stamina = stam; 
	}

	public Boolean getTalkState() {
		return talkState;
	}
	
	public void setTalkState(Boolean value) {
		this.talkState = value;
	}
	
	public void subtractStamina(int amount, Player player) {
		this.stamina -= amount;
		if (this.stamina <= 0) {
			this.kill(player);
		}
	}
	
	private void kill(Player player) {
		System.out.println("AAAAAAA you just killed me im so angry. rawr.");
		player.getLocation().setNpc(null);
	}
	
	public abstract void observe();

}
