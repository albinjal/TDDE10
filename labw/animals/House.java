package animals;
import java.util.ArrayList; 

public class House {
	
	private ArrayList<Animal> animalList = new ArrayList<Animal>();

	public House() {
		// TODO Auto-generated constructor stub
	}
	
	
	// skriver ut information om alla djur, deras vänner och leksaker.
	public void print() {
	    System.out.println("Följande djur finns i huset:\n");
	    
	    for (Animal animal : animalList) {
	        animal.print();
	    }
	}
	
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}

}
