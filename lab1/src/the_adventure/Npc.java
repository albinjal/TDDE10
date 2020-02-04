package the_adventure;

import java.util.ArrayList;

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
	
	protected void introduceYourself() {
		
	}
	
	protected Player getPlayer() {
		return player;
	}
	
	protected void setPlayer(Player player) {
		this.player = player;
	}
	
	protected Boolean getTalkState() {
		return talkState;
	}
	
	protected void setTalkState(Boolean value) {
		this.talkState = value;
	}
	
	protected abstract void observe();

}
