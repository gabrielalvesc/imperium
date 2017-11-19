package br.com.imperium.tiposfisicos;

import java.util.List;

import br.com.imperium.Treino;

public class Iniciante implements FisicoStrategy {

	@Override
	public String treino() {
		return "Treino para Ectomorfo";
	}



	@Override
	public List<String> recuperarTreinosEmArquivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getTreinos() {
		// TODO Auto-generated method stub
		return null;
	}

}
