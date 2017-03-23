/**
 * 
 */
package principal;

import java.io.IOException;

import sockets.Transmission;
import cadastro.Cadastro;
import colections.ColecaoAnimais;
import colections.ColecaoColaboradores;
import colections.ColecaoRegFinanceiros;

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

	public static void trataOpcaoMenu(int opcaoMenu, ColecaoAnimais colAnim, ColecaoColaboradores colColab, ColecaoRegFinanceiros colRegFin) throws IOException{
		int opSubMenu = 0;
		switch (opcaoMenu) {
		case 1:
			do{
				imprimirMenu("ANIMAIS", "ADICIONAR,QUANTITATIVO,BUSCA ANIMAL,QUANTIDADE P/SEXO,LISTAR ANIMAIS,LISTAR CAS_VERM_VAC,REMOÇÃO ANIMAL,MENU PRINCIPAL");
				opSubMenu = capturaMenu(8);
				trataMenuAnimais(opSubMenu,colAnim);
			}while(opSubMenu < 8);
			break;
		case 2:
			do{
				imprimirMenu("COLABORADOR","ADICIONAR,BUSCA COLABORADOR,PESQUISAR NOME,LISTAR VOLUNTÁRIOS,LISTAR TODOS,REMOÇÃO,MENU PRINCIPAL");
				opSubMenu = capturaMenu(7);
				trataMenuColab(opSubMenu,colColab);
			}while(opSubMenu < 7);
			break;
		case 3:
			do{
				imprimirMenu("REGISTRO FIANCEIRO","ADICIONAR,EXTRATO,SALDO,ENTRADAS,SAÍDAS,POR DATA,MENU PRINCIPAL");
				opSubMenu = capturaMenu(7);
				trataMenuRegFin(opSubMenu,colRegFin);
			}while(opSubMenu < 7);
			break;
		case 4:
			System.out.println("TRANSMITIR");
			Transmission.transmitirLog(colAnim.GerarLogAnimais());
			break;	
		case 5:
			System.out.println("SAINDO DO SISTEMA!");
			break;
		case 10:
			System.out.println("Cadastrando Animais, Colaboradores e Registros Financeiros.....");
			Auxiliar.preenchimentoAutomatico(colAnim, colColab, colRegFin);
			System.out.println("Animais, Colaboradores e Registros Financeiros cadastrados com sucesso!");
			break;
		default:
			break;
		}
	}

	public static void trataMenuAnimais(int opMenu, ColecaoAnimais colAnim){
		
		switch (opMenu) {
		case 1://Insere animais
			System.out.println("ADICIONAR ANIMAL - Digite C para Cachorro, ou G para Gato: ");
			colAnim.AdicionarAnimal(Cadastro.cadastrarAnimal());
			break;
		case 2://Exibe o quantitativo de animais cadastrados
			System.out.println("Quantitativo de animais do abrigo: ");
			colAnim.Quantitativo();
			break;
		case 3://Pesquisa animal pelo número do REGISTRO
			System.out.println("BUSCA ANIMAL - Informe o número do registro: ");
			try{
			System.out.println(colAnim.PesquisarAnimal(Auxiliar.lerInteiroToString()).toString());
			}catch (Exception e){
				System.err.println(e.getMessage());
			}
			break;
		case 4://Exibe os animais por sexo
			System.out.println("Informe o sexo que deseja buscar: ");
			colAnim.QuantPorSexo(Auxiliar.lerChar("f,FÊMEA","m,MACHO"));
			break;
		case 5://Exibe os animais por categoria ou todos
			System.out.println("LISTAR ANIMAL - Digite C para Cães, G para Gatos, ou T para Todos: ");
			colAnim.ExibirAnimais(Auxiliar.lerAnimal());
			break;	
		case 6://Exibe os animais Vacinado, Vermifugados e Castrados
			System.out.println("Listagem dos animais prontos para adoção");
			colAnim.ListarVaci_Cast_Verm();
			break;	
		case 7://Remove animal pelo número de REGISTRO
			System.out.println("REMOÇÃO ANIMAL - Informe o número do registro: ");
			try{
			colAnim.RemoverAnimal(colAnim.PesquisarAnimal(Auxiliar.lerInteiroToString()));
			}catch (Exception e){
				System.err.println(e.getMessage());
			}
			break;
		case 8:
			System.out.println("RETORNANDO AO MENU PRINCIPAL!");
			break;
			
		default:
			break;
		}
	}
	
	public static void trataMenuColab(int opMenu, ColecaoColaboradores colColab){
		
		switch (opMenu) {
		case 1://Adicionar colaborador
			System.out.println("ADICIONAR COLABORADOR - Digite V para Veterinário, ou S para Serviços Gerais: ");
			colColab.AdicionarColaborador(Cadastro.cadastrarColaborador());
			break;
		case 2:
			System.out.println("BUSCAR COLABORADOR - Informe o número do Documento: ");
			try{
				System.out.println(colColab.PesquisarColab(Auxiliar.lerInteiroToString().toString()));
				}catch (Exception e){
					System.err.println(e.getMessage());
				}
			break;
		case 3:
			System.out.println("PESQUISAR POR NOME - Informe o nome do colaborador: ");
			try{
				colColab.PesquisarNome(Auxiliar.lerString());
				}catch (Exception e){
					System.err.println(e.getMessage());
				}
			break;
		case 4:
			System.out.println("LISTAR VOLUNTÁRIOS: ");
			try{
				colColab.ExibirColVoluntarios();
				}catch (Exception e){
					System.err.println(e.getMessage());
				}
			break;
		case 5:
			System.out.println("LISTAR TODOS - Digite V para Veterinário, S para Serviços Gerais, ou T para TODOS:");
			try{
				colColab.ExibirColaboradores(Auxiliar.lerColab());
				}catch (Exception e){
					System.err.println(e.getMessage());
				}
			break;
		case 6:
			System.out.println("REMOÇÃO COLABORADOR - Informe o número do documento do colaborador: ");
			try{
				colColab.RemoverColaborador(colColab.PesquisarColab(Auxiliar.lerInteiroToString()));
				}catch (Exception e){
					System.err.println(e.getMessage());
				}
			break;
		case 7:
			System.out.println("RETORNANDO AO MENU PRINCIPAL!");
		default:
			break;
		}
	}
	
	public static void trataMenuRegFin(int opMenu, ColecaoRegFinanceiros colRegFin){
		
		switch (opMenu) {
		case 1:
			System.out.println("ADICIONAR REGISTRO:");
			colRegFin.AdicionarRegFin(Cadastro.cadastrarRegFinanceiro());
			break;
		case 2:
			System.out.println("EXTRATO:");
			colRegFin.ExibirExtrato();
			break;
		case 3:
			System.out.println("SALDO:");
			System.out.printf("%.2f",colRegFin.RetornarSaldo());
			break;
		case 4:
			System.out.println("ENTRADAS:");
			colRegFin.ExibirEntradas();
			break;
		case 5:
			System.out.println("SAÍDAS:");
			colRegFin.ExibirSaidas();
			break;
		case 6:
			
			break;
		case 7:
			System.out.println("RETORNANDO AO MENU PRINCIPAL!");
		default:
			break;
		}
	}

}
