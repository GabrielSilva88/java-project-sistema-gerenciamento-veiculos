package model;

/* Cada venda deve conter, no mínimo, atributos como veículo vendido, vendedor responsável, cliente comprador, data da venda. */

public class Venda {
	
	// ATRIBUTO
	public String veiculoVendido;
	public String vendedorResponsavel;
	public String clienteComprador;
	public int dataVenda;
	
	// CONSTRUTOR
	public Venda(String veiculoVendido, String vendedorResponsavel, String clienteComprador, int dataVenda) {
		super();
		this.veiculoVendido = veiculoVendido;
		this.vendedorResponsavel = vendedorResponsavel;
		this.clienteComprador = clienteComprador;
		this.dataVenda = dataVenda;
	}
	
	// GET(){} e SET(){}
	public String getVeiculoVendido() {
		return veiculoVendido;
	}
	public void setVeiculoVendido(String veiculoVendido) {
		this.veiculoVendido = veiculoVendido;
	}
	public String getVendedorResponsavel() {
		return vendedorResponsavel;
	}
	public void setVendedorResponsavel(String vendedorResponsavel) {
		this.vendedorResponsavel = vendedorResponsavel;
	}
	public String getClienteComprador() {
		return clienteComprador;
	}
	public void setClienteComprador(String clienteComprador) {
		this.clienteComprador = clienteComprador;
	}
	
	public int getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(int dataVenda) {
		this.dataVenda = dataVenda;
	}
}
