package ecommerce.model;

public class Bicicleta {

	private int numero;
	private String marca;
	private String tipo;
	private String cor;
	private double preco;

	public Bicicleta(int numero, String marca, String tipo, String cor, double preco) {

		this.numero = numero;
		this.marca = marca;
		this.tipo = tipo;
		this.cor = cor;
		this.preco = preco;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void visualizar() {

		System.out.println("\n**************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("****************************************************");
		System.out.println("Numero: " + this.numero);		
		System.out.println("Marca: " + this.marca);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Preco: " + this.preco);
		
		
	}

}
