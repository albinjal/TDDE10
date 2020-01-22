package animals;

public class Dog extends Animal {
	static String sound = "Vov!!!";
	static String type = "hund";
	
	public Dog(String n) {
		super(n);
	}
	
	public void introduceYourself() {
		System.out.println(String.format("%s Jag är ett %s som heter %s.", sound, type, this.name));
		System.out.println(sound);
	}
}
