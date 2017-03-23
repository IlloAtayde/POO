package cadastro;

import java.time.LocalDate;


public class Registro {

	private static int IDC = 0;
	private static int IDG = 0;
	
	public static String GerarRegistroCachorro(){
		int ano = LocalDate.now().getYear();
		int mes = LocalDate.now().getMonthValue();
		IDC++;
		String resCachorro = String.valueOf(ano)+String.valueOf(mes)+"DOG"+String.valueOf(IDC);
		return resCachorro;
	}
	
	public static String GerarRegistroGato(){
		int ano = LocalDate.now().getYear();
		int mes = LocalDate.now().getMonthValue();
		IDG++;
		String resGato = String.valueOf(ano)+String.valueOf(mes)+"CAT"+String.valueOf(IDG);
		return resGato;
	}
}


