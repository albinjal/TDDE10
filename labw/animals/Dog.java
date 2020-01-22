package animals;

public class Dog extends Animal{
	

	public Dog(String name, int age) {
		super(name, age);
		sound = "Vov!!!";
		animal = "en hund";
	}
	
	public void introduceYourself() {
		System.out.printf("%s Jag är %s som heter %s.\n", sound, animal, getName());
		System.out.printf("Jag är %s år gammal. \n", getAge());
		System.out.println(sound);

	}
	
}
