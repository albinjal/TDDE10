package the_adventure;

public abstract class Item extends Commandable {
	public Item(String name) {
		super(name);
	}
	
	@Override
	protected void commandNotFound(String cmd) {
		// TODO Auto-generated method stub
		
	}

	

}
