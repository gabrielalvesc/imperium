package br.com.imperium.exceptions;

public class AlunoJaExisteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AlunoJaExisteException (String erro){
		super(erro);
	}

}
