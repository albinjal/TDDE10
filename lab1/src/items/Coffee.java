package items;

import the_adventure.Player;

public class Coffee extends Tool {
	private static int staminaGain = 30;
	private Player player;
	public Coffee(String name, double weight, int price, Player player) {
		super(name, weight, price);
		this.player = player;
	}

	@Override
	public void use() {
		this.player.addStamina(staminaGain);
		this.player.popItem(this);
		System.out.printf("Coffe gives you energy, stamina increased by %s.\n", staminaGain);
		this.player.stamina();
	}

}
