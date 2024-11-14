package model;

/* Cada veículo deve conter pelo menos os atributos marca, modelo, ano, placa e preço. */

public class Veiculo {

	// ATRIBUTOS
	public String marca;
	public String modelo;
	public int ano;
	public String placa;
	public double preco;

	// CONSTRUTOR	
	public Veiculo(String marca, String modelo, int ano, String placa, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.preco = preco;
	}

	// GETS(){} E SETS(){}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
