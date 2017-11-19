package br.com.imperium.tiposfisicos;

import java.util.List;

import br.com.imperium.Exercicio;

public class Avançado implements TreinoIF {

	private List<Exercicio> exercicios;

	@Override
	public String treino() {

		return "Treino para Mesomorfo";
	}

	@Override
	public void excluirExercicio(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Exercicio> imprimirExercicios() {
		return this.exercicios;
	}

}
