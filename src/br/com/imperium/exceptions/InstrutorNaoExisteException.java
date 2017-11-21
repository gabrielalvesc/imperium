package br.com.imperium.exceptions;

public class InstrutorNaoExisteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InstrutorNaoExisteException(String erro) {
		super(erro);
	}
}
