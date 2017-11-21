package br.com.imperium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Persistencia {
	public void persisteAlunos(List<Aluno> alunos, String nomeArquivo) throws IOException {
		BufferedWriter gravador = null;
		try {
			gravador = new BufferedWriter(new FileWriter(nomeArquivo));
			for (Aluno a : alunos) {
				gravador.write(a.toStringModeloArquivo() + "\n");
			}
		} finally {
			if (gravador != null) {
				gravador.close();
			}
		}

	}

	public List<Aluno> recuperaAlunos(String nomeArquivo) throws IOException{
		BufferedReader br = null;
		List<Aluno> var = new ArrayList<Aluno>();
		try {
			br = new BufferedReader(new FileReader(nomeArquivo));
			String linha = null;
			do {
				linha = br.readLine();
				if(linha != null) {
				
					String[] p = linha.split("#");
					Aluno al = new Aluno();
					al.setNome(p[0]);
					al.setDataDeNascimento(p[1]);
					al.setDataDocadastro(p[2]);
					al.setSexo(p[3]);
					al.setEmail(p[4]);
					al.setTelefone(p[5]);
					al.definirStatus(p[6]);
					al.setMatricula(Integer.parseInt(p[7]));
					al.setCpf(p[8]);
					Endereco e = new Endereco();					
					e.setCidade(p[9]);
					e.setBairro(p[10]);
					e.setRua(p[11]);
					e.setNumero(p[12]);
					e.setCep(Integer.parseInt(p[13]));
					e.setNumero(p[14]);
					al.setEndereco(e);
					int temp = Integer.parseInt(p[15]);
					int curso = 16;
					for(int i = 0; i < temp; i++) {
						ExameCorporal ec = new ExameCorporal();
						ec.setPeso(Double.parseDouble(p[curso++]));
						ec.setAltura(Double.parseDouble(p[curso++]));
						ec.setPanturrilhaDireita(Double.parseDouble(p[curso++]));
						ec.setPanturrilhaEsquerda(Double.parseDouble(p[curso++]));
						ec.setData(p[curso++]);
						ec.setTorax(Double.parseDouble(p[curso++]));
						ec.setCintura(Double.parseDouble(p[curso++]));
						ec.setQuadril(Double.parseDouble(p[curso++]));
						ec.setBracoEsquerdo(Double.parseDouble(p[curso++]));
						ec.setBracoDireito(Double.parseDouble(p[curso++]));
						ec.setAntebracoEsquerdo(Double.parseDouble(p[curso++]));
						ec.setAntebracoDireito(Double.parseDouble(p[curso++]));
						ec.setPescoco(Double.parseDouble(p[curso++]));
						ec.setCoxaDireita(Double.parseDouble(p[curso++]));
						ec.setCoxaEsquerda(Double.parseDouble(p[curso++]));
						ec.setImc(Double.parseDouble(p[curso++]));
						ec.setGluteo(Double.parseDouble(p[curso++]));
						al.adicionarExame(ec);
						
					}
					
				}
			}while(linha != null); 
		} finally{
			if(br!=null){
				br.close(); 
			}
		}
		return var;
	}

	public void persisteInstrutores(List<Instrutor> instrutores,String nomeArquivo) throws IOException {
		BufferedWriter gravador = null;
		try {
			gravador = new BufferedWriter(new FileWriter(nomeArquivo));
			for (Instrutor i : instrutores) {
				gravador.write(i.toStringModeloArquivo() + "\n");
			}
		} finally {
			if (gravador != null) {
				gravador.close();
			}
		}

	}

	public List<Instrutor> recuperaInstrutores(String nomeArquivo, List<Aluno> alunos) throws IOException {
		BufferedReader br = null;
		List<Instrutor> var = new ArrayList<Instrutor>();
		try {
			br = new BufferedReader(new FileReader(nomeArquivo));
			String linha = null;
			do {
				linha = br.readLine();
				if(linha != null) {
				
					String[] p = linha.split("#");
					Instrutor i = new Instrutor();
					i.setNome(p[0]);
					i.setDataDeNascimento(p[1]);
					i.setDataDocadastro(p[2]);
					i.setSexo(p[3]);
					i.setEmail(p[4]);
					i.setTelefone(p[5]);
					i.setCpf(p[6]);
					
					Endereco e = new Endereco();					
					e.setCidade(p[7]);
					e.setBairro(p[8]);
					e.setRua(p[9]);
					e.setNumero(p[10]);
					e.setCep(Integer.parseInt(p[11]));
					e.setNumero(p[12]);
					i.setEndereco(e);
					int temp = Integer.parseInt(p[13]);
					int curso = 14;
					for(int k = 0; k < temp; k++) {
						for(Aluno a: alunos) {
							if(a.getEmail().equals(p[curso++])) {
								i.addAluno(a);
							}
						}
					}	
				}
			}while(linha != null); 
		}finally{
			if(br!=null){
				br.close(); 
			}
		}
		return var;
	}
}
