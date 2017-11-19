package br.com.imperium;

import java.util.ArrayList;
import java.util.List;

public class TreinamentoDaSemana implements Subject {

	private List<Aluno> alunosDaSemana;

	private Treino treino;

	public TreinamentoDaSemana(Treino treino) {
		this.treino = treino;
		this.alunosDaSemana = new ArrayList<Aluno>();
	}

	public void setTreino(Treino treino) {
		this.treino = treino;

		this.notifyObserver();
	}

	public String getAlunos() {
		String als = "";
		for (Aluno al : this.alunosDaSemana) {
			als += al.getNome() + "\n";
		}
		return als;

	}

	@Override
	public void registerObserver(Observer observer) {
		if (!alunosDaSemana.contains((Aluno) observer)) {
			alunosDaSemana.add((Aluno) observer);
		} else {
			System.out.println("Ja possui este aluno!");
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		for (Observer ob : alunosDaSemana) {
			if (ob.equals(observer)) {
				alunosDaSemana.remove(observer);
			}
		}

	}

	@Override
	public void notifyObserver() {
		System.out.println("Notificando os Alunos desta lista de treino!");
		for (Observer ob : alunosDaSemana) {
			ob.update(treino);
		}

	}

	public Treino getTreino() {

		return treino;
	}

	public String toString() {
		String lista = "";
		for (Aluno ob : alunosDaSemana) {
			lista += ob.toString();
		}
		return lista;
	}
}
