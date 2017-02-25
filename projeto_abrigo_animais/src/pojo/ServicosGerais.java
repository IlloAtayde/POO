package pojo;

import java.time.LocalDate;

/**
 * @author illoatayde
 *
 */

public class ServicosGerais extends Colaborador {
	
	/**
	 * @param documento
	 * @param nome
	 * @param dataNascimento
	 * @param voluntario
	 * @param dataEntrada 
	 * @param endereco
	 */
	
	private String atividade;

	public ServicosGerais(String documento, String nome, String dataNascStr, boolean voluntario, Endereco endereco, String atividade) {
		super(documento, nome, dataNascStr, voluntario, endereco);
		this.atividade = atividade;
		// TODO Auto-generated constructor stub
	}

	public ServicosGerais(){
		
	}

	/**
	 * @return the atividade
	 */
	public String getAtividade() {
		return atividade;
	}


	/**
	 * @param atividade the atividade to set
	 */
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}


	/**
	 * @return the salario
	 */
	@Override
	public double getSalarioBase() {
		return super.getSalarioBase() * 1.5;
	}

	
	/**
	 * @param salario the salario to set
	 */
	/*
	public void setSalario(double salario) {
		this.salario = salario;
	}*/


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
	/*@Override
	public void setDataEntrada(LocalDate dataEntrada) {
		// TODO Auto-generated method stub
		super.setDataEntrada(dataEntrada);
	}*/


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
		return "ServicosGerais [atividade=" + atividade + ", salario="
				+ this.getSalarioBase() + ", toString()=" + super.toString() + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((atividade == null) ? 0 : atividade.hashCode());
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
		if (!(obj instanceof ServicosGerais)) {
			return false;
		}
		ServicosGerais other = (ServicosGerais) obj;
		if (atividade == null) {
			if (other.atividade != null) {
				return false;
			}
		} else if (!atividade.equals(other.atividade)) {
			return false;
		}
		return true;
	}



}
