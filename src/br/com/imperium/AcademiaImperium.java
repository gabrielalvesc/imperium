package br.com.imperium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.imperium.exceptions.AlunoJaExisteException;
import br.com.imperium.exceptions.AlunoNaoExisteException;
import br.com.imperium.exceptions.InstrutorJaCadastradoException;
import br.com.imperium.exceptions.InstrutorNaoExisteException;

public class AcademiaImperium {
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
	public void removerAluno(int matricula){
		Iterator<Aluno> iter = this.alunos.iterator();

		while (iter.hasNext()) {
		    Aluno str = iter.next();

		    if (str.getMatricula() == matricula)
		        iter.remove();
		}
		
		
	}
	public void removerInstrutor(String cpf){
		Iterator<Instrutor> iter = this.instrutores.iterator();
		while (iter.hasNext()) {
		    Instrutor str = iter.next();

		    if (str.getCpf().equals(cpf))
		        iter.remove();
		}
		
	}

	public void setInstrutores(List<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public String pesquisarAluno(int matricula) throws AlunoNaoExisteException{
		for(Aluno al: this.alunos) {
			if(al.getMatricula() == matricula) {
				return al.toString();
			}
			throw new AlunoNaoExisteException("Esse aluno não existe.");
		}return null;
	}


	public void matricularAluno(Aluno aluno) throws AlunoJaExisteException{
		for(Aluno al: this.alunos) {
			if(al.getMatricula() == aluno.getMatricula()) {
				throw new AlunoJaExisteException("Aluno já cadastrado.");
			}
			this.alunos.add(aluno);
		}


	}

	
	public void cadastrarInstrutor(Instrutor instrutor) throws InstrutorJaCadastradoException{
		for(Instrutor i: this.instrutores) {
			if(i.getCpf() == instrutor.getCpf()) {
				throw new InstrutorJaCadastradoException("Instrutor já cadastrado.");
			}
			this.instrutores.add(instrutor);
		}
	}
	public String pesquisarIntsrutor(String cpf) throws InstrutorNaoExisteException{
		for(Instrutor i: this.instrutores) {		
			if(i.getCpf().equals(cpf)){
				return i.toString();
			}
				
	
			throw new InstrutorNaoExisteException("Esse instrutor não existe.");
		}return null;
	}

}
