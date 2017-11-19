package br.com.imperium.tiposfisicos;

public class Teste {

	public static void main(String[] args) {
		Acao a = new Acao(new Avancado());
		System.out.println(a.actionFisico());
		for(String s: a.actionFisico()) {
			System.out.println(s);
		}
		
		

	}

}
