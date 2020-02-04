package npc;

import java.util.ArrayList;

import items.Item;
import the_adventure.Commandable;
import the_adventure.Player;

public abstract class Npc extends Commandable {

	private int stamina;
	private ArrayList<Item> items = new ArrayList<Item>();
	private Player player;
	private Boolean talkState = false;
		
	public Npc(String name, Player player) {
		super(name);
		setStamina(100);
		this.player = player;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCommands() {
		// TODO Auto-generated method stub

	}
	
	public int getStamina() {
		return stamina;
	}
	
	public void setStamina(int stam) {
		this.stamina = stam; 
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void deleteItem(Item item) {
		this.items.remove(item);
	}
	
	public void introduceYourself() {
		
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Boolean getTalkState() {
		return talkState;
	}
	
	public void setTalkState(Boolean value) {
		this.talkState = value;
	}
	
	public abstract void observe();

}
