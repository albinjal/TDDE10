package items;

import the_adventure.Player;

public class LiuCard extends Tool {

	public LiuCard(String name, double d, Player player) {
		super(name, d, player);
	}
	
	@Override
	public void use() {
		this.getPlayer().getLocation().insertLiuCard(this.getPlayer());
	}
}
