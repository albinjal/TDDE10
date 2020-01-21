package animals;

public class Animal {
	String name;
	
	public void Animal(String name) {
		this.name = name;
	}
	
	public void introduceYourself() {
		System.out.print(this.name);
	}
}
