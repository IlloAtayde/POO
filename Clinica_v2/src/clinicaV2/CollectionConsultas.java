/**
 * 
 */
package clinicaV2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * @author illoatayde
 *
 */
public class CollectionConsultas {

	private List<Consulta> ColConsultas;
	//private Iterator<Consulta> itConsultas = ColConsultas.iterator();

	public CollectionConsultas() {
		// TODO Auto-generated constructor stub
		ColConsultas = new ArrayList<Consulta>();
	}
	/**
	 * 
	 * @param consulta
	 * Adiciona uma consulta à coleção
	 */
	public void AdicionarConsulta(Consulta consulta){
		ColConsultas.add(consulta);
	}
	/**
	 * 
	 * @param consulta
	 * Remove a referida consulta da coleção
	 */
	public void RemoverConsulta(Consulta consulta){
		ColConsultas.remove(consulta);
	}
	/**
	 * 
	 * @param data
	 * @return Número de consultas para referida data
	 */
	public int QntConsultasData(LocalDate data){
		int qntConsultas = 0;
		Iterator<Consulta> itConsultas = ColConsultas.iterator();
		while(itConsultas.hasNext()){
			Consulta consTemp = itConsultas.next();
			if(consTemp.getDataConsulta().equals(data)){
				qntConsultas++;
			}
		}
		return qntConsultas;
	}
	/**
	 * Lista todas as consultas da coleção
	 */
	public void ListarConsultas(){
		Iterator<Consulta> itConsultas = ColConsultas.iterator();
		while(itConsultas.hasNext()){
			Consulta consTemp = itConsultas.next();
			System.out.println(consTemp.toString());
		}
	}
	/**
	 * 
	 * @param nomeMedico
	 * @return quantidade de consultas cadastradas para o referido médico
	 */
	public int QntConsultasMedico(String nomeMedico){
		int qntConsultas = 0;
		String nomeTemp;
		Iterator<Consulta> itConsultas = ColConsultas.iterator();
		while(itConsultas.hasNext()){
			Consulta consTemp = itConsultas.next();
			nomeTemp = consTemp.getMedico().getNome();
			if(nomeTemp.toLowerCase().contains(nomeMedico.toLowerCase())){
				qntConsultas++;
			}
		}
		return qntConsultas;
	}
	/**
	 * 
	 * @param nomePaciente
	 * Lista os dados da consulta para o referido paciente
	 */
	public void ListarConsultasPaciente(String nomePaciente){
		String nomeTemp;
		Iterator<Consulta> itConsultas = ColConsultas.iterator();
		while(itConsultas.hasNext()){
			Consulta consTemp = itConsultas.next();
			nomeTemp = consTemp.getPaciente().getNome();
			if(nomeTemp.toLowerCase().contains(nomePaciente.toLowerCase())){
				System.out.println(consTemp.toString());
			}
		}
	}
}
