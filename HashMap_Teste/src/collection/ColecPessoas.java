package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import pojo.Pessoa;

public class ColecPessoas {
	
	private Map<String,Pessoa> ColPessoas;
	private int chave;

	public ColecPessoas() {
		ColPessoas = new HashMap<String,Pessoa>();
		chave = 0;
	}
	
	public void AdicionarPessoa(Pessoa p1){
		this.chave++;
		ColPessoas.put("a"+this.chave, p1);
	}
	public void RemoverPessoa(String chave){
		ColPessoas.remove(chave);
	}
	
	public Set<String> getKeySet(){
		return ColPessoas.keySet();
	}
	
	public Pessoa getPessoa(String chave){
		return ColPessoas.get(chave);
	}
	
	public void ListarPessoas(){
		for (String chave : ColPessoas.keySet()) {
			System.out.println(chave + " " + ColPessoas.get(chave));			
		}
	}
	public void BuscarPessoa(String nome){
		for (String chave : ColPessoas.keySet()){
			if(ColPessoas.get(chave).getNome().contains(nome)){
				System.out.println(ColPessoas.get(chave));
			}
		}
	}

}
