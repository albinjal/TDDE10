package animals;
import java.util.ArrayList;

/**
 * @author albja295
 * 
 */

public class Animal {
	
	private String name;
	private int birthyear;
	private static int currentYear;
	private Animal friend;
	private ArrayList<Toy> Toys = new ArrayList<Toy>();
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
	
	public void setFriend(Animal animal) {
		this.friend = animal;		
	}
	
	public void addToy(Toy toy) {
		Toys.add(toy);
	}
	
	public void print() {
		
		this.introduceYourself();
		
		if (friend != null) {
		       System.out.println("Här är uppgifter om min kompis:");
		       friend.introduceYourself();
		    } else {
		        System.out.println("Jag har ingen kompis.");
		    }
		
		if (!Toys.isEmpty()) {
			System.out.print("Mina leksaker är");
			for (Toy toy : Toys) {
		        System.out.printf(" %s,",toy.getName());
		    }
		} else {
			System.out.print("Jag har inga leksaker.");
		}
		System.out.print("\n\n");
	}
}
