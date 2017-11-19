package br.com.imperium;


import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa implements Observer{
	private Status status;
	private int matricula;
	private List<ExameCorporal> exames;
	private List<Treino> treinoSemanal;
	private Instrutor instrutor;
	private TreinamentoDaSemana treinoMatriculado;
	private Treino treino;

	

	
	public Aluno(Status status, List<ExameCorporal> exameCorporal, List<Treino> treinoSemanal,
			Instrutor instrutor, TreinamentoDaSemana treinoMatriculado, Treino treino) {
		this.status = status;
		this.matricula = new AcademiaImperium().getAlunos().size() + 1;
		this.exames = exameCorporal;
		this.treinoSemanal = treinoSemanal;
		this.instrutor = instrutor;
		this.treinoMatriculado = treinoMatriculado;
		this.treino = treino;
	}

	public Aluno() {
		this.status = Status.ATIVO;
		this.matricula = new AcademiaImperium().getAlunos().size() + 1;
		this.exames = new ArrayList<ExameCorporal>();
		this.treinoSemanal = new ArrayList<Treino>();
	}

	public void definirStatus(Status status) {
		this.status = status;
	}

	public Status getStatus() {
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
		return exames;
	}

	public void setExameCorporal(List<ExameCorporal> exameCorporal) {
		this.exames = exameCorporal;
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
	
	public void adicionarExame(ExameCorporal e){
		this.exames.add(e);
	}

	

}
