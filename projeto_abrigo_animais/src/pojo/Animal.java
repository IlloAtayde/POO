/**
 * 
 */
package pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author illoatayde
 *
 */
public class Animal {
	
	private String registro;
	private String nome;
	private String sexo;
	private String raca;
	private String comportamento;
	private LocalDate dataChegada;
	private LocalDate dataNascimento;
	private ProntuarioMedico condicoesGerais;
	
	public Animal(String registro, String nome,String sexo, String raca, String comportamento, String dataChegStr, String dataNascStr, ProntuarioMedico condicoesGerais){
		this.registro = registro;
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
		this.comportamento = comportamento;
		DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");
		this.dataChegada = LocalDate.parse(dataChegStr, dataFormato);
		//this.dataChegada = dataChegada;
		this.dataNascimento = LocalDate.parse(dataNascStr, dataFormato);
		this.condicoesGerais = new ProntuarioMedico();
	}
	public Animal(){
		
	}

	/**
	 * @return the registro
	 */
	public String getRegistro() {
		return registro;
	}

	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(String registro) {
		this.registro = registro;
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
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the raca
	 */
	public String getRaca() {
		return raca;
	}

	/**
	 * @param raca the raca to set
	 */
	public void setRaca(String raca) {
		this.raca = raca;
	}

	/**
	 * @return the comportamento
	 */
	public String getComportamento() {
		return comportamento;
	}

	/**
	 * @param comportamento the comportamento to set
	 */
	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

	/**
	 * @return the dataChegada
	 */
	public LocalDate getDataChegada() {
		return dataChegada;
	}

	/**
	 * @param dataChegada the dataChegada to set
	 */
	public void setDataChegada(LocalDate dataChegada) {
		this.dataChegada = dataChegada;
	}

	/**
	 * @return the dataNascimento
	 */
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the condicoesGerais
	 */
	public ProntuarioMedico getCondicoesGerais() {
		return condicoesGerais;
	}

	/**
	 * @param condicoesGerais the condicoesGerais to set
	 */
	public void setCondicoesGerais(ProntuarioMedico condicoesGerais) {
		this.condicoesGerais = condicoesGerais;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(sexo.equals("f")){
			sexo = "fêmea";
		}else{
			sexo = "macho";
		}
		return "Registro: " + registro + "\tEntrada: " + dataChegada + "\nNome: " + nome + ", "
				+ sexo + "\tRaça: " + raca + "\tComportamento: " + comportamento
				+  "\nNascimento: "+ dataNascimento;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((comportamento == null) ? 0 : comportamento.hashCode());
		result = prime * result
				+ ((condicoesGerais == null) ? 0 : condicoesGerais.hashCode());
		result = prime * result
				+ ((dataChegada == null) ? 0 : dataChegada.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((raca == null) ? 0 : raca.hashCode());
		result = prime * result
				+ ((registro == null) ? 0 : registro.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Animal)) {
			return false;
		}
		Animal other = (Animal) obj;
		if (comportamento == null) {
			if (other.comportamento != null) {
				return false;
			}
		} else if (!comportamento.equals(other.comportamento)) {
			return false;
		}
		if (condicoesGerais == null) {
			if (other.condicoesGerais != null) {
				return false;
			}
		} else if (!condicoesGerais.equals(other.condicoesGerais)) {
			return false;
		}
		if (dataChegada == null) {
			if (other.dataChegada != null) {
				return false;
			}
		} else if (!dataChegada.equals(other.dataChegada)) {
			return false;
		}
		if (dataNascimento == null) {
			if (other.dataNascimento != null) {
				return false;
			}
		} else if (!dataNascimento.equals(other.dataNascimento)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (raca == null) {
			if (other.raca != null) {
				return false;
			}
		} else if (!raca.equals(other.raca)) {
			return false;
		}
		if (registro == null) {
			if (other.registro != null) {
				return false;
			}
		} else if (!registro.equals(other.registro)) {
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
