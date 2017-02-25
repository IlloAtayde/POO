/**
 * 
 */
package pojo;

/**
 * @author illoatayde
 *
 */
public class ProntuarioMedico {
	
	private double peso;
	private boolean vacinado;
	private boolean vermifugado;
	private boolean castrado;
	private String avaliacaoClinica;
	
	public ProntuarioMedico(double peso, boolean vacinado, boolean vermifugado, boolean castrado, String avaliacaoClinica){
		this.peso =  peso;
		this.vacinado = vacinado;
		this.vermifugado = vermifugado;
		this.castrado = castrado;
		this.avaliacaoClinica = avaliacaoClinica;
	}
	
	public ProntuarioMedico(){
		this.peso = 10.00;
		this.castrado = false;
		this.vermifugado = false;
		this.vacinado = false;
		this.avaliacaoClinica = "Não verificado";
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the vacinado
	 */
	public boolean isVacinado() {
		return vacinado;
	}

	/**
	 * @param vacinado the vacinado to set
	 */
	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}

	/**
	 * @return the vermifugado
	 */
	public boolean isVermifugado() {
		return vermifugado;
	}

	/**
	 * @param vermifugado the vermifugado to set
	 */
	public void setVermifugado(boolean vermifugado) {
		this.vermifugado = vermifugado;
	}

	/**
	 * @return the castrado
	 */
	public boolean isCastrado() {
		return castrado;
	}

	/**
	 * @param castrado the castrado to set
	 */
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	/**
	 * @return the avaliacaoClinica
	 */
	public String getAvaliacaoClinica() {
		return avaliacaoClinica;
	}

	/**
	 * @param avaliacaoClinica the avaliacaoClinica to set
	 */
	public void setAvaliacaoClinica(String avaliacaoClinica) {
		this.avaliacaoClinica = avaliacaoClinica;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String vac,cast,verm;
		if(this.isCastrado()){
			 cast = "SIM";
		}else{
			cast = "NÃO";
		}
		if(this.isVacinado()){
			vac = "SIM";
		}else{
			vac = "NÃO";
		}
		if(this.isVermifugado()){
			verm = "SIM";
		}else{
			verm = "NÃO";
		}
		return "\n-- Avaliação Clínica --\nPeso: " + peso + "\nvacinado: " + vac
				+ " vermifugado: " + verm + " castrado: " + cast
				+ "\nCondições gerais: " + avaliacaoClinica;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((avaliacaoClinica == null) ? 0 : avaliacaoClinica.hashCode());
		result = prime * result + (castrado ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (vacinado ? 1231 : 1237);
		result = prime * result + (vermifugado ? 1231 : 1237);
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
		if (!(obj instanceof ProntuarioMedico)) {
			return false;
		}
		ProntuarioMedico other = (ProntuarioMedico) obj;
		if (avaliacaoClinica == null) {
			if (other.avaliacaoClinica != null) {
				return false;
			}
		} else if (!avaliacaoClinica.equals(other.avaliacaoClinica)) {
			return false;
		}
		if (castrado != other.castrado) {
			return false;
		}
		if (Double.doubleToLongBits(peso) != Double
				.doubleToLongBits(other.peso)) {
			return false;
		}
		if (vacinado != other.vacinado) {
			return false;
		}
		if (vermifugado != other.vermifugado) {
			return false;
		}
		return true;
	}

}
