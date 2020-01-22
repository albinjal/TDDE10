package animals;

public class Cat extends Animal {


	public Cat(String name) {
		super(name);
		sound = "Mjau.";
		animal = "en katt";
		
	}
	
	public void introduceYourself() {
		System.out.printf("%s Jag är %s som heter %s.\n", sound, animal, name);
	}
}
