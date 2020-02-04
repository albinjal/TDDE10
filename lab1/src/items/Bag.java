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
		this.getPlayer().subtractStamina(this.getStamina());
		System.out.printf("You put on the %s and gain %s stamina!", this.getName(), this.getStamina());
	}
	
	private int getStamina() {
		return staminaGain;
	}

}
