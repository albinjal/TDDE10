package animals;

public class Animal {

	private String name;
	private int birthyear;
	private static int currentYear;
	String sound = "Morr.";
	String animal = "ett djur";
	
	public Animal(String name, int age) {
		this.name = name;
		this.birthyear = Animal.currentYear - age;
	}
	
	public void introduceYourself() {
		System.out.printf("%s Jag är %s som heter %s.\n", sound, animal, name);
		System.out.printf("Jag är %s år gammal.\n", getAge());

	}
	
	public static void setYear(int year) {
		 Animal.currentYear = year;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return Animal.currentYear - this.birthyear;
	}
	
}
