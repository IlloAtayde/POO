/**
 * 
 */
package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import pojo.Pessoa;

import collection.ColecPessoas;


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
	
	public static String lerInteiroToString(){
		
		while(!entradaTeclado.hasNextInt()){
			System.err.println("Entrada iválida!");
			entradaTeclado.nextLine();			
		}
		String intToStrLido = entradaTeclado.nextLine().toString();
		
		return intToStrLido;
	}
	
	public static void preenchimentoAutomatico( ColecPessoas colPessoa){
		colPessoa.AdicionarPessoa(new Pessoa("João",32,"m"));
		colPessoa.AdicionarPessoa(new Pessoa("Maria",25,"f"));
		colPessoa.AdicionarPessoa(new Pessoa("Cláudio",18,"m"));
		colPessoa.AdicionarPessoa(new Pessoa("Pedro",15,"m"));
		colPessoa.AdicionarPessoa(new Pessoa("Marcela",19,"f"));
		colPessoa.AdicionarPessoa(new Pessoa("Firmino",45,"m"));
		colPessoa.AdicionarPessoa(new Pessoa("Aparecida",27,"f"));
				
	}
}
