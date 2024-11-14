package model;
/*A loja deve conter pelo menos os atributos como nome, endereço 
e telefone, além de uma lista de veículos disponíveis e uma lista de vendedores associados.*/
public class Loja {
	
	
	//ATRIBUTOS
	public String nome;
	public String endereco;
	public String telefone;
	
	// CONSTRUTOR 
	public Loja(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	// GET E SET 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
