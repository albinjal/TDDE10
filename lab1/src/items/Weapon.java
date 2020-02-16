package items;

import npc.Npc;
import the_adventure.Player;

public class Weapon extends Item {
	private int dmg;

	public Weapon(String name, double weight, int dmg) {
		super(name, weight);
		this.setDmg(dmg);
	}

	@Override
	public void addCommands() {
		this.addCommand(String.format("attack with %s", this.getName()), (Player player) -> this.attack(player));
	}

	/**
	 * 	TODO: Kommentar, när ni utför ändringen till att inte lagra en Player i Item måste ni ju ta in en parameter här.
	 * 	Fundera över om Player då är den rimligaste typen eller om någon annan vore bättre.
	 */
	public void attack(Player player) {
		Npc x = player.getLocation().getNpc();
		if (x != null) {
			System.out.printf("Damn you just hit %s and reduced its stamina by %s.\n", x.getName(), this.getDmg());
			x.subtractStamina(this.getDmg(), player);
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
