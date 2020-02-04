package the_adventure;

import java.util.*;
import items.*;
import location.*;
import npc.*;

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
		locations.add(new Location("SU", "The rooms of SU. Dreaded by many, loved by few. As you enter the room you trust yourself with the fact that the\ncomputers has got two monitors"));
		locations.add(new RoomWithLocked("G-LAN", "G-Lan, the place for crushing programming courses!\nYou have finally reached one of the few rooms with computers and nice chairs!", locations.get(0)));
		locations.add(new Location("Baljan", "As you make your way towards Baljan you enter an, all to small, corridor that is overly crowded by students.\nThe students stand in line eagerly wating to buy coffe as to replenish their stamina."));
		locations.add(new Location("C1", "The lecture hall C1, with blue seats and six whiteboards, smells of coffe and students.\nAt the moment no lecture is held."));
		locations.add(new OutdoorsArea("Blå Havet", "You find yourself outside, surrounded by hundreds and hundreds of bikes,\nstudents and several big buildings.\nOn a sign you can tell that this place is called Blå Havet"));
		createPaths();
	}

	private void createPaths() {
		int i = 0;
		int[][] pathMap = { { -1, -1, 1, -1 }, { -1, -1, 2, 4 }, { 1, -1, -1, 3 }, { 4, 2, -1, -1 }, { -1, 1, 3, -1 } };
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
		locations.get(4).addItem(new LiuCard("Liu card", 0.5, 2, this.player), this.player);
		locations.get(4).addItem(new Coffee("coffe", 0.3, 4, this.player), this.player);
		locations.get(3).addItem(new Flashlight("flashlight", 0.3, 4, this.player), this.player);
		locations.get(1).addItem(new Bag("bag", 5, 20, this.player), this.player);
	}
	
	private void addNpcs() {
		locations.get(0).setNpc(new Torbjorn("Torbjörn", this.player));
		locations.get(3).setNpc(new Sec_guard("Guard", this.player));
		locations.get(4).setNpc(new Torbjornemail("Torbjörns email", this.player));
	}

	public void run() {
		String name;

		System.out.println("Welcome to the very exiting adventure of TDDD11!\nWhat is your name?");
		// name = keyboard.nextLine();
		name = "lul";
		this.player = new Player(name, locations.get(4));
		this.addItems();
		this.addNpcs();
		System.out.println("Hello " + name
				+ ", welcome to this magical course of wonder!\nYou can move around by typing north/south/west/east.\n"
				+ "You will have to learn more commands as you play the game! (Hint: there is a command \"help\").\n");
		this.player.getLocation().describeYourself();
		
		while (true) {
			String command;
			System.out.println("What do you want to do?");
			command = keyboard.nextLine();
			player.doCommand(command);
		}
	}
}