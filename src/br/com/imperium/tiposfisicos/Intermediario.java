package br.com.imperium.tiposfisicos;

import java.util.List;

import br.com.imperium.Treino;

public class Intermediario implements FisicoStrategy{

	@Override
	public String treino() {
		// TODO Auto-generated method stub
		return "Treino para Endomorfo";
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
