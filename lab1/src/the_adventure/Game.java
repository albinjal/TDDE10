package the_adventure;

import java.util.*;

public class Game {
	private Scanner keyboard;
	private ArrayList<Location> locations;
	private Player player;

	public Game() {
		keyboard = new Scanner(System.in);
		locations = new ArrayList<Location>();
		locSetup();
	}

	private void locSetup() {
		locations.add(new Location("SU", "0"));
		locations.add(new RoomWithHidden("G-LAN", "1"));
		locations.add(new Location("Baljan", "2"));
		locations.add(new Location("C1", "3"));
		locations.add(new OutdoorsArea("Blå Havet", "4"));
		createPaths();
	}

	private void createPaths() {
		int i = 0;
		int[][] pathMap = { { -1, -1, 1, -1 }, { 0, -1, 2, 4 }, { 1, -1, -1, 3 }, { 4, 2, -1, -1 }, { -1, 1, 3, -1 }, };
		for (int[] paths : pathMap) {
			Location loc = this.locations.get(i);
			int p = 0;
			for (int path : paths) {
				loc.setPath(p, path == -1 ? null : this.locations.get(path));
				p++;
			}
			i++;
		}
		
	}
	
	private void addItems() {
		locations.get(4).addItem(new LiuCard("abbster"), this.player);
		locations.get(4).addItem(new LiuCard("danne"), this.player);
	}

	public void run() {
		String name;

		System.out.println("Welcome to the adventure game!\nWhat is your name?");
		// name = keyboard.nextLine();
		name = "lul";
		this.player = new Player(name, locations.get(4));
		this.addItems();
		System.out.println("Hello " + name
				+ ", welcome to this magical world of wonder! You can move around by typing north/south/west/east. You will have to learn more commands as you play the game! (Hint: there is a command \"help\").");

		player.getLocation().printPath();
		while (true) {
			String command;

			player.getLocation().describeYourself();
			System.out.println("What do you want to do?");
			command = keyboard.nextLine();
			player.doCommand(command);
		}
	}
}