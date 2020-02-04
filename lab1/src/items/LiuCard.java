package items;

import the_adventure.Player;

public class LiuCard extends Tool {

	public LiuCard(String name, double d, int price, Player player) {
		super(name, d, price, player);
	}

	public void use() {
		this.getPlayer().getLocation().insertLiuCard(this.getPlayer());
	}
}
