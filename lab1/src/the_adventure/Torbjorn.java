package the_adventure;

public class Torbjorn extends Human {
	
	
	public Torbjorn(String name, Player player) {
		super(name, player);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void interactWith(Player player) {
		System.out.printf("I am you course admin...\n");

	}
	
	@Override
	protected void observe() {
		System.out.printf("%s is standing, lurking in the shadows...\n", this.getName());
	}
	
	

}
