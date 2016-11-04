package p2.exercicios;

import java.util.Scanner;

public class ClasseTeste {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			final int MAX_PESSOAS = 1;
			
			Pessoa p[] = new Pessoa[MAX_PESSOAS];
			
			Scanner sc = new Scanner(System.in);		
			
			for(int i = 0; i < MAX_PESSOAS; i++){
				
				p[i] = new Pessoa();

				System.out.println("Digite Nome: ");			
				p[i].setNome(sc.nextLine());
				System.out.println("Digite CPF: ");
				p[i].setCpf(sc.nextLine());
				System.out.println("Digite Genero: ");
				p[i].setGenero(sc.nextLine());
				System.out.println("Digite Idade: ");
				p[i].setIdade(sc.nextInt());
				sc.nextLine();
				System.out.println("Digite Telefone: ");
				p[i].setTelefone(sc.nextLine());
				
				Endereco end = new Endereco();
				
				p[i].setEndereco(end);
				
				//p[i].setEndereco(new Endereco());
				
				System.out.println("Digite o Logradouro: ");			
				end.setLogradouro(sc.nextLine());
				//p[i].getEndereco().setLogradouro(sc.nextLine());
				System.out.println("Digite o Número: ");
				end.setNumero(sc.nextLine());
				System.out.println("Digite o Complemento: ");
				end.setComplemento(sc.nextLine());
				System.out.println("Digite o Bairro: ");
				end.setBairro(sc.nextLine());
				System.out.println("Digite a Cidade: ");
				end.setCidade(sc.nextLine());
				System.out.println("Digite o Estado: ");
				end.setEstado(sc.nextLine());
				System.out.println("Digite o País: ");
				end.setPais(sc.nextLine());
				System.out.println("Digite o CEP: ");
				end.setCep(sc.nextLine());
				

			}
			
			for(int i = 0; i < MAX_PESSOAS; i++){
				
				System.out.println(p[i].toString());
				//System.out.println(p[i].getEndereco().toString());
				Endereco end = new Endereco();
				end = p[i].getEndereco();
				System.out.println(end.toString());
			}
			
			sc.close();

		}

	}
