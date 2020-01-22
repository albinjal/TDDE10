package animals;

public class Animal {
	private String _name;
	private int _birthYear;
	private static int _year;
	static String sound = "Morr.";
	static String type = "djur";
	
	// Constructor
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
	
	public void introduceYourself() {
		System.out.println(String.format("%s Jag är ett %s som heter %s.", sound, type, this.getName()));
		System.out.println(String.format("Jag är %s år gammal.", this.getAge()));
	}
}
