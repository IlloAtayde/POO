package colections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.Animal;
import pojo.Cachorro;
import pojo.Gato;
import streams.Arquivos;


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
	
	public Animal PesquisarAnimal(String reg) throws Exception{
		Iterator<Animal> itAnimal = ColAnimal.iterator();
		while (itAnimal.hasNext()){
			Animal aniTemp = itAnimal.next();
			if (!(aniTemp.getRegistro().equals(reg))){
				continue;
			}
			return aniTemp;
		}
		throw new Exception("Registro NÃO encontrado!");
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
	
	public void ListarVaci_Cast_Verm(){
		Iterator<Animal> itAnimal = ColAnimal.iterator();
		while (itAnimal.hasNext()) {
			Animal aniTemp = itAnimal.next();
			if(aniTemp.getCondicoesGerais().isVacinado() && aniTemp.getCondicoesGerais().isCastrado() && aniTemp.getCondicoesGerais().isVermifugado()){
				System.out.println(aniTemp.toString());
			}
			
		}
	}
	
	public String GerarLogAnimais(){
		Iterator<Animal> itAnimal = ColAnimal.iterator();
		String logAnimais = "<p>";
		while (itAnimal.hasNext()){
			Animal aniTemp = itAnimal.next();
			logAnimais += aniTemp.getRegistro() + " " + aniTemp.getSexo() + " " + aniTemp.getRaca() + "</p><p>";
		}
		return logAnimais;
	}

	public void SalvarColAnimais(String nomeArq) throws IOException, FileNotFoundException{
		Arquivos.SalvarObjArquivo(ColAnimal, nomeArq);					
	}
	
	public void RecuperarColAnimais(String nomeArq) throws IOException, FileNotFoundException, ClassNotFoundException{
		ColAnimal = (List<Animal>) Arquivos.RecuperarObjArquivo(nomeArq);	
	}
}
