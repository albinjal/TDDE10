package the_adventure;

public class Torbjornemail extends Npc {

	private static int damage = 40;
	private Boolean redemail = false;
	
	public Torbjornemail(String name, Player player) {
		super(name, player);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void addCommands() {
		this.addCommand("Read " + this.getName(), () -> this.attack(this.getPlayer(), damage));
	}
	
	@Override
	protected void observe() {
		if (!redemail) {
			System.out.print("You have a email on your phone.\n");
		}
	}
	
	protected void attack(Player player, int amount) {
		player.subtractStamina(amount);
		System.out.printf("%s: Welcome to the course! \n ....\n", this.getName());
		redemail = true;
		
		
	}
	


}
