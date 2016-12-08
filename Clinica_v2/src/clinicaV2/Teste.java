package clinicaV2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Teste {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		int opMenu = 0;
		CollectionPacientes colPac = new CollectionPacientes();
		CollectionMedicos colMed = new CollectionMedicos();
		CollectionConsultas colCons = new CollectionConsultas();
		Auxiliar.imprimirTelaInicial();
		do{
			Auxiliar.imprimirMenu("MENU PRINCIPAL","PACIENTE,MÉDICO,CONSULTA,SAIR");
			opMenu = Auxiliar.capturaMenu(4);
			Auxiliar.trataOpcaoMenu(opMenu,colCons,colMed,colPac);
		}while(opMenu < 4);
	}
}
