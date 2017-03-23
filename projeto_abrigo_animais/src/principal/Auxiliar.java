/**
 * 
 */
package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import cadastro.*;

import pojo.*;
import colections.*;

/**
 * @author illoatayde
 *
 */
public class Auxiliar {

	static Scanner entradaTeclado = new Scanner(System.in);
	
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
	
	public static double lerDouble(){
		
		while(!entradaTeclado.hasNextDouble()){
			System.err.println("Entrada iválida!");
			entradaTeclado.nextLine();			
		}
		double doubleLido = entradaTeclado.nextDouble();
		entradaTeclado.nextLine();
		return doubleLido;
	}
	
	public static String lerS_N(){
		
		if(lerChar("s;SIM","n;NÃO").equals("s")){
			return "true";
		}
		return "false";
	}
	/**
	 * Método que recebe duas Strings e aguarda que seja digitado uma dentre as opções passadas.
	 * @param c1_op recebe uma String no formato "char;NOME" -> 'char' caractere a ser exibido como opção de digitação -> 'NOME' algo que represente a opção
	 * @param c2_op	recebe uma String no formato "char;NOME"
	 * @return uma String contendo um dos caracteres passados em "char" como parametro
	 */
	public static String lerChar(String c1_op, String c2_op){
		String[] c1 = c1_op.split(";");
		String[] c2 = c2_op.split(";");
		
		String c = entradaTeclado.nextLine();
		c = c.toLowerCase();
		
		while(!(c.equals(c1[0].toLowerCase()) || c.equals(c2[0].toLowerCase()))){
			System.err.printf("Informe %s para %s ou %s para %s!\n",c1[0],c1[1],c2[0],c2[1]);
			c = entradaTeclado.nextLine();
			c = c.toLowerCase();
		}
		return c;
		
	}
	
	public static String selecionarColab(){
		
		if(lerChar("v,VETERINÁRIO","s,SERVIÇOS GERAIS").equals("v")){
			return "vet";
		}
		return "serv_ger";
		
	}
	
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
	
	public static String lerColab(){
		String colab = entradaTeclado.nextLine();
		colab = colab.toLowerCase();
		
		while(!(colab.equals("v") || colab.equals("s") || colab.equals("t"))){
			System.err.println("Informe V para VETERINÁRIO, S para SERVIÇOS GERAIS ou T para TODOS!");
			colab = entradaTeclado.nextLine();
			colab = colab.toLowerCase();
		}
		return colab;
	}
	
	public static String lerInteiroToString(){
		
		while(!entradaTeclado.hasNextInt()){
			System.err.println("Entrada iválida!");
			entradaTeclado.nextLine();			
		}
		String intToStrLido = entradaTeclado.nextLine().toString();
		
		return intToStrLido;
	}
	
	public static LocalDate lerData(){//Data de entrada no formato dd/MM/aaaa
		LocalDate dataTemp = LocalDate.now();
		DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");
		try{
		dataTemp = LocalDate.parse(lerString(),dataFormato);
		}
		catch(java.time.format.DateTimeParseException e){
			System.err.printf("Data inválida!\nDigite uma data válida: ");
			lerData();
		}
		return dataTemp;
	}
	
	/**
	 * 
	 * @param colAnim
	 * @param colColab
	 * @param colRegFin
	 */
	
	public static void preenchimentoAutomatico(ColecaoAnimais colAnim, ColecaoColaboradores colColab, ColecaoRegFinanceiros colRegFin){
		colAnim.AdicionarAnimal(new Cachorro(Registro.GerarRegistroCachorro(),"Loba","f","mestiça","médio","farejador","dócil","22/02/2017","01/01/2000",new ProntuarioMedico(10, true, true, true, "saudável")));
		colAnim.AdicionarAnimal(new Cachorro(Registro.GerarRegistroCachorro(),"Totó","m","boxer","médio","farejador","dócil","22/01/2017","05/11/2010",new ProntuarioMedico()));
		colAnim.AdicionarAnimal(new Cachorro(Registro.GerarRegistroCachorro(),"Mustafá","m","mestiço","médio","farejador","dócil","22/03/2011","24/07/2009",new ProntuarioMedico()));
		colAnim.AdicionarAnimal(new Gato(Registro.GerarRegistroGato(),"Mequetref","m","mestiço","dócil",true,"22/05/2015","24/07/2009",new ProntuarioMedico(8, false, false, false, "doente")));
		colAnim.AdicionarAnimal(new Gato(Registro.GerarRegistroGato(),"Simbasa","f","mestiço","dócil",true,"22/07/2016","21/04/2012",new ProntuarioMedico()));
		colAnim.AdicionarAnimal(new Gato(Registro.GerarRegistroGato(),"Mequetref","m","mestiço","dócil",true,"22/11/2016","18/03/2016",new ProntuarioMedico(5, true, false, true, "saudável")));

		colColab.AdicionarColaborador(new Veterinario("333", "João Pessoa", "01/10/1969", true, new Endereco(), "155", "Clínico Geral"));
		colColab.AdicionarColaborador(new Veterinario("221", "Almeida Campus", "13/01/1975", false, new Endereco(), "425", "Clínico Geral"));
		colColab.AdicionarColaborador(new Veterinario("543", "Amélia Navarro", "05/02/1973", true, new Endereco(), "445", "Clínico Geral"));
		colColab.AdicionarColaborador(new Veterinario("679", "Pedro Santos Trigueiro", "30/05/1960", false, new Endereco(), "455", "Clínico Geral"));
		colColab.AdicionarColaborador(new Veterinario("298", "João Antônio Neto", "24/07/1980", true, new Endereco(), "400", "Clínico Geral"));
		colColab.AdicionarColaborador(new ServicosGerais("2210","Pedro Paulo Júnior","23/03/1998",false,new Endereco(),"Tosador"));
		colColab.AdicionarColaborador(new ServicosGerais("2321","Mariana Carla","23/03/1995",true,new Endereco(),"Tosador"));
		colColab.AdicionarColaborador(new ServicosGerais("1023","Carlos Timóteo Júnior","23/03/1990",false,new Endereco(),"Tosador"));
		colColab.AdicionarColaborador(new ServicosGerais("0987","Henrique Velasco Silva","23/03/2000",true,new Endereco(),"Tosador"));
		
		colRegFin.AdicionarRegFin(new RegFinanceiro("11/12/2000", 500.00, "Doação do Governo Federal"));
		colRegFin.AdicionarRegFin(new RegFinanceiro("01/01/2001", -100.00, "Compra de ração"));
		colRegFin.AdicionarRegFin(new RegFinanceiro("06/01/2001", -30.00, "Pagamento da conta de água"));
		colRegFin.AdicionarRegFin(new RegFinanceiro("11/01/2001", 60.00, "Doação do Município"));
		colRegFin.AdicionarRegFin(new RegFinanceiro("06/02/2001", -43.00, "Pagamento da conta de água"));
		colRegFin.AdicionarRegFin(new RegFinanceiro("11/12/2000", 500.00, "Doação do Governo Federal"));
		colRegFin.AdicionarRegFin(new RegFinanceiro("06/03/2001", -50.00, "Pagamento da conta de água"));
		colRegFin.AdicionarRegFin(new RegFinanceiro("11/12/2000", 500.00, "Doação do Governo Federal"));
		colRegFin.AdicionarRegFin(new RegFinanceiro("06/04/2001", -34.00, "Pagamento da conta de água"));
		colRegFin.AdicionarRegFin(new RegFinanceiro("11/12/2000", 500.00, "Doação do Governo Federal"));
		
	}
}
