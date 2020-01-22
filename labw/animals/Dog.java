package animals;

public class Dog extends Animal{
	

	public Dog(String name) {
		super(name);
		sound = "Vov!!!";
		animal = "en hund";
	}
	
	public void introduceYourself() {
		System.out.printf("%s Jag är %s som heter %s.\n", sound, animal, name);
		System.out.println(sound);
	}
	
}
