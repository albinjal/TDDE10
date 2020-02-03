package the_adventure;

import java.util.ArrayList;

public abstract class Npc extends Commandable {

	private int stamina;
	private ArrayList<Item> items = new ArrayList<Item>();
		
	public Npc(String name) {
		super(name);
		setStamina(100);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void commandNotFound(String cmd) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void addCommands() {
		// TODO Auto-generated method stub

	}
	
	protected int getStamina() {
		return stamina;
	}
	
	protected void setStamina(int stam) {
		this.stamina = stam; 
	}
	
	protected void addItem(Item item) {
		items.add(item);
	}
	
	protected void deleteItem(Item item) {
		this.items.remove(item);
	}

}
