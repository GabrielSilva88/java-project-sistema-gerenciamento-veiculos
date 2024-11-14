package model;

/* Cada vendedor deve conter, no mínimo, atributos como nome, CPF e telefone. */

/* Cada cliente deve conter, pelo menos, atributos como nome, CPF e telefone. */

public abstract class Pessoa {

	// ATRIBUTOS
	private String nome;
	private String cpf;

	// CONSTRUTOR SEM PARAMETROS
	public Pessoa() {

	}

	// CONSTRUTOR COM PARAMETROS
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	// GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
