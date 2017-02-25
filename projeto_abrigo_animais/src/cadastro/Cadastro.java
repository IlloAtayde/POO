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

	public static Animal cadastrarAnimal(Animal a){
		
		//System.out.println("ADICIONAR ANIMAL");
		System.out.print("REGISTRO: ");
		a.setRegistro(Auxiliar.lerInteiroToString());
		System.out.print("Nome: ");
		a.setNome(Auxiliar.lerString());
		System.out.print("Sexo: ");
		a.setSexo(Auxiliar.lerSexo());
		System.out.println("Raça:");
		a.setRaca(Auxiliar.lerString());
		System.out.print("Data de nascimento: ");
		a.setDataNascimento(Auxiliar.lerData());
		System.out.print("Data de chegada no abrigo: ");
		a.setDataChegada(Auxiliar.lerData());
		System.out.println("Comportamento:");
		a.setComportamento(Auxiliar.lerString());

		if(a instanceof Cachorro){
			Cachorro c = (Cachorro) a;
			System.out.println("Porte: ");
			c.setPorte(Auxiliar.lerString());
			System.out.println("Habilidades:");
			c.setHabilidades(Auxiliar.lerString());
			return c;
		}
		if(a instanceof Gato){
			Gato g = (Gato) a;
			System.out.println("Vomita bolas de pelo, S ou N?");
			g.setVomitaBoladePelos(Auxiliar.lerS_N());
			return g;
		}
		return a;
	}

	public static Colaborador cadastrarColaborador(Colaborador col) {
			
		System.out.println("Documento: ");
		col.setDocumento(Auxiliar.lerInteiroToString());
		System.out.println("Nome: ");
		col.setNome(Auxiliar.lerString());
		System.out.println("Data de nascimento: ");
		col.setDataNascimento(Auxiliar.lerData());
		System.out.println("Voluntário, S ou N?");
		col.setVoluntario(Auxiliar.lerS_N());
		System.out.println("Endereço: ");
		col.setEndereco(cadastrarEndereco());

		if(col instanceof Veterinario){
			Veterinario vet = (Veterinario) col;
			System.out.println("CRMV: ");
			vet.setCrmv(Auxiliar.lerInteiroToString());
			System.out.println("Especialidade:");
			vet.setEspecialidade(Auxiliar.lerString());
			return vet;
		}
		if(col instanceof ServicosGerais){
			ServicosGerais serGer = (ServicosGerais) col;
			System.out.println("Atividade: ");
			serGer.setAtividade(Auxiliar.lerString());
			return serGer;
		}
		return col;
	}

	public static RegFinanceiro cadastrarRegFinanceiro(){
		RegFinanceiro regFin = new RegFinanceiro();
		System.out.println("Insira a data:");
		regFin.setData(Auxiliar.lerData());
		System.out.println("Insira o valor:");
		regFin.setValor(Auxiliar.lerDouble());
		System.out.println("Insira a descrição:");
		regFin.setDescricao(Auxiliar.lerString());
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
