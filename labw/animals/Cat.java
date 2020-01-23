package animals;

public class Cat extends Animal {
	static String sound = "Mjau.";
	static String type = "katt";
	
	public Cat(String n, int age) {
		super(n, age);
	}
	public void introduceYourself() {
		System.out.println(String.format("%s Jag är ett %s som heter %s.", sound, type, this.getName()));
		System.out.println(String.format("Jag är %s år gammal.", this.getAge()));

	}
}
