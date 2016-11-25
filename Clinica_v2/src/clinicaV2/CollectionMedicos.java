package clinicaV2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author illoatayde
 *
 */
public class CollectionMedicos {
	
	private ArrayList<Medico> ColMedicos;
	private Iterator<Medico> itMedicos = ColMedicos.iterator();

	public CollectionMedicos() {
		// TODO Auto-generated constructor stub
		ColMedicos = new ArrayList<Medico>();
	}
	/**
	 * 
	 * @param medico
	 * Adiciona objeto médico passado como parâmetro ao ArrayList
	 */
	public void AdicionarMedicos(Medico medico){
		ColMedicos.add(medico);
	}
	/**
	 * 
	 * @param medico
	 * Remove objeto passado como parâmetro do ArrayList
	 */
	public void RemoverMedicos(Medico medico){
		ColMedicos.remove(medico);
	}
	/**
	 * 
	 * @param CRM
	 * @return Objeto Medico
	 */
	public Medico BuscarMedicoCRM(String CRM){
		while(itMedicos.hasNext()){
			if(itMedicos.next().getCRM().equals(CRM)){
				return itMedicos.next();
			}
		}
		return null;
	}
	/**
	 * 
	 * @param nomeMedico
	 * Imprime nome, CRM e especialidade dos médicos, cujo nome contenha o parâmetro passado
	 */
	public void BuscarMedicoNome(String nomeMedico){
		String nomeTemp;
		while(itMedicos.hasNext()){
			nomeTemp = itMedicos.next().getNome();
			if(nomeTemp.toLowerCase().contains(nomeMedico.toLowerCase())){
				System.out.println(itMedicos.next().getNome() + itMedicos.next().getCRM() + itMedicos.next().getEspecialidade());
			}
		}
	}

}
