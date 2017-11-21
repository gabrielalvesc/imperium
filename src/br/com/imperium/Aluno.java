package br.com.imperium;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	private String status;
	private int matricula;
	private List<ExameCorporal> exames;
	public Aluno(String nome, String dataDeNascimento, String dataDocadastro, String sexo, String cpf, Endereco endereco,
			String email, String telefone, String status, List<ExameCorporal> exameCorporal, List<Treino> treinoSemanal,
			Instrutor instrutor, Treino treino) {
		super(nome, dataDeNascimento, dataDocadastro, sexo, cpf, endereco, email, telefone);
		this.status = status;
		this.matricula = 0;
		this.exames = exameCorporal;
	}

	public Aluno() {
		super("", "", "", "","", new Endereco(), "", "");
		this.status = "";
		this.matricula = 0;
		this.exames = new ArrayList<ExameCorporal>();
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

	public List<ExameCorporal> getExameCorporal() {
		return exames;
	}

	public void setExameCorporal(List<ExameCorporal> exameCorporal) {
		this.exames = exameCorporal;
	}

	public void adicionarExame(ExameCorporal e) {
		this.exames.add(e);
	}

	public String toStringModeloArquivo() {
		String texto = getNome() + "#" + getDataDeNascimento() + "#" + getDataDocadastro() + "#" + getSexo() + "#"
				+ "#" + getEmail() + "#" + getTelefone()+"#"+getStatus()+"#"+getMatricula()+"#"+getCpf()+"#"+this.getEndereco().toString()+"#"+this.exames.size()+"#";
		for (ExameCorporal ec : this.exames) {
			texto += ec.toString() + "#";
		}

		return texto;
	}
	public String toString() {
		String texto = getNome() + "\n" + getDataDeNascimento() + "\n" + getDataDocadastro() + "\n" + getSexo() + "\n"
				+ "\n" + getEmail() + "\n" + getTelefone()+"\n"+getStatus()+"\n"+getMatricula()+"\n"+getCpf();

		return texto;
	}

}
