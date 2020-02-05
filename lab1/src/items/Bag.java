package items;

import the_adventure.Player;

public class Bag extends WearableItem {

	private static int staminaGain = 30;

	public Bag(String name, float weight, Player player) {
		super(name, weight, player);
	}

	@Override
	public void wear() {
		super.wear();
		this.getPlayer().subtractStamina(getStamina());
		System.out.printf("You put on the %s and lost %s stamina!", this.getName(), getStamina());
	}

	private static int getStamina() {
		return staminaGain;
	}

}
