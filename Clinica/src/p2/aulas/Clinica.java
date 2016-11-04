package p2.aulas;

import java.util.Scanner;

public class Clinica {

	/**
	 * @param args
	 */
	//static Scanner sc = new Scanner(System.in);
	//static String validarStr;
	static final int MAX_REGISTROS = 100;
	static String nome[] = new String[MAX_REGISTROS];
	static String sexo[] = new String[MAX_REGISTROS];
	static int idade[] = new int[MAX_REGISTROS];
	static double[] valConsulta = new double[MAX_REGISTROS];
	static Boolean opCadNovoPaciente, opSairSistema;
	static int i = -1;
	
	public static void main(String[] args) {		
		
		imprimirTelaInicial();
		cadPaciente();
		do{
			imprimirMenu();
			int opMenu = capturaMenu();
			trataOpcaoMenu(opMenu);
			System.out.printf("\nDeseja sair do sistema?(s/n)");
			opSairSistema = validarMenu();
		}while(!opSairSistema);
		
		return;
	}
	
	public static void imprimirTelaInicial(){
		
		System.out.printf("\tCLÍNICA MÉDICA\n");
		System.out.println("\n\nINSIRA OS DADOS DOS PACIENTES\n\n");
	}
	
	public static void cadPaciente(){
		
		do{
			i++;
			System.out.print("Digite o seu nome: ");
			nome[i] = lerNome();
			System.out.print("Digite o seu sexo: ");
			sexo[i] = lerSexo();
			System.out.print("Digite sua idade: ");
			idade[i] = lerIdade();
			System.out.print("Digite o valor da consulta: ");
			valConsulta[i] = lerValConsulta();			
			System.out.print("Deseja cadastrar um novo Paciente?(s/n)");
			opCadNovoPaciente = validarMenu();
		}while(opCadNovoPaciente && i < MAX_REGISTROS-1);
		
		return;
		
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
	
	public static int lerIdade(){
		
		Scanner sc = new Scanner(System.in);
		
		while(!sc.hasNextInt()){
			System.err.println("Digite uma idade válida: ");
			sc.next();			
		}
		int idade = sc.nextInt();
		
		return idade;
	}
	
	public static double lerValConsulta(){
		
		Scanner sc = new Scanner(System.in);
			
		while(!sc.hasNextDouble()){
			System.err.println("Digite um valor válido: ");
			sc.next();			
		}
		double valConsulta = sc.nextDouble();
		
		return valConsulta;

	}
	
	public static Boolean validarMenu(){
		
		Scanner op = new Scanner(System.in);
		
		/**while(op.hasNextDouble() || op.hasNextInt()){
			System.err.println("Digite uma das opções: S ou N");
			op.next();			
		}*/
		String validarStr = op.nextLine();
		validarStr = validarStr.toLowerCase();
		//String strValida = op.nextLine();
		
		while(!(validarStr.equals("s") || validarStr.equals("n"))){
			System.err.println("Digite uma das opções: S ou N");
			validarStr = op.nextLine();
			validarStr = validarStr.toLowerCase();			
		}
		
		if(validarStr.equals("s")){
		return true;
		}
		return false;
	}
	
	public static void imprimirMenu() {
		System.out.printf("\tESCOLHA UMA DAS OPÇÕES ABAIXO:\n\n");
		System.out.println("1 – Imprimir na tela os dados armazenados.");
		System.out.println("2 – Imprimir a média do valor das consultas realizadas.");
		System.out.println("3 – Imprimir os dados das pessoas do sexo masculino.");
		System.out.println("4 – Imprimir o maior valor de consulta realizado por uma pessoa do sexo feminino.");
		return;
	}
	
	public static int capturaMenu(){
		
		Scanner op = new Scanner(System.in);
		
		/*while(!op.hasNextInt()){
			System.err.println("Digite uma opção válida: ");
			op.next();			
		}*/
		
		while(op.hasNextInt()){
			int opMenu = op.nextInt();
			if(0 < opMenu && opMenu <= 4){
				return opMenu;
			}
			System.err.println("Digite um valor entre 1 e 4");
		}
		System.err.println("Digite um valor entre 1 e 4");
		return capturaMenu();
		
		/*int opMenu = op.nextInt();
		
		while(opMenu <= 0 || opMenu > 4){
			System.err.println("Digite um valor entre 1 e 4");
			op.next();
			//return capturaMenu();
		}
		
		return opMenu;*/	
	}
	
	public static void trataOpcaoMenu(int opcaoMenu){
		
		switch (opcaoMenu) {
		case 1:
			for(int j = 0; j <= i; j++){
				System.out.printf("\tPaciente %d: %s\n\tSexo: %s\n\tIdade: %d\n\tConsulta valor R$ %5.2f\n\n",j+1,nome[j],sexo[j],idade[j],valConsulta[j]);
			}
			break;
		case 2:
			double total = 0;
			for(int j = 0; j <= i; j++){
				total = total + valConsulta[j];
			}
			double media = (total/(i+1));
			System.out.printf("Valor total das consultas R$ %5.2f - Valor médio R$ %5.2f",total,media);
			break;
		case 3:
			int ctrlFem = -1;
			for(int j = 0; j <= i; j++){
				if(sexo[j].equals("m")){
					System.out.printf("\tPaciente %d: %s\n\tSexo: %s\n\tIdade: %d\n\tConsulta valor R$ %5.2f\n\n",j+1,nome[j],sexo[j],idade[j],valConsulta[j]);
				}else{
					ctrlFem++; 
				}
			}
			if(ctrlFem - i == 0){
				System.err.printf("Não existe nenhum paciente do sexo masculino cadastrado");
			}
			break;
		case 4:
			int indMaxVal = -1, ctrlMasc = -1;
			double valMax = 0;
			for(int j = 0; j <= i; j++){
				if(sexo[j].equals("f")){
					if(valMax < valConsulta[j]){
						valMax = valConsulta[j];
						indMaxVal = j;
					}
				}else{
					ctrlMasc++; 
				}
			}
			if(ctrlMasc - i == 0){
				System.err.printf("Não existe nenhum paciente do sexo feminino cadastrado");
			}else{
				System.out.printf("\tPaciente %d: %s\n\tSexo: %s\n\tIdade: %d\n\tConsulta valor R$ %5.2f\n\n",indMaxVal+1,nome[indMaxVal],sexo[indMaxVal],idade[indMaxVal],valConsulta[indMaxVal]);
			}
			break;
		default:
			break;
		}
	}
}
