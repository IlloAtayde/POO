package ex2;

import java.math.BigInteger;
import java.util.Scanner;

public class Teste {
	
	static Boolean opCadNovoPaciente, opSairCalc;
	static Calculadora calc = new Calculadora();
	static Scanner operandos = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		do{
			imprimirMenu();
			System.out.println(calc.toString());
			int opMenu = capturaMenu();
			trataOpcaoMenu(opMenu);
			System.out.printf("\nDeseja sair da calculadora?(s/n)");
			opSairCalc = validarMenu();
		}while(!opSairCalc);		
		
	}

	public static void imprimirMenu() {
		System.out.printf("\t\tCALCULADORA\n\n");
		System.out.println("1 – Soma.");
		System.out.println("2 – Subtração.");
		System.out.println("3 – Multiplicação.");
		System.out.println("4 – Divisão.");
		System.out.println("5 – Potenciação.");
		System.out.print("\nESCOLHA UMA OPERAÇÃO: \n");
		return;
	}
	public static int capturaMenu(){
		
		Scanner op = new Scanner(System.in);
		
		while(op.hasNextInt()){
			int opMenu = op.nextInt();
			if(0 < opMenu && opMenu <= 5){
				return opMenu;
			}
			System.err.println("Digite um valor entre 1 e 5");
		}
		System.err.println("Digite um valor entre 1 e 5");
		return capturaMenu();
	}
	public static Boolean validarMenu(){
		
		Scanner op = new Scanner(System.in);
		
		String validarStr = op.nextLine();
		validarStr = validarStr.toLowerCase();
		
		while(!(validarStr.equals("s") || validarStr.equals("n"))){
			System.err.println("Digite uma das opções: S ou N");
			validarStr = op.nextLine();
			validarStr = validarStr.toLowerCase();			
		}
		
		if(validarStr.equals("s")){
		return true;
		}
		return false;
	}
	public static void trataOpcaoMenu(int opcaoMenu){
		
		switch (opcaoMenu) {
		case 1:
			System.out.print("Digite um valor pra somar ao acumulador: ");
			trataEntrada();
			calc.Somar(operandos.nextBigInteger());
			System.out.print(calc.toString());
			break;
		case 2:
			System.out.print("Digite um valor pra subtrair do acumulador: ");
			trataEntrada();
			calc.Subtrair(operandos.nextBigInteger());
			System.out.print(calc.toString());
			break;
		case 3:
			System.out.print("Digite um valor pra multiplicar o acumulador: ");
			trataEntrada();
			calc.Multiplicar(operandos.nextBigInteger());
			System.out.print(calc.toString());
			break;
		case 4:
			BigInteger temp;
			do{
				System.out.print("Digite um valor (diferente de ZERO) pra dividir o acumulador: ");
				trataEntrada();
				temp = operandos.nextBigInteger();
			}while(temp.equals(BigInteger.ZERO));
			calc.Dividir(temp);
			System.out.print(calc.toString());
			break;
		case 5:
			int exp;
			do{
				System.out.print("Digite um valor (maior igual a ZERO) pra ser o expoente do acumulador: ");
				trataEntrada();
				exp = operandos.nextInt();
			}while(exp < 0);
			calc.Potenciacao(exp);
			System.out.print(calc.toString());
			break;	
		default:
			break;
		}
	}
	public static void  trataEntrada() {
		while(!operandos.hasNextBigInteger()){
			System.err.println("Digite um valor válido! ");
			operandos.next();			
		}
	}

}
