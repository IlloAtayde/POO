/**
 * 
 */
package principal;

import pojo.Pessoa;
import collection.ColecPessoas;


/**
 * @author illoatayde
 *
 */
public class Menu {

	/**
	 * 
	 */

	public static void imprimirMenu(String tituloMenu, String textoMenu) {
		String[] menuTemp = textoMenu.split(",");
		System.out.printf("\t%s\n",tituloMenu);
		System.out.printf("ESCOLHA UMA DAS OPÇÕES ABAIXO:\n\n");
		for(int i = 0; i < menuTemp.length;i++){
			System.out.printf("%d - %s\n", i+1, menuTemp[i]);
		}
	}	

	public static int capturaMenu(int numOp){
		int opMenu = Auxiliar.lerInteiro();
		while(!(opMenu == 10 || (0 < opMenu && opMenu <= numOp))){
			System.err.printf("Digite um valor entre 1 e %d",numOp);
			opMenu = Auxiliar.lerInteiro();
		}
		return opMenu;	
	}

	public static void trataOpcaoMenu(int opcaoMenu, ColecPessoas colPessoa){
		int opSubMenu = 0;
		switch (opcaoMenu) {
		case 1:
			do{
				imprimirMenu("PESSOAS", "ADICIONAR,BUSCAR,LISTAR,REMOVER,MENU PRINCIPAL");
				opSubMenu = capturaMenu(5);
				trataMenuPessoas(opSubMenu,colPessoa);
			}while(opSubMenu < 5);
			break;
		case 2:
			System.out.println("SAINDO DO SISTEMA!");
		case 10:
			Auxiliar.preenchimentoAutomatico(colPessoa);
		default:
			break;
		}
	}

	public static void trataMenuPessoas(int opMenu, ColecPessoas colPessoa){
		switch (opMenu) {
		case 1://ADICIONAR
			Pessoa p =new Pessoa(Auxiliar.lerString(), Auxiliar.lerInteiro(), Auxiliar.lerChar("f;Feminino", "m;Masculino"));
			colPessoa.AdicionarPessoa(p);
			break;
		case 2://BUSCA
			System.out.println("Digite o nome da pessoa");
			colPessoa.BuscarPessoa(Auxiliar.lerString());
			break;
		case 3://LISTAR
			colPessoa.ListarPessoas();
			/*for (String key : colPessoa.getKeySet()) {
                System.out.println(key + " " + colPessoa.getPessoa(key));
            }*/
			break;
		case 4://REMOVER
			colPessoa.ListarPessoas();
			colPessoa.RemoverPessoa(Auxiliar.lerString());
			break;				
		default:
			break;
		}
	}
}

