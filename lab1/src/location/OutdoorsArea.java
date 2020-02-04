package location;

public class OutdoorsArea extends Location {
	private boolean sunny = false;
	public OutdoorsArea(String name, String description) {
		super(name, description);
	}
	
	@Override
	public void addCommands() {
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
	public String pathName() {
		return "road";
	}
}
