package pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegFinanceiro {

	private LocalDate data;
	private double valor;
	private String descricao;
	
	public RegFinanceiro(String data, double valor, String descricao) {
		DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");
		this.data = LocalDate.parse(data, dataFormato);
		this.valor = valor;
		this.descricao = descricao;
	}

	public RegFinanceiro(){
		this.data = LocalDate.now();
		this.valor = 0.00;
		this.descricao = "Nenhuma descrição";
	}
	/**
	 * @return the data
	 */
	public LocalDate getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(LocalDate data) {
		this.data = data;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n[Registro Financeiro]\nData: " + data + "\nDescrição: " + descricao +  "\nValor: " + valor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (!(obj instanceof RegFinanceiro)) {
			return false;
		}
		RegFinanceiro other = (RegFinanceiro) obj;
		if (data == null) {
			if (other.data != null) {
				return false;
			}
		} else if (!data.equals(other.data)) {
			return false;
		}
		if (descricao == null) {
			if (other.descricao != null) {
				return false;
			}
		} else if (!descricao.equals(other.descricao)) {
			return false;
		}
		if (Double.doubleToLongBits(valor) != Double
				.doubleToLongBits(other.valor)) {
			return false;
		}
		return true;
	}

}
