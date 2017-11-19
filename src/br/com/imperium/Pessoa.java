package br.com.imperium;

import java.util.Calendar;

public class Pessoa {
	protected String nome;
	private Calendar dataDeNascimento;
	private Calendar dataDocadastro;
	private String sexo;
	private Endereco endereco;
	private String email;
	private String telefone;
	
	

	public Pessoa(String nome, Calendar dataDeNascimento, Calendar dataDocadastro, String sexo, Endereco endereco,
			String email, String telefone) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.dataDocadastro = dataDocadastro;
		this.sexo = sexo;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	public Pessoa() {
		this.nome = "";
		this.dataDeNascimento = Calendar.getInstance();
		this.dataDocadastro = Calendar.getInstance();
		this.sexo = "";
		this.endereco = new Endereco();
		this.email = "";
		this.telefone = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Calendar getDataDocadastro() {
		return dataDocadastro;
	}

	public void setDataDocadastro(Calendar dataDocadastro) {
		this.dataDocadastro = dataDocadastro;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
