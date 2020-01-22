package animals;

public class Cat extends Animal {
	static String sound = "Mjau.";
	static String type = "katt";
	
	public Cat(String n) {
		super(n);
	}
	public void introduceYourself() {
		System.out.println(String.format("%s Jag är ett %s som heter %s.", sound, type, this.name));
	}
}
