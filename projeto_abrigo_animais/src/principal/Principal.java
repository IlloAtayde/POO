/**
 * 
 */
package principal;

import java.io.FileNotFoundException;
import java.io.IOException;
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
		try{
		colAnim.RecuperarColAnimais("arqColAnimais");
		colColab.RecuperarColColaboradores("arqColColab");
		colRegFin.RecuperarColRegFin("arqColRegFin");
		}catch(Exception e){
		}
		LocalDate hoje = LocalDate.now();
		String data = hoje.format(DateTimeFormatter.ofPattern("EEEE',' dd 'de' MMMM 'de' uuuu"));
		System.out.printf("%s\n\n",data);
		System.out.printf("\tABRIGO DE ANIMAIS 0.1\n\n");
		
		do{
			Menu.imprimirMenu("MENU PRINCIPAL","ANIMAL,COLABORADOR,REGISTRO FINANCEIRO,TRANSMITIR,SAIR");
			opMenu = Menu.capturaMenu(5);
			try{
			Menu.trataOpcaoMenu(opMenu, colAnim, colColab, colRegFin);
			}catch (Exception e){
				System.err.println(e);
			}
		}while(opMenu < 5 || opMenu == 10);
		
		try{
			colAnim.SalvarColAnimais("arqColAnimais");
			colColab.SalvarColColaboradores("arqColColab");
			colRegFin.SalvarColRegFin("arqRegFin");
			System.err.println("Arquivos de Backup salvos com sucesso!");
		}catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado.");
		}catch (IOException e){
			System.err.println("Erro de leitura/escrita no arquivo.");
		}

	}

}
