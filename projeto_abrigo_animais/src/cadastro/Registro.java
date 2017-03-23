package cadastro;

import java.time.LocalDate;


public class Registro {	
	
	//private int iDC = 0;
	//private int iDG = 0;
	
	/*public Registro(int iDC, int iDG) {
		this.iDC = iDC;
		this.iDG = iDG;
	}*/

	public static String GerarRegistroCachorro(int iDC){
		iDC++;
		int ano = LocalDate.now().getYear();
		int mes = LocalDate.now().getMonthValue();
		String resCachorro = String.valueOf(ano)+String.valueOf(mes)+"DOG"+String.valueOf(iDC);
		return resCachorro;
	}
	
	public static String GerarRegistroGato(int iDG){
		iDG++;
		int ano = LocalDate.now().getYear();
		int mes = LocalDate.now().getMonthValue();
	
		String resGato = String.valueOf(ano)+String.valueOf(mes)+"CAT"+String.valueOf(iDG);
		return resGato;
	}	
}


