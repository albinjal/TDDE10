package items;

import npc.Npc;
import the_adventure.Player;

public class Weapon extends Item {
	private int dmg;

	public Weapon(String name, double weight, Player player, int dmg) {
		super(name, weight, player);
		this.setDmg(dmg);
	}

	@Override
	public void addCommands() {
		this.addCommand(String.format("attack with %s", this.getName()), () -> this.attack());
	}

	public void attack() {
		Npc x = this.getPlayer().getLocation().getNpc();
		if (x != null) {
			System.out.printf("Damn you just hit %s and reduced its stamina by %s.\n", x.getName(), this.getDmg());
			x.subtractStamina(this.getDmg());
		} else {
			System.out.println("What are you doing? There is not even an enemy at this location...");
		}
	}

	public int getDmg() {
		return this.dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
}
