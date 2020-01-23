package the_adventure;
import java.util.*;

public class Game {
    private Scanner keyboard; 
    private ArrayList<Location> locations;
    private Player player;
    
    public Game() {
	    keyboard = new Scanner(System.in);
	    locations = new ArrayList<Location>();
	    locations.add(new OutdoorsArea("Blå Havet", "Du står på Blå havet men foodtrucksen syns inte till"));
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