package cadastro;

import pojo.Animal;
import pojo.Cachorro;
import pojo.Colaborador;
import pojo.Endereco;
import pojo.Gato;
import pojo.RegFinanceiro;
import pojo.ServicosGerais;
import pojo.Veterinario;
import principal.Auxiliar;

public class Cadastro {

	public static Animal cadastrarAnimal(int iDC, int iDG){
		
		String cad_animal_generico,cad_estado_saude,cad_gato,cad_cao,animal;
		
		System.out.println("Informe o animal a ser cadastrado: ");
		
		if(Auxiliar.lerChar("c;CÃO", "g;GATO").equals("c")){
			animal = "c";
			}else{
				animal = "g";			
		}
		
		System.out.println("Nome: ");
		cad_animal_generico = Auxiliar.lerString() + ";";
		System.out.println("Sexo: ");
		cad_animal_generico += Auxiliar.lerChar("f;FÊMEA","m;MACHO") + ";";
		System.out.println("Raça:");
		cad_animal_generico += Auxiliar.lerString() + ";";
		System.out.println("Data de nascimento: ");
		cad_animal_generico += Auxiliar.lerData() + ";";
		System.out.println("Data de chegada no abrigo: ");
		cad_animal_generico += Auxiliar.lerData() + ";";
		System.out.println("Comportamento:");
		cad_animal_generico += Auxiliar.lerString() + ";";

		System.out.println("Inserir abaixo dados relativos ao estado de saúde do animal");
		System.out.println("Peso: ");
		cad_estado_saude = String.valueOf(Auxiliar.lerDouble()) + ";";
		System.out.println("Castrado(S/N)?");
		cad_estado_saude += Auxiliar.lerS_N() + ";";
		System.out.println("Vermifugado(S/N)?");
		cad_estado_saude += Auxiliar.lerS_N() + ";";
		System.out.println("Vacinado(S/N)?");
		cad_estado_saude += Auxiliar.lerS_N() + ";";
		System.out.println("Informe resumidamente o estado geral do animal:");
		cad_estado_saude += Auxiliar.lerString();
		
		switch (animal) {
		case "c":
			cad_animal_generico += Registro.GerarRegistroCachorro(iDC);
			System.out.println("Porte do CÃO: ");
			cad_cao = Auxiliar.lerString() + ";";
			System.out.println("Habilidades: ");
			cad_cao += Auxiliar.lerString();
			Cachorro c = new Cachorro(cad_animal_generico,cad_estado_saude,cad_cao);
			
			return c;
		case "g":
			cad_animal_generico += Registro.GerarRegistroGato(iDG);
			System.out.println("Informe se o GATO vomita bolas de pelos: ");
			cad_gato = Auxiliar.lerS_N();
			Gato g = new Gato(cad_animal_generico,cad_estado_saude,cad_gato);
			return g;
		}
		
		return null;
	}
	
	public static Colaborador cadastrarColaborador() {
		
		String cad_colab_generico,cad_end,cad_vet,cad_ser_ger,colab;
		
		System.out.println("Informe o colaborador a ser cadastrado: ");
		
		if(Auxiliar.lerChar("v;VETERINÁRIO", "s;SERVIÇO GERAIS").equals("v")){
			colab = "v";
			}else{
				colab = "s";			
		}
		
		System.out.println("Documento: ");
		cad_colab_generico = Auxiliar.lerInteiroToString() + ";";
		System.out.println("Nome: ");
		cad_colab_generico += Auxiliar.lerString() + ";";
		System.out.println("Data de nascimento: ");
		cad_colab_generico += Auxiliar.lerData() + ";";
		System.out.println("Voluntário, S ou N?");
		cad_colab_generico += Auxiliar.lerS_N() + ";";
		System.out.println("Data de chegada: ");
		cad_colab_generico += Auxiliar.lerData() + ";";
		
		System.out.println("Inserir dados referente ao endereço.");
		System.out.println("CEP: ");
		cad_end = Auxiliar.lerInteiroToString() + ";";
		System.out.println("Logradouro: ");
		cad_end += Auxiliar.lerString() + ";";
		System.out.println("Número: ");
		cad_end += Auxiliar.lerInteiroToString() + ";";
		System.out.println("Bairro: ");
		cad_end += Auxiliar.lerString() + ";";
		System.out.println("Complemento: ");
		cad_end += Auxiliar.lerString();

		switch (colab) {
		case "v":
			System.out.println("Número do CRMV: ");
			cad_vet = Auxiliar.lerString() + ";";
			System.out.println("Especialidade: ");
			cad_vet += Auxiliar.lerString();
			Veterinario v = new Veterinario(cad_colab_generico,cad_end,cad_vet);
			return v;
		case "s":
			System.out.println("Informe a atividade a ser executada: ");
			cad_ser_ger = Auxiliar.lerString();
			ServicosGerais s = new ServicosGerais(cad_colab_generico,cad_end,cad_ser_ger);
			return s;
		}
		
		return null;
	}

	public static RegFinanceiro cadastrarRegFinanceiro(){
		
		String cad_reg_fin;
		int fator = 1;
		
		System.out.println("Informe E se ENTRADA, ou S se SAÍDA: ");
		if(Auxiliar.lerChar("E;ENTRADA","S;SAÍDA").equals("s")){
			fator = -1;
		}
		
		System.out.println("Insira a data:");
		cad_reg_fin = Auxiliar.lerData() + ";";
		System.out.println("Insira o valor:");
		cad_reg_fin += String.valueOf(Auxiliar.lerDouble()*fator) + ";";
		System.out.println("Insira a descrição:");
		cad_reg_fin += (Auxiliar.lerString());
		RegFinanceiro regFin = new RegFinanceiro(cad_reg_fin);
		return regFin;
	}
	
	public static Endereco cadastrarEndereco(){
		Endereco e = new Endereco();
		System.out.println("ADICIONAR ENDEREÇO:");
		System.out.print("Logradouro: ");
		e.setLogradouro(Auxiliar.lerString());
		System.out.print("Número: ");
		e.setNumero(Auxiliar.lerInteiroToString());
		System.out.print("Bairro: ");
		e.setBairro(Auxiliar.lerString());
		System.out.print("Complemento: ");
		e.setComplemento(Auxiliar.lerString());
		System.out.print("CEP: ");
		e.setCEP(Auxiliar.lerInteiroToString());
		return e;		
	}
}
