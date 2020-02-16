package location;

public abstract class DarkLocation extends Location {
	private boolean light = false;
	public DarkLocation(String name, String description) {
		super(name, description);
	}
	
	public void lightUp() {
		this.light = true;
		System.out.println("The location is now lit up, hurray.");
		this.look();
	}
	
	@Override
	public void look() {
		if (!this.light) {
			System.out.print("The location is dark and you cant see a thing. I wish we had som light...");
		} else {
		super.look();
		}
	}
	
	public boolean getLit() {
		// Dunder metod ^^
		return this.light;
	}
	
	@Override
	public void useFlashLight() {
		if (this.getLit()) {
			super.useFlashLight();
		} else {
			this.lightUp();
		}
	}
	
}
