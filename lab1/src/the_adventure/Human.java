package the_adventure;

public abstract class Human extends Npc {

	public Human(String name, Player player) {
		super(name, player);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void addCommands() {
		this.addCommand("Talk to " + this.getName(), () -> this.interactWith(this.getPlayer()));
	}
	
	protected void interactWith(Player player) {
		if (!this.getTalkState()) {
			this.setTalkState(true);
			System.out.printf("%s: Hello %s!\n My name is %s.\n",this.getName(), player.getName(), this.getName());
		}
		else {
			System.out.printf("%s: Hi there!\n", this.getName());
		}
		
	}


}
