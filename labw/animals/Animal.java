package animals;

public class Animal {
	public String name;
	protected String sound = "Morr";
	protected String type = "djur";
	
	// Constructor
	public Animal(String name) {
		this.name = name;
	}
	
	public void introduceYourself() {
		System.out.println(String.format("%s. Jag är ett %s som heter %s.", sound, type, this.name));
	}
}
