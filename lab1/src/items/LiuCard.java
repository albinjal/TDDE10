package items;

import the_adventure.Player;

public class LiuCard extends Tool {

	public LiuCard(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void use(Player player) {
		player.getLocation().insertLiuCard();
	}
}
