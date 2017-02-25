package colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.Colaborador;
import pojo.ServicosGerais;
import pojo.Veterinario;

public class ColecaoColaboradores {
	
	private List<Colaborador> ColColaborador;

	public ColecaoColaboradores() {
		
		ColColaborador = new ArrayList<Colaborador>();
	}
	public void AdicionarColaborador(Colaborador colaborador){
		ColColaborador.add(colaborador);
	}
	public void RemoverColaborador(Colaborador colaborador){
		ColColaborador.remove(colaborador);
	}
	/**
	 * Imprime relação dos colaboradores voluntários
	 *
	 */
	public void ExibirColVoluntarios(){
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while(itColab.hasNext()){
			Colaborador colabTemp = itColab.next();
			if(colabTemp.isVoluntario()){
				System.out.println(colabTemp.toString());
			}
		}
	}
	/**
	 * 
	 * @param idColab Lista colaboradores usando como referência o caracter passado por idColab
	 * v - para Veterinario
	 * s - para Serviços gerais
	 * t - para Todos
	 */
	public void ExibirColaboradores(String idColab){
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while (itColab.hasNext()) {
			Colaborador colabTemp = itColab.next();
			if(!(idColab.equals("t"))){
				if ((colabTemp instanceof Veterinario) && (idColab.equals("v"))){
					Veterinario colabVet = (Veterinario) colabTemp;
					System.out.println(colabVet.toString());
				}
				if ((colabTemp instanceof ServicosGerais) && (idColab.equals("s"))){
					ServicosGerais colabServGer = (ServicosGerais) colabTemp;
					System.out.println(colabServGer.toString());
				}
			}else{
				System.out.println(colabTemp.toString());
			}
					
		}		
		
	}
	/**
	 * 
	 * @param doc
	 * @return Objeto Colaborador com documento doc coincidente
	 */
	public Colaborador PesquisarColab(String doc){
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while (itColab.hasNext()){
			Colaborador colabTemp = itColab.next();
			if (!(colabTemp.getDocumento().equals(doc))){
				continue;
			}
			return colabTemp;
		}
		return null;
	}
	
	public void PesquisarNome(String nomeColab){
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while (itColab.hasNext()) {
			Colaborador colab = itColab.next();
			String nomeTemp = colab.getNome();
			if(nomeTemp.toLowerCase().contains(nomeColab.toLowerCase())){
				System.out.println(colab.toString());
			}
		}
	}
}
