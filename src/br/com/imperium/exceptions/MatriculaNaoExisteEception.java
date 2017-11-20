package br.com.imperium.exceptions;

public class MatriculaNaoExisteEception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MatriculaNaoExisteEception (String erro){
		super(erro);
	}

}
