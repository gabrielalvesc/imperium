package br.com.imperium;

import java.util.List;

import br.com.imperium.exceptions.AlunoNaoExisteException;

public class Instrutor extends Pessoa{
	private List<Aluno> alunos;

	public int getQuantidadeDeAlunios() {
		return alunos.size();
	}

	public Aluno getAluno(int matricula) throws Exception {
		for (Aluno a : this.alunos) {
			if (a.getMatricula() == matricula) {
				return a;
			}
		}
		throw new AlunoNaoExisteException("O aluno pesquisado não existe no sistema.");
	}


	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}


}
