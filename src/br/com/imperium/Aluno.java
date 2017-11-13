package br.com.imperium;

import java.util.List;

public class Aluno extends Pessoa {
	private int status;
	private int matricula;
	private List<ExameCorporal> exameCorporal;
	private List<Treino> treinoSemanal;
	private Instrutor instrutor;

	public void definirStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return this.status;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Instrutor getInstrutor() {
		return this.instrutor;
	}

	public void setProfessorResponsável(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public List<Treino> getTreinoSemanal() {
		return treinoSemanal;
	}

	public void setTreinoSemanal(List<Treino> treinoSemanal) {
		this.treinoSemanal = treinoSemanal;
	}

	public List<ExameCorporal> getExameCorporal() {
		return exameCorporal;
	}

	public void setExameCorporal(List<ExameCorporal> exameCorporal) {
		this.exameCorporal = exameCorporal;
	}

}
