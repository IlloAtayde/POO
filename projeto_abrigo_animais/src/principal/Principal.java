/**
 * 
 */
package principal;

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
		Auxiliar.imprimirTelaInicial();
		do{
			Auxiliar.imprimirMenu("MENU PRINCIPAL","ANIMAL,COLABORADOR,REGISTRO FINANCEIRO,SAIR");
			opMenu = Auxiliar.capturaMenu(4);
			Auxiliar.trataOpcaoMenu(opMenu, colAnim, colColab, colRegFin);
		}while(opMenu < 4 || opMenu == 10);

	}

}
