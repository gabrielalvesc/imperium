package br.com.imperium.exceptions;

public class AlunoNaoExisteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AlunoNaoExisteException(String erro){
		super(erro);
	}

}
