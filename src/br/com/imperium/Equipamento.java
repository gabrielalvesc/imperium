package br.com.imperium;

import java.util.List;

public class Equipamento {
	private String nome;
	private String descricao;
	private List<Exercicio> exerciciosSuportados;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Exercicio> getExerciciosSuportados() {
		return exerciciosSuportados;
	}
	public void setExerciciosSuportados(List<Exercicio> exerciciosSuportados) {
		this.exerciciosSuportados = exerciciosSuportados;
	}


}
