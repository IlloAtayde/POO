package clinicaV2;

import java.time.LocalDate;

public class Consulta {
	
	private LocalDate dataConsulta;
	private Paciente paciente;
	private Medico medico;
	
	public Consulta(Paciente paciente, Medico medico) {
		// TODO Auto-generated constructor stub
		this.dataConsulta = LocalDate.now();
		this.paciente = paciente;
		this.medico = medico;
	}
	public Consulta(Paciente paciente){
		this.dataConsulta = LocalDate.now();
		this.paciente = paciente;
		this.medico = new Medico("000","À DEFINIR") ;
	}
	/**
	 * @return the dataConsulta
	 */
	public LocalDate getDataConsulta() {
		return dataConsulta;
	}
	/**
	 * @param dataConsulta the dataConsulta to set
	 */
	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}
	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	/**
	 * @return the medico
	 */
	public Medico getMedico() {
		return medico;
	}
	/**
	 * @param medico the medico to set
	 */
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Consulta [dataConsulta=" + dataConsulta + ", paciente="
				+ paciente.getNome() + ", medico=" + medico.getNome() + "]";
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
		if (!(obj instanceof Consulta)) {
			return false;
		}
		Consulta other = (Consulta) obj;
		if (dataConsulta == null) {
			if (other.dataConsulta != null) {
				return false;
			}
		} else if (!dataConsulta.equals(other.dataConsulta)) {
			return false;
		}
		if (medico == null) {
			if (other.medico != null) {
				return false;
			}
		} else if (!medico.equals(other.medico)) {
			return false;
		}
		if (paciente == null) {
			if (other.paciente != null) {
				return false;
			}
		} else if (!paciente.equals(other.paciente)) {
			return false;
		}
		return true;
	}

}
