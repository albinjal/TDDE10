package animals;

public class Dog extends Animal {
	static String sound = "Vov!!!";
	static String type = "hund";
	
	public Dog(String n, int age) {
		super(n, age);
	}
	
	public void introduceYourself() {
		System.out.println(String.format("%s Jag är ett %s som heter %s.", sound, type, this.getName()));
		System.out.println(sound);
		System.out.println(String.format("Jag är %s år gammal.", this.getAge()));

	}
}
