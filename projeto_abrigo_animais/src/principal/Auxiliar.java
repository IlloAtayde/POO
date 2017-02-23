/**
 * 
 */
package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import pojo.*;
import colections.*;

/**
 * @author illoatayde
 *
 */
public class Auxiliar {

	static Scanner entradaTeclado = new Scanner(System.in);
	
	public static void imprimirTelaInicial(){
		LocalDate hoje = LocalDate.now();
		System.out.printf("\tABRIGO DE ANIMAIS 0.1\n\t\t\t\t\t\t\t\t");
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
		int opMenu = lerInteiro();
		while(!(opMenu == 10 || (0 < opMenu && opMenu <= numOp))){
			System.err.printf("Digite um valor entre 1 e %d",numOp);
			opMenu = lerInteiro();
		}
		return opMenu;	
	}
	public static void trataOpcaoMenu(int opcaoMenu, ColecaoAnimais colAnim, ColecaoColaboradores colColab, ColecaoRegFinanceiros colRegFin){
		int opSubMenu = 0;
		switch (opcaoMenu) {
		case 1:
			do{
				imprimirMenu("ANIMAIS", "ADICIONAR,REMOVER,PESQUISAR REGISTRO,QUANTIDADE SEXO,LISTAR ANIMAIS,MENU PRINCIPAL");
				opSubMenu = capturaMenu(6);
				trataMenuAnimais(opSubMenu,colAnim);
			}while(opSubMenu < 6);
			break;
		case 2:
			do{
				imprimirMenu("COLABORADOR","ADICIONAR,PESQUISAR DOCUMENTO,PESQUISAR NOME,LISTAR,MENU PRINCIPAL");
				opSubMenu = capturaMenu(5);
				trataMenuColab(opSubMenu,colColab);
			}while(opSubMenu < 5);
			break;
		case 3:
			do{
				imprimirMenu("REGISTRO FIANCEIRO","ADICIONAR,REMOVER,LISTAR,SALDO,POR DATA,MENU PRINCIPAL");
				opSubMenu = capturaMenu(6);
				trataMenuRegFin(opSubMenu,colRegFin);
			}while(opSubMenu < 6);
			break;
		case 4:
			System.out.println("SAINDO DO SISTEMA!");
			break;
		case 10:
			System.out.println("Cadastrando Animais, Colaboradores e Registros Financeiros.....");
			preenchimentoAnimColRegFinAutomatico(colAnim, colColab, colRegFin);
			System.out.println("Animais, Colaboradores e Registros Financeiros cadastrados com sucesso!");
			break;
		default:
			break;
		}
	}
	public static void trataMenuAnimais(int opMenu, ColecaoAnimais colAnim){
		
		switch (opMenu) {
		case 1:
			System.out.println("Informe C para Cachorro ou G para Gato ");
			colAnim.AdicionarAnimal(cadastrarAnimal(lerAnimal()));
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			System.out.println("Informe C para Cães, G para Gatos ou T para Todos! ");
			colAnim.ExibirAnimais(lerAnimal());
			break;
		case 6:
			System.out.println("RETORNANDO AO MENU PRINCIPAL!");
			break;
		case 7:
			
		default:
			break;
		}
	}
	
