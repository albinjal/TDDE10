package items;

public abstract class Tool extends Item {

	public Tool(String name, double weight, int price) {
		super(name, weight, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addCommands() {
		this.addCommand("use " + this.getName(), () -> this.use());
	}
	
	public abstract void use();

}
