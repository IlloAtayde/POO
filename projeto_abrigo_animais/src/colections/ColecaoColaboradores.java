package colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.Colaborador;
import pojo.ServicosGerais;
import pojo.Veterinario;
import pojo.Voluntario;

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
	
	public void ExibirColVoluntarios(){
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while(itColab.hasNext()){
			Colaborador colabTemp = itColab.next();
			if(colabTemp.isVoluntario()){
				System.out.println(colabTemp.toString());
			}
		}
	} */
	/**
	 * 
	 * @param colabTipo Lista colaboradores usando como referência o inteiro passado por colabTipo
	 * 0 - para Veterinario
	 * 1 - para Voluntario
	 * 2 - para Serviços gerais
	 * 3 - para Todos
	 */
	public void ExibirColaboradores(int colabTipo){
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while (itColab.hasNext()) {
			Colaborador colabTemp = itColab.next();
			if ((colabTemp instanceof Veterinario) && (colabTipo == 0)){
				Veterinario colabVet = (Veterinario) colabTemp;
				System.out.println(colabVet.toString());
			}
			if ((colabTemp instanceof Voluntario) && (colabTipo == 1)){
				Voluntario colabVol = (Voluntario) colabTemp;
				System.out.println(colabVol.toString());
			}
			if ((colabTemp instanceof ServicosGerais) && (colabTipo == 2)){
				ServicosGerais colabServGer = (ServicosGerais) colabTemp;
				System.out.println(colabServGer.toString());
			}
			else{
				System.out.println(colabTemp.toString());
			}
					
		}		
		
	}
}
