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
public class Colaborador {
	
	private String documento;
	private String nome;
	private LocalDate dataNascimento;
	private boolean voluntario;
	private LocalDate dataEntrada;
	private Endereco endereco;
	private double salarioBase;
	
	public Colaborador(String documento, String nome, String dataNascStr, boolean voluntario, Endereco endereco){
		this.documento = documento;
		this.nome = nome;
		DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");
		this.dataNascimento = LocalDate.parse(dataNascStr, dataFormato);
		this.voluntario = voluntario;
		this.dataEntrada = LocalDate.now();
		this.endereco = endereco;
		if(this.isVoluntario()){
			this.salarioBase = 0.00;
		}else{
			this.salarioBase = 880.00;			
		}
	}

	public Colaborador(){
		this.documento = "VAZIO";
		this.nome = "VAZIO";
		this.dataNascimento = LocalDate.now();
		this.voluntario = true;
		this.dataEntrada = LocalDate.now();
		this.endereco = new Endereco();
		this.salarioBase = 0.00;
	}
	
	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
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
	 * @return the voluntario
	 */
	public boolean isVoluntario() {
		return voluntario;
	}

	/**
	 * @param voluntario the voluntario to set
	 */
	public void setVoluntario(boolean voluntario) {
		this.voluntario = voluntario;
	}

	/**
	 * @return the dataEntrada
	 */
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	/**
	 * @param dataEntrada the dataEntrada to set
	 *//*
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}*/

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the salarioBase
	 */
	public double getSalarioBase() {
		return salarioBase;
	}

	/**
	 * @param salarioBase the salarioBase to set
	 */
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Colaborador [documento=" + documento + ", nome=" + nome
				+ ", dataNascimento=" + dataNascimento + ", voluntario="
				+ voluntario + ", dataEntrada=" + dataEntrada + ", endereco="
				+ endereco + ", salarioBase=" + salarioBase + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataEntrada == null) ? 0 : dataEntrada.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result
				+ ((documento == null) ? 0 : documento.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salarioBase);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (voluntario ? 1231 : 1237);
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
		if (!(obj instanceof Colaborador)) {
			return false;
		}
		Colaborador other = (Colaborador) obj;
		if (dataEntrada == null) {
			if (other.dataEntrada != null) {
				return false;
			}
		} else if (!dataEntrada.equals(other.dataEntrada)) {
			return false;
		}
		if (dataNascimento == null) {
			if (other.dataNascimento != null) {
				return false;
			}
		} else if (!dataNascimento.equals(other.dataNascimento)) {
			return false;
		}
		if (documento == null) {
			if (other.documento != null) {
				return false;
			}
		} else if (!documento.equals(other.documento)) {
			return false;
		}
		if (endereco == null) {
			if (other.endereco != null) {
				return false;
			}
		} else if (!endereco.equals(other.endereco)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (Double.doubleToLongBits(salarioBase) != Double
				.doubleToLongBits(other.salarioBase)) {
			return false;
		}
		if (voluntario != other.voluntario) {
			return false;
		}
		return true;
	}

}
