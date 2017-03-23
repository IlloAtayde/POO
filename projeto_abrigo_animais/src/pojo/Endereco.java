/**
 * 
 */
package pojo;

import java.io.Serializable;

/**
 * @author illoatayde
 *
 */
public class Endereco implements Serializable {
	
	private String CEP;
	private String logradouro;
	private String bairro;
	private String numero;
	private String complemento;
	static final String textoPadrao = "NÃO INFORMADO";
	
	public Endereco(String CEP, String logradouro, String numero, String bairro, String complemento){		
		this.CEP = CEP;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
	}
	
	public Endereco(){
		this.CEP = textoPadrao;
		this.logradouro = textoPadrao;
		this.numero = textoPadrao;
		this.bairro = textoPadrao;
		this.complemento = textoPadrao;	
	}
	
	public Endereco(String cad_end){
		String[] c_e_aux = cad_end.split(";");
		
		this.CEP = c_e_aux[0];
		this.logradouro = c_e_aux[1];
		this.numero = c_e_aux[2];
		this.bairro = c_e_aux[3];
		this.complemento = c_e_aux[4];	
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
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
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
		return logradouro + ", Nº: " + numero + ", Complemento: " + complemento
				+ "\nBairro: " + bairro + ", CEP: " + CEP;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CEP == null) ? 0 : CEP.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result
				+ ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result
				+ ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		if (numero == null) {
			if (other.numero != null) {
				return false;
			}
		} else if (!numero.equals(other.numero)) {
			return false;
		}
		return true;
	}

}
