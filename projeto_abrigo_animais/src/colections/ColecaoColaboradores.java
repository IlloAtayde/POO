package colections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.Colaborador;
import pojo.ServicosGerais;
import pojo.Veterinario;
import streams.Arquivos;

public class ColecaoColaboradores {
	
	private List<Colaborador> ColColaborador;

	public ColecaoColaboradores() {
		
		ColColaborador = new ArrayList<Colaborador>();
	}
	public boolean AdicionarColaborador(Colaborador colaborador){
		if(ColColaborador.add(colaborador)){
			return true;
		}
		return false;
	}
	public void RemoverColaborador(Colaborador colaborador){
		ColColaborador.remove(colaborador);
	}
	public Boolean EstahVazia(){
		return ColColaborador.isEmpty();
	}
	/**
	 * Imprime relação dos colaboradores voluntários
	 *
	 */
	public void ExibirColVoluntarios() throws Exception{
		if(EstahVazia()){
			throw new Exception ("NÃO há nenhum colaborador cadastrado!");
		}
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while(itColab.hasNext()){
			Colaborador colabTemp = itColab.next();
			if(colabTemp.isVoluntario()){
				System.out.println(colabTemp.toString());
			}
		}
	}
	/**
	 * 
	 * @param idColab Lista colaboradores usando como referência o caracter passado por idColab
	 * v - para Veterinario
	 * s - para Serviços gerais
	 * t - para Todos
	 */
	public void ExibirColaboradores(String idColab) throws Exception{
		if(EstahVazia()){
			throw new Exception ("NÃO há nenhum colaborador cadastrado!");
		}
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while (itColab.hasNext()) {
			Colaborador colabTemp = itColab.next();
			if(!(idColab.equals("t"))){
				if ((colabTemp instanceof Veterinario) && (idColab.equals("v"))){
					Veterinario colabVet = (Veterinario) colabTemp;
					System.out.println(colabVet.toString());
				}
				if ((colabTemp instanceof ServicosGerais) && (idColab.equals("s"))){
					ServicosGerais colabServGer = (ServicosGerais) colabTemp;
					System.out.println(colabServGer.toString());
				}
			}else{
				System.out.println(colabTemp.toString());
			}
					
		}		
		
	}
	/**
	 * 
	 * @param doc
	 * @return Objeto Colaborador com documento doc coincidente
	 */
	public Colaborador PesquisarColab(String doc) throws Exception{
		if(EstahVazia()){
			throw new Exception ("NÃO há nenhum colaborador cadastrado!");
		}
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while (itColab.hasNext()){
			Colaborador colabTemp = itColab.next();
			if (!(colabTemp.getDocumento().equals(doc))){
				continue;
			}
			return colabTemp;
		}
		throw new Exception ("Registro NÃO encontrado!");
	}
	/**
	 * 
	 * @param nomeColab Exibe os colaboradores que contém nomeColab em seu nome
	 */
	public void PesquisarNome(String nomeColab) throws Exception{
		if(EstahVazia()){
			throw new Exception ("NÃO há nenhum colaborador cadastrado!");
		}
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while (itColab.hasNext()) {
			Colaborador colabTemp = itColab.next();
			String nomeTemp = colabTemp.getNome();
			if(nomeTemp.toLowerCase().contains(nomeColab.toLowerCase())){
				System.out.println(colabTemp.toString());
			}
		}
	}
	/*
	public void SalvarColaboradores(String nomeArq) throws IOException, FileNotFoundException{
		Iterator<Colaborador> itColab = ColColaborador.iterator();
		while (itColab.hasNext()){
			Colaborador colabTemp = itColab.next();
			Arquivos.SalvarObjArquivo(colabTemp, nomeArq);
		}			
	}
	*/
	
	public void SalvarColColaboradores(String nomeArq) throws IOException, FileNotFoundException{
		Arquivos.SalvarObjArquivo(ColColaborador, nomeArq);			
	}
	
	public void RecuperarColColaboradores(String nomeArq) throws IOException, FileNotFoundException, ClassNotFoundException{
		ColColaborador = (List<Colaborador>) Arquivos.RecuperarObjArquivo(nomeArq);
	}
	
}
