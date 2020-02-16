package items;

import the_adventure.Player;

public class Bag extends WearableItem {

	private static int staminaGain = 30;

	public Bag(String name, float weight) {
		super(name, weight);
	}

	@Override
	public void wear(Player player) {
		super.wear(player);
		player.subtractStamina(getStamina());
		System.out.printf("You put on the %s and lost %s stamina!", this.getName(), getStamina());
	}

	private static int getStamina() {
		return staminaGain;
	}

}
