package items;

import the_adventure.Player;

public class Coffee extends Tool {
	private static int staminaGain = 30;

	public Coffee(String name, double weight, int price, Player player) {
		super(name, weight, price, player);
	}

	@Override
	public void use() {
		this.getPlayer().addStamina(staminaGain);
		this.getPlayer().popItem(this);
		System.out.printf("Coffe gives you energy, stamina increased by %s.\n", staminaGain);
		this.getPlayer().stamina();
	}

}
