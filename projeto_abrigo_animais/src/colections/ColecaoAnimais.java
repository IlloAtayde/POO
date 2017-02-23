package colections;

import java.util.ArrayList;
import java.util.List;

import pojo.Animal;

public class ColecaoAnimais {
	
	private List<Animal> ColAnimal;

	public ColecaoAnimais() {
		
		ColAnimal = new ArrayList<Animal>();
	}
	public void AdicionarAnimal(Animal animal){
		ColAnimal.add(animal);
	}
	public void RemoverAnimal(Animal animal){
		ColAnimal.remove(animal);
	}
}
