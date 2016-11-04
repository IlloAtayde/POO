package p2.exercicios;
/**
 * 
 * @author illoatayde
 * 
 * Classe modelada para dados de pessoas
 */
public class Pessoa {
	
	private String nome;
	private String cpf;
	private String genero;
	private int idade;
	private String telefone;
	private Endereco endereco;
	/**
	 * @param nome
	 * @param cpf
	 * @param genero
	 * @param idade
	 * @param telefone
	 */
	public Pessoa(String nome, String cpf, String genero, int idade,
			String telefone, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public Pessoa() {
		
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
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Pessoa " + nome + ", " + idade + " anos, CPF: " + cpf + ", gênero: " + genero
				+ ", fone " + telefone;
	}

}
