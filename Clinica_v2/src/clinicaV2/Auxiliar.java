package clinicaV2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Auxiliar{
	
	
	
	public static void imprimirTelaInicial(){
		LocalDate hoje = LocalDate.now();
		System.out.printf("\tCLÍNICA MÉDICA 2.0\n\t\t\t\t\t\t\t\t");
		String data = hoje.format(DateTimeFormatter.ofPattern("EEEE',' dd 'de' MMMM 'de' uuuu"));
		System.out.println(data);
	}
	public static void imprimirMenu(String tituloMenu, String textoMenu) {
		String[] menuTemp = textoMenu.split(",");
		System.out.printf("\t%s\n",tituloMenu);
		System.out.printf("ESCOLHA UMA DAS OPÇÕES ABAIXO:\n\n");
		for(int i = 0; i < menuTemp.length;i++){
			System.out.printf("%d - %s\n", i+1, menuTemp[i]);
		}
	}
	public static int capturaMenu(int numOp){
		
		Scanner op = new Scanner(System.in);
		
		while(op.hasNextInt()){
			int opMenu = op.nextInt();
			if(0 < opMenu && opMenu <= numOp){
				return opMenu;
			}
			System.err.printf("Digite um valor entre 1 e %d",numOp);
		}
		System.err.printf("Digite um valor entre 1 e %d",numOp);
		return capturaMenu(numOp);	
	}
	
	
	public static void trataOpcaoMenu(int opcaoMenu,CollectionConsultas colCons,CollectionMedicos colMed, CollectionPacientes colPac){
		int opSubMenu = 0;
		switch (opcaoMenu) {
		case 1:
			do{
				imprimirMenu("PACIENTE", "ADICIONAR,PESQUISAR CPF,REMOVER CPF,QUANTIDADE SEXO,LISTAR TODOS,MAIORES DE SESSENTA,MENU PRINCIPAL");
				opSubMenu = capturaMenu(7);
				trataMenuPaciente(opSubMenu,colPac);
			}while(opSubMenu < 7);
			break;
		case 2:
			do{
				imprimirMenu("MÉDICO","ADICIONAR,PESQUISAR CRM,PESQUISAR NOME,LISTAR,MENU PRINCIPAL");
				opSubMenu = capturaMenu(5);
				trataMenuMedico(opSubMenu,colMed);
			}while(opSubMenu < 5);
			break;
		case 3:
			do{
				imprimirMenu("CONSULTA","ADICIONAR,POR DATA,LISTAR,POR MÉDICO,POR PACIENTE,MENU PRINCIPAL");
				opSubMenu = capturaMenu(6);
				trataMenuConsulta(opSubMenu,colCons,colMed,colPac);
			}while(opSubMenu < 6);
			break;
		case 4:
			System.out.println("SAINDO DO SISTEMA!");
			break;
		default:
			break;
		}
	}
	public static void trataMenuPaciente(int opMenu, CollectionPacientes colPac){
		
		switch (opMenu) {
		case 1:
			//System.out.println("ADICIONAR PACIENTE: ");
			colPac.AdicionarPaciente(cadastrarPaciente());
			break;
		case 2:
			if(colPac.ColVazia()){
				System.err.println("Não existe pacientes cadastrados!");
				break;
			}
			System.out.println("BUSCAR POR CPF: ");
			System.out.println("Digite o CPF do paciente: ");
			colPac.ExibirPacienteCPF(lerString());
			break;
		case 3:
			if(colPac.ColVazia()){
				System.err.println("Não existe pacientes cadastrados!");
				break;
			}
			System.out.println("REMOVER POR CPF: ");
			System.out.println("Digite o CPF do paciente: ");
			if(colPac.RemoverPacienteCPF(lerString())){
				System.out.println("Remoção efetuada com sucesso!");
				break;
			}
			System.err.println("Falha na remoção!");
			break;
		case 4:
			if(!colPac.ColVazia()){
				System.out.println("QUANTIDADE POR SEXO: ");
				System.out.println("SEXO: ");
				int qntSexo = colPac.QuantidadePorSexo(lerSexo());
				System.out.println(qntSexo + " paciente(s) encontrado(s)");
				break;
			}
			System.err.println("Não existe pacientes cadastrados!");
			break;
		case 5:
			if(!colPac.ColVazia()){
				System.out.println("LISTAR TODOS OS PACIENTES: ");
				colPac.ListarPacientesCompleto();
				break;
			}
			System.err.println("Não existe pacientes cadastrados!");
			break;
		case 6:
			if(!colPac.ColVazia()){
				System.out.println("MAIORES DE SESSENTA ANOS: ");
				colPac.ListarPacientesMaioresdeSessenta();
				break;
			}
			System.err.println("Não existe pacientes cadastrados!");
			break;
		case 7:
			System.out.println("RETORNANDO AO MENU PRINCIPAL!");
		default:
			break;
		}
	}
	public static void trataMenuMedico(int opMenu, CollectionMedicos colMed){
		
		switch (opMenu) {
		case 1:
			//System.out.println("ADICIONAR MÉDICO: ");
			colMed.AdicionarMedicos(cadastrarMedico());
			break;
		case 2:
			if(!colMed.ColVazia()){
				System.out.println("EXIBIR POR CRM: ");
				System.out.println("Digite o CRM do Médico: ");
				colMed.ExibirMedicoCRM(lerString());
				break;
			}
			System.err.println("Não existe médicos cadastrados!");
			break;
		case 3:
			if(!colMed.ColVazia()){
				System.out.println("PESQUISAR POR NOME: ");
				System.out.println("DIGITE O NOME DO MÉDICO: ");
				colMed.BuscarMedicoNome(lerString());
				break;
			}
			System.err.println("Não existe médicos cadastrados!");
			break;
		case 4:
			if(!colMed.ColVazia()){
				System.out.println("LISTAR MÉDICOS: ");
				colMed.ListarMedicosCompleto();
				break;
			}
			System.err.println("Não existe médicos cadastrados!");
			break;
		case 5:
			System.out.println("RETORNANDO AO MENU PRINCIPAL!");
		default:
			break;
		}
	}
	public static void trataMenuConsulta(int opMenu, CollectionConsultas colCons, CollectionMedicos colMed, CollectionPacientes colPac){
		
		switch (opMenu) {
		case 1:
			//System.out.println("ADICIONAR CONSULTA: ");
			colCons.AdicionarConsulta(cadastrarConsulta(colMed, colPac));
			break;
		case 2:
			break;
		case 3:
			if(!colCons.ColVazia()){
				System.out.println("LISTAR CONSULTAS AGENDADAS: ");
				colCons.ListarConsultas();
				break;
			}
			System.err.println("Não existe consultas agendadas!");
			break;
		case 4:
			if(!colCons.ColVazia()){
				System.out.println("LISTAR CONSULTAS POR MÉDICO: ");
				System.out.print("Insira o nome do médico:");
				int qntConsultas = colCons.QntConsultasMedico(lerString());
				System.out.println(qntConsultas + " consulta(s) encontrada(s)");
				break;
			}
			System.err.println("Não existe consultas agendadas!");
			break;
		default:
			break;
		}
	}
	public static Paciente cadastrarPaciente(){
		Paciente p = new Paciente();
		System.out.println("ADICIONAR PACIENTE");
		System.out.print("Nome: ");
		p.setNome(lerString());
		System.out.print("Sexo: ");
		p.setSexo(lerSexo());
		System.out.print("CPF: ");
		p.setCPF(lerString());
		//System.out.print("Digite sua idade: ");
		p.setEnd(cadastrarEndereco());
		System.out.println("PACIENTE CADASTRADO COM SUCESSO!");
		return p;
	}
	public static Endereco cadastrarEndereco(){
		Endereco e = new Endereco();
		System.out.println("ADICIONAR ENDEREÇO:");
		System.out.print("Logradouro: ");
		e.setLogradouro(lerString());
		System.out.print("Número: ");
		e.setNumero(lerString());
		System.out.print("Bairro: ");
		e.setBairro(lerString());
		System.out.print("Complemento: ");
		e.setComplemento(lerString());
		System.out.print("CEP: ");
		e.setCEP(lerString());
		return e;
	}
	public static Medico cadastrarMedico(){
		Medico m = new Medico();
		System.out.println("ADICIONAR MÉDICO:");
		System.out.print("Nome: ");
		m.setNome(lerString());
		System.out.print("CRM: ");
		m.setCRM(lerString());
		System.out.print("Especialidade: ");
		m.setEspecialidade(lerString());
		System.out.println("MÉDICO CADASTRADO COM SUCESSO!");
		return m;
	}
	public static Consulta cadastrarConsulta(CollectionMedicos colMed, CollectionPacientes colPac){
		Consulta c = new Consulta();
		System.out.println("ADICIONAR CONSULTA:");
		if(colPac.ColVazia()){
			c.setPaciente(cadastrarPaciente());
		}else {
			colPac.ListarPacientes();
			System.out.print("Insira o CPF do paciente: ");
			String CPFTemp = lerString();
			while(!(colPac.PacienteExiste(CPFTemp))){
				System.err.println("Paciente não cadastrado!");
				System.out.println("Insira o CPF do paciente: ");
				CPFTemp = lerString();
			}
			c.setPaciente(colPac.BuscarPacienteCPF(CPFTemp));			
		}
		if(colMed.ColVazia()){
			c.setMedico(cadastrarMedico());
		}else {
			colMed.ListarMedicos();
			System.out.print("Insira o CRM do Médico: ");
			String CRMTemp = lerString();
			while(!(colMed.MedicoExiste(CRMTemp))){
				System.err.println("Médico não cadastrado!");
				System.out.println("Insira o CRM do médico: ");
				CRMTemp = lerString();
			}
			c.setMedico(colMed.BuscarMedicoCRM(lerString()));
		}
		System.out.println(c.toString());
		System.out.println("CONSULTA CADASTRADA COM SUCESSO!");
		return c;
	}
	public static String lerString(){
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextDouble() || sc.hasNextInt()){
			System.err.println("Entrada inválida!: ");
			sc.next();			
		}
		String strLida = sc.nextLine();
		
		return strLida;
	}
	public static String lerSexo(){
		
		Scanner sc = new Scanner(System.in);
		
		String sexo = sc.nextLine();
		sexo = sexo.toLowerCase();
		
		while(!(sexo.equals("f") || sexo.equals("m"))){
			System.err.println("Informe m ou f!");
			sexo = sc.nextLine();
			sexo = sexo.toLowerCase();
		}		
		return sexo;
	}
	/*
	public static String lerCpf(){
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextDouble() || sc.hasNextInt()){
			System.err.println("Digite o CPF corretamente!: ");
			sc.next();			
		}
		String cpf = sc.nextLine();
		
		return cpf;
	}
	*/
}
