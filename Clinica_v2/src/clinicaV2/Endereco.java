/**
 * 
 */
package clinicaV2;

/**
 * @author illoatayde
 *
 */
public class Endereco {
	
	private String CEP;
	private String logradouro;
	private String bairro;
	private int numero;
	private String complemento;
	
	public Endereco(String CEP, String logradouro, int numero, String bairro, String complemento){		
		this.CEP = CEP;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
	}
	
	public Endereco(){
	}

	/**
	 * @return the CEP
	 */
	public String getCEP() {
		return CEP;
	}

	/**
	 * @param CEP the CEP to set
	 */
	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Endereco [CEP=" + CEP + ", logradouro=" + logradouro
				+ ", bairro=" + bairro + ", numero=" + numero
				+ ", complemento=" + complemento + "]";
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
		if (!(obj instanceof Endereco)) {
			return false;
		}
		Endereco other = (Endereco) obj;
		if (CEP == null) {
			if (other.CEP != null) {
				return false;
			}
		} else if (!CEP.equals(other.CEP)) {
			return false;
		}
		if (bairro == null) {
			if (other.bairro != null) {
				return false;
			}
		} else if (!bairro.equals(other.bairro)) {
			return false;
		}
		if (complemento == null) {
			if (other.complemento != null) {
				return false;
			}
		} else if (!complemento.equals(other.complemento)) {
			return false;
		}
		if (logradouro == null) {
			if (other.logradouro != null) {
				return false;
			}
		} else if (!logradouro.equals(other.logradouro)) {
			return false;
		}
		if (numero != other.numero) {
			return false;
		}
		return true;
	}
}
	