	public static void trataMenuColab(int opMenu, ColecaoColaboradores colColab){
		
		switch (opMenu) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			System.out.println("RETORNANDO AO MENU PRINCIPAL!");
		default:
			break;
		}
	}
	
	public static void trataMenuRegFin(int opMenu, ColecaoRegFinanceiros colRegFin){
		
		switch (opMenu) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			System.out.println("RETORNANDO AO MENU PRINCIPAL!");
		default:
			break;
		}
	}
	
	public static Animal cadastrarAnimal(String c_ou_g){
		System.out.println("ADICIONAR ANIMAL");
		if(c_ou_g.equals("c")){
			Cachorro c = new Cachorro();
			System.out.print("REGISTRO: ");
			c.setRegistro(lerInteiroToString());
			System.out.print("Nome: ");
			c.setNome(lerString());
			System.out.println("Porte: ");
			c.setPorte(lerString());
			System.out.print("Sexo: ");
			c.setSexo(lerSexo());
			System.out.println("Raça:");
			c.setRaca(lerString());
			System.out.print("Data de nascimento: ");
			c.setDataNascimento(lerData(lerString()));
			System.out.print("Data de chegada no abrigo: ");
			c.setDataChegada(lerData(lerString()));
			System.out.println("Comportamento:");
			c.setComportamento(lerString());
			System.out.println("Habilidades:");
			c.setHabilidades(lerString());
			System.out.println("CADASTRADO EFETUADO COM SUCESSO!");
			return c;
		}
		if(c_ou_g.equals("g")){
			Gato g = new Gato();
			System.out.print("REGISTRO: ");
			g.setRegistro(lerInteiroToString());
			System.out.print("Nome: ");
			g.setNome(lerString());
			System.out.print("Sexo: ");
			g.setSexo(lerSexo());
			System.out.println("Raça:");
			g.setRaca(lerString());
			System.out.print("Data de nascimento: ");
			g.setDataNascimento(lerData(lerString()));
			System.out.print("Data de chegada no abrigo: ");
			g.setDataChegada(lerData(lerString()));
			System.out.println("Comportamento:");
			g.setComportamento(lerString());
			System.out.println("Vomita bolas de pelo, S ou N?");
			g.setVomitaBoladePelos(lerS_N());
			System.out.println("CADASTRADO EFETUADO COM SUCESSO!");
			return g;
		}else{
			System.err.println("Tal opção não se aplica a esse menu!");
			return null;
		}
	}
	
	public static String lerString(){
		
		while(entradaTeclado.hasNextDouble() || entradaTeclado.hasNextInt()){
			System.err.println("Entrada inválida!: ");
			entradaTeclado.nextLine();			
		}
		String strLida = entradaTeclado.nextLine();
		
		return strLida;
	}
	
	public static int lerInteiro(){
		
		while(!entradaTeclado.hasNextInt()){
			System.err.println("Entrada iválida!");
			entradaTeclado.nextLine();			
		}
		int intLido = entradaTeclado.nextInt();
		entradaTeclado.nextLine();
		return intLido;
	}
	
	public static String lerSexo(){
		
		String sexo = entradaTeclado.nextLine();
		sexo = sexo.toLowerCase();
		
		while(!(sexo.equals("f") || sexo.equals("m"))){
			System.err.println("Informe m ou f!");
			sexo = entradaTeclado.nextLine();
			sexo = sexo.toLowerCase();
		}		
		return sexo;
	}
	
	public static boolean lerS_N(){
		
		String s_n = entradaTeclado.nextLine();
		s_n = s_n.toLowerCase();
		
		while(!(s_n.equals("s") || s_n.equals("n"))){
			System.err.println("Informe S para Sim ou N para Não!");
			s_n = entradaTeclado.nextLine();
			s_n = s_n.toLowerCase();
		}
		if(s_n.equals("s")){
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @return String contendo 'c', 'g' ou 'todos'
	 */
	public static String lerAnimal(){
		String animal = entradaTeclado.nextLine();
		animal = animal.toLowerCase();
		
		while(!(animal.equals("c") || animal.equals("g") || animal.equals("t"))){
			System.err.println("Informe C para CACHORRO, G para GATO ou T para TODOS!");
			animal = entradaTeclado.nextLine();
			animal = animal.toLowerCase();
		}
		return animal;
	}
	
	public static String lerInteiroToString(){
		
		while(!entradaTeclado.hasNextInt()){
			System.err.println("Entrada iválida!");
			entradaTeclado.nextLine();			
		}
		String intToStrLido = entradaTeclado.nextLine().toString();
		
		return intToStrLido;
	}
	
	public static LocalDate lerData(String dataStr){//Data de entrada no formato dd/MM/aaaa
		
		LocalDate dataTemp;
		DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");
		dataTemp = LocalDate.parse(dataStr,dataFormato);
		return dataTemp;
	}
	
	public static void preenchimentoAnimColRegFinAutomatico(ColecaoAnimais colAnim, ColecaoColaboradores colColab, ColecaoRegFinanceiros colRegFin){
		colAnim.AdicionarAnimal(new Cachorro("123","Loba","f","mestiça","médio","farejador","dócil","22/02/2017","01/01/2000",new ProntuarioMedico(10, false, false, false, "saudável")));
		colAnim.AdicionarAnimal(new Cachorro("124","Totó","m","boxer","médio","farejador","dócil","22/01/2017","05/11/2010",new ProntuarioMedico()));
		colAnim.AdicionarAnimal(new Cachorro("125","Mustafá","m","mestiço","médio","farejador","dócil","22/03/2011","24/07/2009",new ProntuarioMedico()));
		colAnim.AdicionarAnimal(new Gato("122","Mequetref","m","mestiço","dócil",true,"22/05/2015","24/07/2009",new ProntuarioMedico()));
		colAnim.AdicionarAnimal(new Cachorro());
		colAnim.AdicionarAnimal(new Gato("122","Simbasa","f","mestiço","dócil",true,"22/07/2016","21/04/2012",new ProntuarioMedico()));
		colAnim.AdicionarAnimal(new Cachorro());
		colAnim.AdicionarAnimal(new Gato("122","Mequetref","m","mestiço","dócil",true,"22/11/2016","18/03/2016",new ProntuarioMedico()));
		
	}
}
