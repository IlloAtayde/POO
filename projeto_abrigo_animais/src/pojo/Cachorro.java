/**
 * 
 */
package pojo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author illoatayde
 *
 */
public class Cachorro extends Animal implements Serializable {

	/**
	 * @param registro
	 * @param nome
	 * @param raca
	 * @param comportamento
	 * @param dataChegada
	 * @param dataNascimento
	 * @param condicoesGerais
	 */
	private String porte;
	private String habilidades;
	
	public Cachorro(String registro, String nome, String sexo, String raca, String porte, String habilidades, String comportamento, String dataChegStr, String dataNascStr, ProntuarioMedico condicoesGerais) {
		super(registro, nome, sexo, raca, comportamento, dataChegStr, dataNascStr,	condicoesGerais);
		this.porte = porte;
		this.habilidades = habilidades;
	}
	public Cachorro() {
		
	}
	
	public Cachorro(String str_atrib_gerais,String str_pront_medico, String str_atrib_espec) {
		super(str_atrib_gerais,str_pront_medico);
		String[] s_a_e_aux = str_atrib_espec.split(";");
		this.porte = s_a_e_aux[0];
		this.habilidades = s_a_e_aux[1];		
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getRegistro()
	 */
	@Override
	public String getRegistro() {
		// TODO Auto-generated method stub
		return super.getRegistro();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setRegistro(java.lang.String)
	 */
	@Override
	public void setRegistro(String registro) {
		// TODO Auto-generated method stub
		super.setRegistro(registro);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getNome()
	 */
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getRaca()
	 */
	@Override
	public String getRaca() {
		// TODO Auto-generated method stub
		return super.getRaca();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setRaca(java.lang.String)
	 */
	@Override
	public void setRaca(String raca) {
		// TODO Auto-generated method stub
		super.setRaca(raca);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getComportamento()
	 */
	@Override
	public String getComportamento() {
		// TODO Auto-generated method stub
		return super.getComportamento();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setComportamento(java.lang.String)
	 */
	@Override
	public void setComportamento(String comportamento) {
		// TODO Auto-generated method stub
		super.setComportamento(comportamento);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getDataChegada()
	 */
	@Override
	public LocalDate getDataChegada() {
		// TODO Auto-generated method stub
		return super.getDataChegada();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setDataChegada(java.time.LocalDate)
	 */
	@Override
	public void setDataChegada(LocalDate dataChegada) {
		// TODO Auto-generated method stub
		super.setDataChegada(dataChegada);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getDataNascimento()
	 */
	@Override
	public LocalDate getDataNascimento() {
		// TODO Auto-generated method stub
		return super.getDataNascimento();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setDataNascimento(java.time.LocalDate)
	 */
	@Override
	public void setDataNascimento(LocalDate dataNascimento) {
		// TODO Auto-generated method stub
		super.setDataNascimento(dataNascimento);
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#getCondicoesGerais()
	 */
	@Override
	public ProntuarioMedico getCondicoesGerais() {
		// TODO Auto-generated method stub
		return super.getCondicoesGerais();
	}

	/* (non-Javadoc)
	 * @see pojo.Animal#setCondicoesGerais(pojo.ProntuarioMedico)
	 */
	@Override
	public void setCondicoesGerais(ProntuarioMedico condicoesGerais) {
		// TODO Auto-generated method stub
		super.setCondicoesGerais(condicoesGerais);
	}

	/**
	 * @return the porte
	 */
	public String getPorte() {
		return porte;
	}
	/**
	 * @param porte the porte to set
	 */
	public void setPorte(String porte) {
		this.porte = porte;
	}
	/**
	 * @return the habilidades
	 */
	public String getHabilidades() {
		return habilidades;
	}
	/**
	 * @param habilidades the habilidades to set
	 */
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n[Cachorro]\n" + super.toString()+ "\nPorte: " + porte + "\tHabilidades: " + habilidades +"\n"+ this.getCondicoesGerais().toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((habilidades == null) ? 0 : habilidades.hashCode());
		result = prime * result + ((porte == null) ? 0 : porte.hashCode());
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
		if (!(obj instanceof Cachorro)) {
			return false;
		}
		Cachorro other = (Cachorro) obj;
		if (habilidades == null) {
			if (other.habilidades != null) {
				return false;
			}
		} else if (!habilidades.equals(other.habilidades)) {
			return false;
		}
		if (porte == null) {
			if (other.porte != null) {
				return false;
			}
		} else if (!porte.equals(other.porte)) {
			return false;
		}
		return true;
	}

}
