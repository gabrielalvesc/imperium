package br.com.imperium.tiposfisicos;

import java.util.ArrayList;
import java.util.List;

import br.com.imperium.Treino;

public class Iniciante implements FisicoStrategy {
	private int id;
	private String descricao;
	private List <Treino> treinos;

	@Override
	public String treino() {
		return "Treino para Ectomorfo";
	}
	
	public List <Treino> getTreinos(){
		List <Treino> treinos = new ArrayList<Treino>();
		Treino t = new Treino();
		
	}
	
	
	
}
