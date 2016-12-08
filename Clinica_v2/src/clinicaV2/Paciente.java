/**
 * 
 */
package clinicaV2;

import java.time.LocalDate;

/**
 * @author illoatayde
 *
 */
public class Paciente {

	/**
	 * @param args
	 */
	private String CPF;
	private Endereco end;
	private String nome;
	private String sexo;
	private LocalDate nascimento;
	
	
	public Paciente (String CPF, String nome, String sexo){
		this.CPF = CPF;
		this.nome = nome;
		this.sexo = sexo;
		this.end = new Endereco();
		this.nascimento = LocalDate.now();
	}
	public Paciente (){
		this.end = new Endereco();
		this.nascimento = LocalDate.now();
	}
	/**
	 * 
	 * @return nome paciente formatado em: Último nome e iniciais do restante
	 */
	public String FormatarNomePaciente(){
		String[] nomeTemp = this.getNome().split("\\s");
		String nomeFormatado = nomeTemp[nomeTemp.length - 1];
		for(int i = 0; i < nomeTemp.length - 1;i++){
			if(nomeTemp[i].length() <= 3){
				nomeFormatado += " " + nomeTemp[i] + " ";
				continue;
			}
			nomeFormatado += " " + nomeTemp[i].charAt(0) + ".";
		}
		if(this.getSexo().equals("f")){
			return "Sra. " + nomeFormatado;
		}
		return "Sr. " + nomeFormatado;
	}
	
	
	/**
	 * @return the CPF
	 */
	public String getCPF() {
		return CPF;
	}
	/**
	 * @param CPF the CPF to set
	 */
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	/**
	 * @return the end
	 */
	public Endereco getEnd() {
		return end;
	}
	/**
	 * @param end the end to set
	 */
	public void setEnd(Endereco end) {
		this.end = end;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	/**
	 * @return the nascimento
	 */
	public LocalDate getNascimento() {
		return nascimento;
	}
	/**
	 * @param nascimento the nascimento to set
	 */
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Paciente [CPF=" + CPF  + ", nome=" + nome + ", sexo=" + sexo
				+ ", nascimento=" + nascimento +  ", end=" + end.toString() + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Paciente)) {
			return false;
		}
		Paciente other = (Paciente) obj;
		if (CPF == null) {
			if (other.CPF != null) {
				return false;
			}
		} else if (!CPF.equals(other.CPF)) {
			return false;
		}
		if (end == null) {
			if (other.end != null) {
				return false;
			}
		} else if (!end.equals(other.end)) {
			return false;
		}
		if (nascimento == null) {
			if (other.nascimento != null) {
				return false;
			}
		} else if (!nascimento.equals(other.nascimento)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (sexo == null) {
			if (other.sexo != null) {
				return false;
			}
		} else if (!sexo.equals(other.sexo)) {
			return false;
		}
		return true;
	}
	

}
