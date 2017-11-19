package br.com.imperium;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Aluno extends Pessoa {
	private String status;
	private int matricula;
	private List<ExameCorporal> exames;
	private List<Treino> treinoSemanal;
	private Instrutor instrutor;


	public Aluno(String nome, Calendar dataDeNascimento, Calendar dataDocadastro, String sexo, Endereco endereco,
			String email, String telefone, String status, List<ExameCorporal> exameCorporal, List<Treino> treinoSemanal,
			Instrutor instrutor, Treino treino) {
		super(nome, dataDeNascimento, dataDocadastro, sexo, endereco, email, telefone);
		this.status = status;
		this.matricula = new AcademiaImperium().getAlunos().size() + 1;
		this.exames = exameCorporal;
		this.treinoSemanal = treinoSemanal;
		this.instrutor = instrutor;
	}

	public Aluno() {
		super("", Calendar.getInstance(), Calendar.getInstance(), "", new Endereco(), "", "");
		this.status = "";
		this.matricula = new AcademiaImperium().getAlunos().size() + 1;
		this.exames = new ArrayList<ExameCorporal>();
		this.treinoSemanal = new ArrayList<Treino>();
		this.instrutor = new Instrutor();
	}

	public void definirStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
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


	public void adicionarExame(ExameCorporal e) {
		this.exames.add(e);
	}

}
