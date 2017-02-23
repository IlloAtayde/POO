/**
 * 
 */
package pojo;

import java.time.LocalDate;

/**
 * @author illoatayde
 *
 */
public class Veterinario extends Colaborador {

	/**
	 * @param documento
	 * @param nome
	 * @param dataNascimento
	 * @param voluntario
	 * @param dataEntrada 
	 * @param endereco
	 */
	
	private String crmv;
	private String especialidade;
	private double salario;
	
	public Veterinario(String documento, String nome, LocalDate dataNascimento, boolean voluntario, LocalDate dataEntrada, Endereco endereco, String crmv, String especialidade, double salario) {
		super(documento, nome, dataNascimento, voluntario, dataEntrada, endereco);
		this.crmv = crmv;
		this.especialidade = especialidade;
		this.salario = salario;
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#getDocumento()
	 */
	@Override
	public String getDocumento() {
		// TODO Auto-generated method stub
		return super.getDocumento();
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#setDocumento(java.lang.String)
	 */
	@Override
	public void setDocumento(String documento) {
		// TODO Auto-generated method stub
		super.setDocumento(documento);
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#getNome()
	 */
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#getDataNascimento()
	 */
	@Override
	public LocalDate getDataNascimento() {
		// TODO Auto-generated method stub
		return super.getDataNascimento();
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#setDataNascimento(java.time.LocalDate)
	 */
	@Override
	public void setDataNascimento(LocalDate dataNascimento) {
		// TODO Auto-generated method stub
		super.setDataNascimento(dataNascimento);
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#isVoluntario()
	 */
	@Override
	public boolean isVoluntario() {
		// TODO Auto-generated method stub
		return super.isVoluntario();
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#setVoluntario(boolean)
	 */
	@Override
	public void setVoluntario(boolean voluntario) {
		// TODO Auto-generated method stub
		super.setVoluntario(voluntario);
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#getDataEntrada()
	 */
	@Override
	public LocalDate getDataEntrada() {
		// TODO Auto-generated method stub
		return super.getDataEntrada();
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#setDataEntrada(java.time.LocalDate)
	 */
	@Override
	public void setDataEntrada(LocalDate dataEntrada) {
		// TODO Auto-generated method stub
		super.setDataEntrada(dataEntrada);
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#getEndereco()
	 */
	@Override
	public Endereco getEndereco() {
		// TODO Auto-generated method stub
		return super.getEndereco();
	}

	/* (non-Javadoc)
	 * @see pojo.Colaborador#setEndereco(pojo.Endereco)
	 */
	@Override
	public void setEndereco(Endereco endereco) {
		// TODO Auto-generated method stub
		super.setEndereco(endereco);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Veterinario [crmv=" + crmv + ", especialidade=" + especialidade
				+ ", salario=" + salario + ", toString()=" + super.toString()
				+ "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((crmv == null) ? 0 : crmv.hashCode());
		result = prime * result
				+ ((especialidade == null) ? 0 : especialidade.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
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
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Veterinario)) {
			return false;
		}
		Veterinario other = (Veterinario) obj;
		if (crmv == null) {
			if (other.crmv != null) {
				return false;
			}
		} else if (!crmv.equals(other.crmv)) {
			return false;
		}
		if (especialidade == null) {
			if (other.especialidade != null) {
				return false;
			}
		} else if (!especialidade.equals(other.especialidade)) {
			return false;
		}
		if (Double.doubleToLongBits(salario) != Double
				.doubleToLongBits(other.salario)) {
			return false;
		}
		return true;
	}

}
