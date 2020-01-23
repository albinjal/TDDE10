package animals;
import java.util.ArrayList;
/**
 * Represents a house which can contain {@link Animal}
 * @author albja664
 * @version 1.0
 * @since 1.0
 */
public class House {
	private ArrayList<Animal> _animals = new ArrayList<Animal>();
	
	public House() {
		// TODO Auto-generated constructor stub
	}
	
	public void addAnimal(Animal animal) {
		this._animals.add(animal);
	}
	
	public void print() {
		System.out.println("Följande djur finns i huset:");
		
		for (Animal animal : _animals) {
			animal.print();
			System.out.println("\n");
		}
		
	}
	

}
