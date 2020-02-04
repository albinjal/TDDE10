package location;

import java.util.ArrayList;

import items.Item;
import npc.Npc;
import the_adventure.Commandable;
import the_adventure.Player;

public class Location extends Commandable {
	private String description;
	private Location north;
	private Location west;
	private Location south;
	private Location east;
	public static Character[] paths = {'n', 'e', 's', 'w'};
	// Detta blev live fult men de passade olika bra i olika kontexter, paths används internt och lPaths externt (för utskrifter)
	public static String[] lPaths = {"north", "east", "south", "west"};
	private boolean visited = false;
	private ArrayList<Item> items = new ArrayList<Item>();
	private Npc npc;
	
	public Location(String name, String description) {
		super(name);
		setDesc(description);
	}
	
	private void setDesc(String desc) {
		this.description = desc;
	}
	
	public void describeYourself() {
		if (!this.visited) {
		// Denna kod körs första gången platsen besöks
		System.out.println(this.description + "\n");
		this.visit();
		} else {
			System.out.println(String.format("You are back at %s again.", this.getName()));
		}
		this.look();
	}
	
	private void describeItems() {
		if (this.items.isEmpty()) {
			return;
		}
		System.out.print("There is a ");
		for(int i = 0; i < this.items.size(); i++) {
			System.out.printf("%s %s", items.get(i).getName(), i != this.items.size() - 1 ? "and a " : "");
		}
		System.out.println("laying on the ground.");
	}
	
	public void look() {
		this.describePaths();
		this.describeItems();
		this.describeNpc();
	}
	
	
	public void setPath( int path, Location loc) {
		switch(path) {
		case 0: this.north = loc; break;
		case 1: this.east = loc; break;
		case 2: this.south = loc; break;
		case 3: this.west = loc; break;
		}
	}
	
	public Location getPath(Character dir) {
		switch (dir) {
		case 'n': return this.north;
		case 'e': return this.east;
		case 's': return this.south;
		case 'w': return this.west;
		default: return null;
		}
	}

	@Override
	public String toString() {
		return this.getName();
	}

	
	@Override
	public void addCommands() {
		this.addCommand("look", () -> this.look()) ;
	}
	
	public void addItem(Item item, Player player) {
		this.items.add(item);
		this.addCommand("take " + item.getName(), () -> this.giveItem(item, player));
	}
	
	public void giveItem(Item item, Player player) {
		System.out.printf("%s added to your inventory.\n", item.getName());
		player.addItem(item);
		this.removeItem(item);
	}
		
	private void removeItem(Item item) {
		this.items.remove(item);
		this.deleteCommand("take " + item.getName());
	}
	
	public void visit() {
		this.visited = true;
	}
	
	private void describePaths() {
		int i = 0;
		for (Character c : paths) {
			Location path = this.getPath(c);
			if (path != null) {
				System.out.println(String.format("There is a %s leading %s." , pathName(), lPaths[i]));
			}
			i++;
		}
	}
	
	public String pathName() {
		return "path";
	}
	public void setNpc(Npc npc) {
		this.npc = npc;
	}
	
	public Npc getNpc() {
		return this.npc;
	}
	
	private void describeNpc() {
		if (this.getNpc() != null) {
			this.getNpc().observe();
		}
	}
	
	@Override
	public void help() {
		super.help();
		if (this.getNpc() != null) {
			this.getNpc().help();
		}
	}
	
	public void insertLiuCard(Player player) {
		System.out.print("The Liu card cant unlock anything at this location.");
	}
	
	public void useFlashLight() {
		System.out.println("Why are you trying to use a flashlight when its alreay light, you are just wasting energy. #Greta");
	}

}
