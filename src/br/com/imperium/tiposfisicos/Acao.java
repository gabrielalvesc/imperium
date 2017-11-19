package br.com.imperium.tiposfisicos;

import java.util.List;

public class Acao {
	private FisicoStrategy fisicoStrategy;

	public Acao(FisicoStrategy fs) {
		this.fisicoStrategy = fs;

	}

	public List<String> actionFisico() {
		return fisicoStrategy.getTreinos();
	}

}
