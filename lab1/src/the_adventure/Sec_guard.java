package the_adventure;

public class Sec_guard extends Human {

	public Sec_guard(String name, Player player) {
		super(name, player);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void interactWith(Player player) {
		System.out.printf("I am THE campus security...\n");

	}
	
	@Override
	protected void observe() {
		System.out.printf("There is a %s is searching for something on a desk.\n", this.getName());

	}

}
