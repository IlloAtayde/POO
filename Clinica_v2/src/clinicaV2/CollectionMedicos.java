package clinicaV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * @author illoatayde
 *
 */
public class CollectionMedicos {
	
	private List<Medico> ColMedicos;
	//private Iterator<Medico> itMedicos = ColMedicos.iterator();

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
		Iterator<Medico> itMedicos = ColMedicos.iterator();
		while(itMedicos.hasNext()){
			Medico medTemp = itMedicos.next();
			if(medTemp.getCRM().equals(CRM)){
				return medTemp;
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
		Iterator<Medico> itMedicos = ColMedicos.iterator();
		while(itMedicos.hasNext()){
			Medico medTemp = itMedicos.next();
			nomeTemp = medTemp.getNome();
			if(nomeTemp.toLowerCase().contains(nomeMedico.toLowerCase())){
				System.out.printf("\t%s \tCRM:%s\n \t%s\n",medTemp.getNome(), medTemp.getCRM(), medTemp.getEspecialidade());
			}
		}
	}

}
