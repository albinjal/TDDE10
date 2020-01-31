package the_adventure;

public class LiuCard extends Item {

	public LiuCard(String name) {
		super(name);
		System.out.println(this.getName());
		// TODO Auto-generated constructor stub
	}



	@Override
	protected void addCommands() {
		System.out.println(this.getName());
		this.addCommand("hello " + this.getName(), ()-> System.out.println("Sup Bro"));
	}
	

}
