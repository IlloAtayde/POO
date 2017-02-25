package colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.RegFinanceiro;

public class ColecaoRegFinanceiros {
	
	private List<RegFinanceiro> ColRegFinanceiro;

	public ColecaoRegFinanceiros() {
		ColRegFinanceiro = new ArrayList<RegFinanceiro>();
	}
	public void AdicionarRegFin(RegFinanceiro regFin){
		ColRegFinanceiro.add(regFin);
	}
	public void RemoverRegFin(RegFinanceiro regFin) {
		ColRegFinanceiro.remove(regFin);
	}
	public double RetornarSaldo(){
		double saldo = 0.00;
		Iterator<RegFinanceiro> itRegFin = ColRegFinanceiro.iterator();
		while(itRegFin.hasNext()){
			RegFinanceiro regFinTemp = itRegFin.next();
			saldo += regFinTemp.getValor();
		}
		return saldo;
	}
	public void ExibirExtrato(){
		Iterator<RegFinanceiro> itRegFin = ColRegFinanceiro.iterator();
		while(itRegFin.hasNext()){
			RegFinanceiro regFinTemp = itRegFin.next();
			System.out.println(regFinTemp.toString());
		}
		System.out.printf("Saldo Total: %.2f\n",RetornarSaldo());
	}
	
	public void ExibirEntradas(){
		Iterator<RegFinanceiro> itRegFin = ColRegFinanceiro.iterator();
		double saldoTemp = 0;
		while(itRegFin.hasNext()){
			RegFinanceiro regFinTemp = itRegFin.next();
			if(regFinTemp.getValor() > 0.00){
				saldoTemp += regFinTemp.getValor();
				System.out.println(regFinTemp.toString());
			}
			
		}
		System.out.printf("Total de entradas: %.2f\n",saldoTemp);
	}
	
	public void ExibirSaidas(){
		Iterator<RegFinanceiro> itRegFin = ColRegFinanceiro.iterator();
		double saldoTemp = 0;
		while(itRegFin.hasNext()){
			RegFinanceiro regFinTemp = itRegFin.next();
			if(regFinTemp.getValor() < 0.00){
				saldoTemp += regFinTemp.getValor();
				System.out.println(regFinTemp.toString());
			}
			
		}
		System.out.printf("Total de saídas: %.2f\n",saldoTemp);
	}
}
