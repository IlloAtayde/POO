package clinicaV2;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente p1 = new Paciente("008","Garnizé João da Cunha Gallo","Masculino");
		Paciente p2 = new Paciente("009","Lobanês Cachorrina Silva","Feminino");
		Paciente p3 = new Paciente("007","Lagatixa Lídia Álvarez","Feminino");
		Paciente p4 = new Paciente("005","Amistad Sapulha Salto","Masculino");
		Paciente p5 = new Paciente("003","Razinza Pernafina","Feminino");
		System.out.println(p1.FormatarNomePaciente());
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
		int masc = ColPacientes.QuantidadePorSexo("Masculino");
		int fem = ColPacientes.QuantidadePorSexo("Feminino");
		System.out.println(masc);
		System.out.println(fem);
	}

}
