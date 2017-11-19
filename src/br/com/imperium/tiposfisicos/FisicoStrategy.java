package br.com.imperium.tiposfisicos;

import java.util.List;

public interface FisicoStrategy {
	
	public String treino();
	public List<String> recuperarTreinosEmArquivo();
	public List<String> getTreinos();	

}
