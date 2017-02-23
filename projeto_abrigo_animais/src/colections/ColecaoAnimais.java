package colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.Animal;
import pojo.Cachorro;
import pojo.Colaborador;
import pojo.Gato;
import pojo.ServicosGerais;
import pojo.Veterinario;
import pojo.Voluntario;

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
	
	public void ExibirAnimais(String idAnimal){
		Iterator<Animal> itAnimal = ColAnimal.iterator();
		while (itAnimal.hasNext()) {
			Animal aniTemp = itAnimal.next();
			//System.out.println(aniTemp.toString());
			if(!(idAnimal.equals("t"))){
				if ((aniTemp instanceof Cachorro) && (idAnimal.equals("c"))){
					Cachorro aniCach = (Cachorro) aniTemp;
					System.out.println(aniCach.toString());
					continue;
				}
				if ((aniTemp instanceof Gato) && (idAnimal.equals("g"))){
					Gato aniGato = (Gato) aniTemp;
					System.out.println(aniGato.toString());
					continue;
				}
			}
			else{
				System.out.println(aniTemp.toString());
			}
					
		}
		
	}
	
	public void QuantPorSexo(String idAnimal, String sexo){
		
	}
}
