package items;

import the_adventure.Player;

public class Bag extends WearableItem {

	private static int staminaGain = 30;
	
	
	public Bag(String name, float weight, int price, Player player) {
		super(name, weight, price, player);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void wear(Player player) {
		super.wear(player);
		player.subtractStamina(this.getStamina());
		System.out.printf("You put on the %s and gain %s stamina!", this.getName(), this.getStamina());
	}
	
	private int getStamina() {
		return staminaGain;
	}

}
