package br.com.imperium;

import java.util.ArrayList;
import java.util.List;

public class AcademiaImperium implements IFImperium {
	private List<Aluno> alunos;
	private List<Instrutor> instrutores;

	public AcademiaImperium() {
		this.alunos = new ArrayList<Aluno>();
		this.instrutores = new ArrayList<Instrutor>();

	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public List<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(List<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public void matricularAluno(Aluno aluno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cadastrarInstrutor(Instrutor instrutor) {
		// TODO Auto-generated method stub

	}

}
