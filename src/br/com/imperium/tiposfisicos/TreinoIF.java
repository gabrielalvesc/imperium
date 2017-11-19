package br.com.imperium.tiposfisicos;

import java.util.List;

import br.com.imperium.Exercicio;

public interface TreinoIF {
	
	public void excluirExercicio(int id);
	public List<Exercicio> imprimirExercicios();
	public String treino();

}
