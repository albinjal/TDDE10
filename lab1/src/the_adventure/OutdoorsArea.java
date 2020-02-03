package the_adventure;

public class OutdoorsArea extends Location {
	private boolean sunny = false;
	public OutdoorsArea(String name, String description) {
		super(name, description);
	}
	
	@Override
	protected void addCommands() {
		super.addCommands();
		this.addCommand("weather", () -> this.printWeather());
	}
	
	private void printWeather() {
		System.out.println("The weather is " + (sunny ? "sunny." : "rainy."));
	}
	
	@Override
	public void describeYourself() {
		super.describeYourself();
		this.sunny = !this.sunny;
		this.printWeather();
	}
	
	@Override
	protected String pathName() {
		return "road";
	}
}
