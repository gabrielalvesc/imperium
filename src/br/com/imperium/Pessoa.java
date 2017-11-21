package br.com.imperium;


public class Pessoa {
	private String nome;
	private String dataDeNascimento;
	private String dataDocadastro;
	private String sexo;
	private String email;
	private String telefone;
	private String cpf;
	private Endereco endereco;
	
	

	public Pessoa(String nome, String dataDeNascimento, String dataDocadastro, String sexo,String cpf, Endereco endereco,
			String email, String telefone) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.dataDocadastro = dataDocadastro;
		this.sexo = sexo;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.setCpf(cpf);
	}
	public Pessoa() {
		this.nome = "";
		this.dataDeNascimento = "";
		this.dataDocadastro = "";
		this.dataDocadastro = "";
		this.sexo = "";
		this.endereco = new Endereco();
		this.email = "";
		this.telefone = "";
		this.setCpf("");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getDataDocadastro() {
		return dataDocadastro;
	}

	public void setDataDocadastro(String dataDocadastro) {
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
