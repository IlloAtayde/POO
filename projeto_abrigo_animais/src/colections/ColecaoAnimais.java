package colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.Animal;
import pojo.Cachorro;
import pojo.Gato;


public class ColecaoAnimais {
	
	private List<Animal> ColAnimal;

	public ColecaoAnimais(){
		
		ColAnimal = new ArrayList<Animal>();
	}
	public void AdicionarAnimal(Animal animal){
		ColAnimal.add(animal);
	}
	public void RemoverAnimal(Animal animal){
		ColAnimal.remove(animal);
	}	
	
	public Animal PesquisarAnimal(String reg){
		Iterator<Animal> itAnimal = ColAnimal.iterator();
		while (itAnimal.hasNext()){
			Animal aniTemp = itAnimal.next();
			if (!(aniTemp.getRegistro().equals(reg))){
				continue;
			}
			return aniTemp;
		}
		return null;
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
	
	public void Quantitativo(){
		int caoTotal,caoFemea,caoMacho,gatoTotal,gatoFemea,gatoMacho;
		caoTotal=caoFemea=caoMacho=gatoTotal=gatoFemea=gatoMacho=0;
		Iterator<Animal> itAnimal = ColAnimal.iterator();
		while (itAnimal.hasNext()) {
			Animal aniTemp = itAnimal.next();
			if(aniTemp instanceof Cachorro){
				if(aniTemp.getSexo().equals("f")){
					caoFemea++;
				}else{
					caoMacho++;
				}
			}
			if(aniTemp instanceof Gato){
				if(aniTemp.getSexo().equals("f")){
					gatoFemea++;
				}else{
					gatoMacho++;
				}
			}
		}
		caoTotal = caoMacho + caoFemea;
		gatoTotal = gatoFemea + gatoMacho;
		System.out.printf("%d Gato(s): %d macho(s) e %d fêmea(s)\n",gatoTotal,gatoMacho,gatoFemea);
		System.out.printf("%d Cão(es): %d macho(s) e %d fêmea(s)\n",caoTotal,caoMacho,caoFemea);
		System.out.printf("Total de animal(is) no abrigo: %d\n",(caoTotal+gatoTotal));
	}
	
	public void QuantPorSexo(String sexo){
		int total = 0;
		Iterator<Animal> itAnimal = ColAnimal.iterator();
		while (itAnimal.hasNext()) {
			Animal aniTemp = itAnimal.next();
			if(aniTemp.getSexo().equals(sexo)){
				total++;
				System.out.println(aniTemp.toString());
				continue;
			}
		}
		if(sexo.equals("f")){
			sexo = "fêmea(s)";
		}else{
			sexo = "macho(s)";
		}
		System.out.println("Total de " + total + " " + sexo);
	}
}
