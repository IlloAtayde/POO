package clinicaV2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDate hoje = LocalDate.now();
		LocalDate hoje_1;
		//DateTimeFormatter formatter;
		//String data = hoje.format(DateTimeFormatter.ofPattern("EEEE',' dd 'de' MMMM 'de' uuuu"));
		//System.out.println(data);
		//FormatStyle ;
		hoje_1 = LocalDate.parse("30 11 1900",DateTimeFormatter.ofPattern("dd M uuuu"));
		Paciente p1 = new Paciente("008","Garnizé João da Cunha Gallo","masculino");
		Paciente p2 = new Paciente("009","Lobanês Cachorrina da Silva","feminino");
		Paciente p3 = new Paciente("007","Lagatixa Lídia Álvarez","feminino");
		Paciente p4 = new Paciente("005","Amistad Sapulha Salto","masculino");
		Paciente p5 = new Paciente("003","Razinza Pernafina","feminino");	
		//temp = LocalDate.of(1980, 11, 14);
		p1.setNascimento(LocalDate.of(1950, 11, 14));
		System.out.println(p1.FormatarNomePaciente());
		//p2.setNascimento(hoje_1);
		p3.setNascimento(hoje_1.plusYears(5));
		p4.setNascimento(hoje_1.minusYears(10));
		p5.setNascimento(hoje_1.minusYears(25));
		CollectionPacientes ColPacientes = new CollectionPacientes();
		ColPacientes.AdicionarPaciente(p1);
		ColPacientes.AdicionarPaciente(p2);
		ColPacientes.AdicionarPaciente(p3);
		ColPacientes.AdicionarPaciente(p4);
		ColPacientes.AdicionarPaciente(p5);
		//ColPacientes.ListarPacientesCompleto();
		ColPacientes.BuscarPacienteCPF("005");
		//ColPacientes.RemoverPacienteCPF("009");
		ColPacientes.ListarPacientesCompleto();
		int masc = ColPacientes.QuantidadePorSexo("masculino");
		int fem = ColPacientes.QuantidadePorSexo("feminino");
		System.out.println(masc);
		System.out.println(fem);
		ColPacientes.ListarPacientesMaioresdeSessenta();
		
		Medico m1 = new Medico("001", "Carlos Xavier Mendonça");
		Medico m2 = new Medico("002", "Vargas Pires Cerqueira");
		Medico m3 = new Medico("003", "Nélio Alvarez Nascimento");
		Medico m4 = new Medico("004", "Francisco Firmino de Sá");
		CollectionMedicos ColMedicos = new CollectionMedicos();
		ColMedicos.AdicionarMedicos(m1);
		ColMedicos.AdicionarMedicos(m2);
		ColMedicos.AdicionarMedicos(m3);
		ColMedicos.AdicionarMedicos(m4);
		System.out.println(ColMedicos.BuscarMedicoCRM("001").toString());
		ColMedicos.BuscarMedicoNome("a");
		
		Consulta c1 = new Consulta(p1, m1);
		Consulta c2 = new Consulta(p2, m2);
		Consulta c3 = new Consulta(p3, m3);
		Consulta c4 = new Consulta(p4, m1);
		Consulta c5 = new Consulta(p5);
		Consulta c6 = new Consulta(p5, m1);
		CollectionConsultas ColConsultas = new CollectionConsultas();
		ColConsultas.AdicionarConsulta(c1);
		ColConsultas.AdicionarConsulta(c2);
		ColConsultas.AdicionarConsulta(c3);
		ColConsultas.AdicionarConsulta(c4);
		ColConsultas.AdicionarConsulta(c5);
		ColConsultas.AdicionarConsulta(c6);
		ColConsultas.ListarConsultas();
		ColConsultas.ListarConsultasPaciente("Garnizé");
		int qntConsulMedico = ColConsultas.QntConsultasMedico("xavier");
		System.out.println("Número de consultas solicitado:"+qntConsulMedico);
		ColConsultas.RemoverConsulta(c5);
		ColConsultas.ListarConsultas();
		int qntConsulData = ColConsultas.QntConsultasData(LocalDate.of(2016, 12, 01));
		System.out.println("Número de consultas solicitado: " + qntConsulData);
	}

}
