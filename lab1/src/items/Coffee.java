package items;

import the_adventure.Player;

public class Coffee extends Tool {
	private static int staminaGain = 30;

	public Coffee(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void use(Player player) {
		player.addStamina(staminaGain);
		player.popItem(this);
		System.out.printf("Coffe gives you energy, stamina increased by %s.\n", staminaGain);
		player.stamina();
	}

}
