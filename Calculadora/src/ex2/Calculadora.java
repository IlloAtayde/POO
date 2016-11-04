package ex2;

import java.math.BigInteger;

public class Calculadora {
	
	private BigInteger resutado;

	/**
	 * @param resutado
	 */
	public Calculadora() {
		this.resutado = new BigInteger("0");//BigInteger.ZERO;
	}
	public void Somar(BigInteger valAdd){
		this.resutado = resutado.add(valAdd);
	}
	public void Subtrair(BigInteger valSub){
		this.resutado = resutado.subtract(valSub);
	}
	public void Multiplicar(BigInteger valMult){
		this.resutado = resutado.multiply(valMult);
	}
	public void Dividir(BigInteger valDiv){
		this.resutado = resutado.divide(valDiv);
	}
	public void Potenciacao(int valPow){
		this.resutado = resutado.pow(valPow);
	}
	public Boolean Comparar(BigInteger valComp){
		return this.resutado.equals(valComp);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Acumulador = " + resutado;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((resutado == null) ? 0 : resutado.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (resutado == null) {
			if (other.resutado != null)
				return false;
		} else if (!resutado.equals(other.resutado))
			return false;
		return true;
	}
	

}
