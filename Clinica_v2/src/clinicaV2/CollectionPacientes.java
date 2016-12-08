/**
 * 
 */
package clinicaV2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * @author illoatayde
 *
 */
public class CollectionPacientes {
	
	private List<Paciente> ColPacientes;
	//private ListIterator<Paciente> itPaciente = ColPacientes.listIterator();

	public CollectionPacientes() {
		// TODO Auto-generated constructor stub
		ColPacientes = new ArrayList<Paciente>();
	}
	public boolean ColVazia(){
		if(ColPacientes.size() == 0){
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @param paciente
	 * Adiciona um paciente
	 */
	public void AdicionarPaciente(Paciente paciente){
		ColPacientes.add(paciente);
	}
	/**
	 * 
	 * @param paciente
	 * Remove um paciente
	 */
	public void RemoverPaciente(Paciente paciente){
		ColPacientes.remove(paciente);
	}
	/**
	 * 
	 * @param CPF
	 * busca e imprime o paciente com CPF coincidente
	 */
	public void BuscarPacienteCPF(String CPF){
		Iterator<Paciente> itPaciente = ColPacientes.iterator();
		while(itPaciente.hasNext()){
			Paciente paciTemp = itPaciente.next();
			if(paciTemp.getCPF().equals(CPF)){
				System.out.println(paciTemp.toString());
				return;
			}
		}
		System.err.println("Paciente não cadastrado!");
	}
	/**
	 * 
	 * @param CPF
	 * Remove paciente com CPF coincidente
	 */
	public void RemoverPacienteCPF(String CPF){
		Iterator<Paciente> itPaciente = ColPacientes.iterator();
		while(itPaciente.hasNext()){
			Paciente paciTemp = itPaciente.next();
			if(paciTemp.getCPF().equals(CPF)){
				itPaciente.remove();
			}
		}
		System.err.println("Paciente não cadastrado!");
	}
	/**
	 * 
	 * @param sexo
	 * Busca a quantidade de pacientes com sexo coincidentes
	 * @return total do sexo em questão
	 */
	public int QuantidadePorSexo(String sexo){
		Iterator<Paciente> itPaciente = ColPacientes.iterator();
		int qntSexo = 0;
		while(itPaciente.hasNext()){
			Paciente paciTemp = itPaciente.next();
			if(paciTemp.getSexo().equals(sexo)){
				qntSexo++;
			}
		}
		return qntSexo;
	}
	/**
	 * Lista de forma completa todos os pacientes contidos na coleção
	 */
	public void ListarPacientesCompleto(){
		Iterator<Paciente> itPaciente = ColPacientes.iterator();
		while(itPaciente.hasNext()){
			Paciente paciTemp = itPaciente.next();
			System.out.println(paciTemp.toString());
		}
	}
	public void ListarPacientesMaioresdeSessenta(){
		LocalDate hoje = LocalDate.now();
		LocalDate idadeTemp;
		Period periodo;
		Iterator<Paciente> itPaciente = ColPacientes.iterator();
		while(itPaciente.hasNext()){
			Paciente paciTemp = itPaciente.next();
			idadeTemp = paciTemp.getNascimento();
			periodo = Period.between(idadeTemp, hoje);
			if(periodo.getYears() > 60){
				System.out.printf("\t%s \t%d Anos.\n",paciTemp.FormatarNomePaciente(), periodo.getYears());
			}
		}
	}
}
