package the_adventure;

public abstract class Tool extends Item {

	public Tool(String name, double weight, int price) {
		super(name, weight, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void addCommands() {
		this.addCommand("use " + this.getName(), () -> this.use());
	}
	
	protected abstract void use();

}
