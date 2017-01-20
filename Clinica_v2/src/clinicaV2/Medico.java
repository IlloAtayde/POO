package clinicaV2;


/**
 * @author illoatayde
 *
 */
public class Medico {

	/**
	 * @param args
	 */
	private String CRM;
	private String nome;
	private String especialidade;
	
	
	/**
	 * @param CRM
	 * @param nome
	 * @param especialidade
	 */
	public Medico(String CRM, String nome, String especialidade) {
		this.CRM = CRM;
		this.nome = nome;
		this.especialidade = especialidade;
	}
	/**
	 * @param CRM
	 * @param especialidade
	 */
	public Medico(){
		this.especialidade = "Clínico Geral";
	}
	/**
	 * @return the CRM
	 */
	public String getCRM() {
		return CRM;
	}
	/**
	 * @param CRM the CRM to set
	 */
	public void setCRM(String CRM) {
		this.CRM = CRM;
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
	 * @return the especialidade
	 */
	public String getEspecialidade() {
		return especialidade;
	}
	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nome + ", CRM: " + CRM +"\n" + especialidade ;
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
		if (!(obj instanceof Medico)) {
			return false;
		}
		Medico other = (Medico) obj;
		if (CRM == null) {
			if (other.CRM != null) {
				return false;
			}
		} else if (!CRM.equals(other.CRM)) {
			return false;
		}
		if (especialidade == null) {
			if (other.especialidade != null) {
				return false;
			}
		} else if (!especialidade.equals(other.especialidade)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		return true;
	}
}