/**
 * 
 */
package pojo;

import java.time.LocalDate;

/**
 * @author illoatayde
 *
 */
public class Gato extends Animal {

	/**
	 * @param registro
	 * @param nome
	 * @param sexo
	 * @param raca
	 * @param comportamento
	 * @param dataChegada
	 * @param dataNascimento
	 * @param condicoesGerais
	 */
	private boolean vomitaBoladePelos;
	public Gato(String registro, String nome, String sexo, String raca, String comportamento, boolean vomitaBoladePelos, String dataChegStr, String dataNascStr, ProntuarioMedico condicoesGerais) {
		super(registro, nome, sexo, raca, comportamento, dataChegStr, dataNascStr,	condicoesGerais);
		this.vomitaBoladePelos = vomitaBoladePelos;
	}
	public Gato(){
		
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getRegistro()
	 */
	@Override
	public String getRegistro() {
		// TODO Auto-generated method stub
		return super.getRegistro();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setRegistro(java.lang.String)
	 */
	@Override
	public void setRegistro(String registro) {
		// TODO Auto-generated method stub
		super.setRegistro(registro);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getNome()
	 */
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getRaca()
	 */
	@Override
	public String getRaca() {
		// TODO Auto-generated method stub
		return super.getRaca();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setRaca(java.lang.String)
	 */
	@Override
	public void setRaca(String raca) {
		// TODO Auto-generated method stub
		super.setRaca(raca);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getComportamento()
	 */
	@Override
	public String getComportamento() {
		// TODO Auto-generated method stub
		return super.getComportamento();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setComportamento(java.lang.String)
	 */
	@Override
	public void setComportamento(String comportamento) {
		// TODO Auto-generated method stub
		super.setComportamento(comportamento);
	}

	/**
	 * @return the vomitaBoladePelos
	 */
	public boolean isVomitaBoladePelos() {
		return vomitaBoladePelos;
	}

	/**
	 * @param vomitaBoladePelos the vomitaBoladePelos to set
	 */
	public void setVomitaBoladePelos(boolean vomitaBoladePelos) {
		this.vomitaBoladePelos = vomitaBoladePelos;
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getDataChegada()
	 */
	@Override
	public LocalDate getDataChegada() {
		// TODO Auto-generated method stub
		return super.getDataChegada();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setDataChegada(java.time.LocalDate)
	 */
	@Override
	public void setDataChegada(LocalDate dataChegada) {
		// TODO Auto-generated method stub
		super.setDataChegada(dataChegada);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getDataNascimento()
	 */
	@Override
	public LocalDate getDataNascimento() {
		// TODO Auto-generated method stub
		return super.getDataNascimento();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setDataNascimento(java.time.LocalDate)
	 */
	@Override
	public void setDataNascimento(LocalDate dataNascimento) {
		// TODO Auto-generated method stub
		super.setDataNascimento(dataNascimento);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getCondicoesGerais()
	 */
	@Override
	public ProntuarioMedico getCondicoesGerais() {
		// TODO Auto-generated method stub
		return super.getCondicoesGerais();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setCondicoesGerais(pojo.ProntuarioMedico)
	 */
	@Override
	public void setCondicoesGerais(ProntuarioMedico condicoesGerais) {
		// TODO Auto-generated method stub
		super.setCondicoesGerais(condicoesGerais);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gato [vomitaBoladePelos=" + vomitaBoladePelos + ", toString()="
				+ super.toString() + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (vomitaBoladePelos ? 1231 : 1237);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Gato)) {
			return false;
		}
		Gato other = (Gato) obj;
		if (vomitaBoladePelos != other.vomitaBoladePelos) {
			return false;
		}
		return true;
	}

}
