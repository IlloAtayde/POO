/**
 * 
 */
package clinicaV2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author illoatayde
 *
 */
public class CollectionConsultas {

	private ArrayList<Consulta> ColConsultas;
	private Iterator<Consulta> itConsultas = ColConsultas.iterator();

	public CollectionConsultas() {
		// TODO Auto-generated constructor stub
		ColConsultas = new ArrayList<Consulta>();
	}
	public void AdicionarMedicos(Consulta consulta){
		ColConsultas.add(consulta);
	}
	public void RemoverMedicos(Consulta consulta){
		ColConsultas.remove(consulta);
	}
	public int QntConsultasData(LocalDate data){
		int qntConsultas = 0;
		while(itConsultas.hasNext()){
			if(itConsultas.next().getDataConsulta().equals(data)){
				qntConsultas++;
			}
		}
		return qntConsultas;
	}
	public void ListarConsultas(){
		while(itConsultas.hasNext()){
			System.out.println(itConsultas.next().toString());
		}
	}
	public int QntConsultasMedico(String nomeMedico){
		int qntConsultas = 0;
		String nomeTemp;
		while(itConsultas.hasNext()){
			nomeTemp = itConsultas.next().getMedico().getNome();
			if(nomeTemp.toLowerCase().contains(nomeMedico.toLowerCase())){
				qntConsultas++;
			}
		}
		return qntConsultas;
	}
	public void ListarConsultasPaciente(String nomePaciente){
		String nomeTemp;
		while(itConsultas.hasNext()){
			nomeTemp = itConsultas.next().getPaciente().getNome();
			if(nomeTemp.toLowerCase().contains(nomePaciente.toLowerCase())){
				System.out.println(itConsultas.next().toString());
			}
		}
	}
}
