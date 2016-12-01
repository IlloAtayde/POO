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
		return "Endereco [CEP=" + CEP + ", logradouro=" + logradouro
				+ ", bairro=" + bairro + ", numero=" + numero
				+ ", complemento=" + complemento + "]";
	}
	
}
	