package animals;

public class Cat extends Animal {


	public Cat(String name, int age) {
		super(name, age);
		sound = "Mjau.";
		animal = "en katt";
		
	}
	
	public void introduceYourself() {
		System.out.printf("%s Jag är %s som heter %s.\n", sound, animal, getName());
		System.out.printf("Jag är %s år gammal. \n", getAge());

	}
}
