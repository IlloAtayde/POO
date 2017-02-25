/**
 * 
 */
package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import colections.*;


/**
 * @author illoatayde
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opMenu = 0;
		ColecaoAnimais colAnim = new ColecaoAnimais();
		ColecaoColaboradores colColab = new ColecaoColaboradores();
		ColecaoRegFinanceiros colRegFin = new ColecaoRegFinanceiros();
		LocalDate hoje = LocalDate.now();
		String data = hoje.format(DateTimeFormatter.ofPattern("EEEE',' dd 'de' MMMM 'de' uuuu"));
		System.out.printf("%s\n\n",data);
		System.out.printf("\tABRIGO DE ANIMAIS 0.1\n\n");
		
		do{
			Menu.imprimirMenu("MENU PRINCIPAL","ANIMAL,COLABORADOR,REGISTRO FINANCEIRO,SAIR");
			opMenu = Menu.capturaMenu(4);
			Menu.trataOpcaoMenu(opMenu, colAnim, colColab, colRegFin);
		}while(opMenu < 4 || opMenu == 10);

	}

}
