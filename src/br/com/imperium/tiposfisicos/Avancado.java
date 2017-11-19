package br.com.imperium.tiposfisicos;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Avancado implements FisicoStrategy {

	private List<String> treinos;
	
	public Avancado() {
		this.treinos = recuperarTreinosEmArquivo();
	}

	@Override
	public String treino() {
		return "Treino para Mesomorfo";
	}

	@Override
	public List<String> recuperarTreinosEmArquivo(){
		List<String> var = new ArrayList<String>();
		Scanner br = null;
		try{
			br = new Scanner(new FileReader("TreinoAvancado.txt"));
			while(br.hasNextLine()) {
				String linha = br.nextLine();
				System.out.println(br.nextLine());
				var.add(linha);
				
			}	
		}catch(IOException exe) {
			exe.getMessage();
		}
		return var;

	}
	public List<String> getTreinos() {
		return this.treinos;
	}

	
}
