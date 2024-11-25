package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

	List<Cliente> clientes = new ArrayList<Cliente>();
	
	// CONSTRUTOR SEM PARAMETRO
	public Cliente() {
		
	}

	// CONSTRUTOR COM PARAMETROS
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
	}
	
}
