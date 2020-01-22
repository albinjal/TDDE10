package animals;

public class Animal {

	public String name;
	public int age;
	String sound = "Morr.";
	String animal = "ett djur";
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void introduceYourself() {
		System.out.printf("%s Jag är %s som heter %s.\n", sound, animal, name);
		System.out.printf("Jag är %s år gammal.\n", age);

	}
	
}
