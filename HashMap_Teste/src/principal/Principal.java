package principal;

import collection.ColecPessoas;

public class Principal {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColecPessoas colPessoa = new ColecPessoas();
		int opMenu = 0;
		do{
			Menu.imprimirMenu("MENU PRINCIPAL","PESSOA,SAIR");
			opMenu = Menu.capturaMenu(2);
			Menu.trataOpcaoMenu(opMenu, colPessoa);
		}while(opMenu < 2 || opMenu == 10);

	}

}
