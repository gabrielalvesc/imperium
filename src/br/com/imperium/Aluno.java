package br.com.imperium;


import java.util.List;

public class Aluno extends Pessoa implements Observer{
	private int status;
	private int matricula;
	private List<ExameCorporal> exameCorporal;
	private List<Treino> treinoSemanal;
	private Instrutor instrutor;
	private TreinamentoDaSemana treinoMatriculado;
	private Treino treino;

	public Aluno(){
	
	}
	
	
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

	public void setProfessorResponavel(Instrutor instrutor) {
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


	@Override
	public void setSubject(Subject subject) {
		this.treinoMatriculado = (TreinamentoDaSemana) subject;
		this.treino = treinoMatriculado.getTreino();
		treinoMatriculado.registerObserver(this);
	}
	
	public Subject getSubject(){
		return treinoMatriculado;
	}
	
	public void removeSubject(){
		treinoMatriculado.removeObserver(this);
	}

	@Override
	public void update(Object treino) {
		
		this.treino = (Treino)treino;
	}

	public Treino getTreino() {
		return treino;
	}

	public String toString() {
		return "Dados do aluno:\nNome: " + this.getNome() + " - Email: "
				+ this.getEmail() + " - Matricula: " + this.getMatricula()
				+"\n Treino: Dia: "+this.treino.getDia()+" - Exercicios: "+this.treino.toString();
	}

	

}
