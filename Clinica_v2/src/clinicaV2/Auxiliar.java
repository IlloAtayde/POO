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
				trataMenuConsulta(opSubMenu,colCons);
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
			System.out.println("ADICIONAR PACIENTE: ");
			colPac.AdicionarPaciente(cadastrarPaciente());
			break;
		case 2:
			if(!colPac.ColVazia()){
				System.out.println("BUSCAR POR CPF: ");
				System.out.println("Digite o CPF do paciente: ");
				colPac.BuscarPacienteCPF(lerCpf());
				break;
			}
			System.err.println("Não existe nenhum paciente cadastrado!");
			break;
		case 3:
			if(!colPac.ColVazia()){
				System.out.println("REMOVER POR CPF: ");
				System.out.println("Digite o CPF do paciente: ");
				colPac.RemoverPacienteCPF(lerCpf());
				break;
			}
			System.err.println("Não existe nenhum paciente cadastrado!");
			break;
		case 4:
			if(!colPac.ColVazia()){
				System.out.println("QUANTIDADE POR SEXO: ");
				System.out.println("Digite o SEXO do paciente: ");
				int qntSexo = colPac.QuantidadePorSexo(lerSexo());
				System.out.println("Número de pacientes do sexo solicitado: " + qntSexo);
				break;
			}
			System.err.println("Não existe nenhum paciente cadastrado!");
			break;
		case 5:
			if(!colPac.ColVazia()){
				System.out.println("LISTAR TODOS OS PACIENTES: ");
				colPac.ListarPacientesCompleto();
				break;
			}
			System.err.println("Não existe nenhum paciente cadastrado!");
			break;
		case 6:
			if(!colPac.ColVazia()){
				System.out.println("MAIORES DE SESSENTA ANOS: ");
				colPac.ListarPacientesMaioresdeSessenta();
				break;
			}
			System.err.println("Não existe nenhum paciente cadastrado!");
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
			System.out.println("ADICIONAR MÉDICO: ");
			colMed.AdicionarMedicos(cadastrarMedico());
			break;
		case 2:
			if(!colMed.ColVazia()){
				System.out.println("BUSCAR POR CRM: ");
				System.out.println("Digite o CRM do Médico: ");
				System.out.println(colMed.BuscarMedicoCRM(lerCpf()).toString());
				break;
			}
			System.err.println("Não existe nenhum médico cadastrado!");
			break;
		case 3:
			if(!colMed.ColVazia()){
				System.out.println("PESQUISAR POR NOME: ");
				System.out.println("DIGITE O NOME DO MÉDICO: ");
				colMed.BuscarMedicoNome(lerNome());
				break;
			}
			System.err.println("Não existe nenhum médico cadastrado!");
			break;
		case 4:
			if(!colMed.ColVazia()){
				System.out.println("LISTAR MÉDICOS: ");
				colMed.ListarMedicos();
				break;
			}
			System.err.println("Não existe nenhum médico cadastrado!");
			break;
		case 5:
			System.out.println("RETORNANDO AO MENU PRINCIPAL!");
		default:
			break;
		}
	}
	public static void trataMenuConsulta(int opMenu, CollectionConsultas colCons){
		
		switch (opMenu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}
	public static Paciente cadastrarPaciente(){
		Paciente p = new Paciente();
		System.out.print("Digite o nome do paciente: ");
		p.setNome(lerNome());
		System.out.print("Digite o sexo do paciente: ");
		p.setSexo(lerSexo());
		System.out.print("Digite o CPF do paciente: ");
		p.setCPF(lerCpf());
		//System.out.print("Digite sua idade: ");
		p.setEnd(cadastrarEndereco());
		return p;
	}
	public static Endereco cadastrarEndereco(){
		Endereco e = new Endereco();
		System.out.println("Digite o nome do logradouro: ");
		e.setLogradouro(lerNome());
		System.out.println("Digite o número: ");
		e.setNumero(lerNome());
		System.out.println("Digite o bairro: ");
		e.setBairro(lerNome());
		System.out.println("Digite o complemento: ");
		e.setComplemento(lerNome());
		System.out.println("Digite o CEP: ");
		e.setCEP(lerNome());
		return e;
	}
	public static Medico cadastrarMedico(){
		Medico m = new Medico();
		System.out.print("Digite o nome do Médico: ");
		m.setNome(lerNome());
		System.out.print("Digite o CRM: ");
		m.setCRM(lerCpf());
		System.out.print("Digite a especialidade: ");
		m.setEspecialidade(lerNome());
		return m;
	}
	public static String lerNome(){
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextDouble() || sc.hasNextInt()){
			System.err.println("Digite o nome corretamente!: ");
			sc.next();			
		}
		String nome = sc.nextLine();
		
		return nome;
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
	public static String lerCpf(){
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextDouble() || sc.hasNextInt()){
			System.err.println("Digite o CPF corretamente!: ");
			sc.next();			
		}
		String cpf = sc.nextLine();
		
		return cpf;
	}
}
