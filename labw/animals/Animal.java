package animals;
import java.util.ArrayList;

public class Animal {
	private String _name;
	private int _birthYear;
	private ArrayList<Toy> _toys = new ArrayList<Toy>();
	private Animal _friend;
	private static int _year;
	static String sound = "Morr.";
	static String type = "djur";
	
	public Animal(String name, int age) {
		this._name = name;
		this.setBirthYearFromAge(age);
	}
	
	public static void setYear(int year) {
		_year = year;
	}
	public static int getYear() {
		return _year;
	}
	
	public void setBirthYear(int birthYear) {
		this._birthYear = birthYear;
	}
	public int getBirthYear() {
		return this._birthYear;
	}
	
	public void setName(String name) {
		this._name = name;
	}
	public String getName() {
		return this._name;
	}
	
	public int getAge() {
		return _year - this._birthYear;
	}
	
	private void setBirthYearFromAge(int age) {
		setBirthYear(_year - age);
	}
	
	public void setFriend(Animal friend) {
		this._friend = friend;
	}
	
	public Animal getFriend() {
		return this._friend;
	}
	
	private boolean hasFriend() {
		return this._friend != null;
	}
	
	public void addToy(Toy toy) {
		this._toys.add(toy);
	}
	
	
	public void introduceYourself() {
		System.out.println(String.format("%s Jag är en %s som heter %s.", sound, type, this.getName()));
		System.out.println(String.format("Jag är %s år gammal.", this.getAge()));
	}
	
	public void print() {
		this.introduceYourself();
		if (this.hasFriend()) {
			System.out.println("Låt min vän introducera sig själv:");
			this.getFriend().introduceYourself();
		} else {
			System.out.println("Jag har inga vänner...");
		}
		if (this._toys.isEmpty()) {
			System.out.println("Jag har inga leksaker :(");
		} else {
			System.out.println("Mina leksaker är:");
			for (Toy toy : this._toys) {
				System.out.print(toy.getName() + ", ");
			}
		}

	}

}
