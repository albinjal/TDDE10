package the_adventure;

public class OutdoorsArea extends Location {
	private String weather = "sol";
	public OutdoorsArea(String name, String description) {
		super(name, description);
	}
	
	@Override
	protected void addCommands() {
		super.addCommands();
		this.addCommand("weather", () -> this.printWeather());
	}
	
	private void printWeather() {
		System.out.print("Vädret är " + this.weather);
	}
}
