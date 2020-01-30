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
	    locations.add(new Location("SU", "Du står på Blå havet men foodtrucksen syns inte till"));
	    locations.add(new RoomWithHidden("G-LAN", "Du står på Blå havet men foodtrucksen syns inte till"));
	    locations.add(new Location("Baljan", "Du står på Blå havet men foodtrucksen syns inte till"));
	    locations.add(new Location("C1", "Du står på Blå havet men foodtrucksen syns inte till"));
	    locations.add(new OutdoorsArea("Blå Havet", "Du står på Blå havet men foodtrucksen syns inte till"));
	    createPaths();
    }
    
    private void createPaths() {
    	int i = 0;
    	int[][] pathMap = {
    			{-1, -1, 1, -1},
    			{0, -1, 2, 4},
    			{1, -1, -1, 3},
    			{4, 2, -1, -1},
    			{-1, 1, 3, -1},
    	};
    	for (int[] paths: pathMap) {
    		Location loc = this.locations.get(i);
    		int p = 0;
    		for (int path: paths) {
    			loc.setPath(p, path == -1 ? null : this.locations.get(path));
    			p++;
    		}
    		i++;
    	}

    }

    public void run() {
	String name;
	    
        System.out.println("Welcome to the adventure game!\nWhat is your name?");
	name = keyboard.nextLine();
	player = new Player(name, locations.get(0));
	System.out.println("Hello " + name + ", welcome to this magical world of wonder! You can move around by typing north/south/west/east. You will have to learn more commands as you play the game! (Hint: there is a command \"help\").");
	
	while (true) {
            String command;
	    
	    player.getLocation().describeYourself();
	    System.out.println("What do you want to do?");
	    command = keyboard.nextLine();
	    player.doCommand(command);
	}	    
    }
}