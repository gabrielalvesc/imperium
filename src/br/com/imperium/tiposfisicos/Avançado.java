package br.com.imperium.tiposfisicos;

import java.util.List;

import br.com.imperium.Dia;
import br.com.imperium.Exercicio;
import br.com.imperium.Treino;

public class Avançado implements TreinoIF{
	
	private List<Exercicio> exercicios;
	private String descricao;
	private List <Treino> treinos;

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
