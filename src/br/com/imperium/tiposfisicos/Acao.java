package br.com.imperium.tiposfisicos;

public class Acao {
	private FisicoStrategy fisicoStrategy;

	public Acao(FisicoStrategy fs) {
		this.fisicoStrategy = fs;

	}

	public String actionFisico() {
		return fisicoStrategy.treino();
	}

}
