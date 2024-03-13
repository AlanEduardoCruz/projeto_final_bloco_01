package ecommerce.model;

public  abstract class Bicicleta {

	private String marca;
	private String modelo;
	private String tipo;
	private String tamanhoQuadro;
	private String cor;
	private double preco;

	public  Bicicleta(String marca, String modelo, String tipo, String tamanhoQuadro, String cor, double preco) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.tamanhoQuadro = tamanhoQuadro;
		this.cor = cor;
		this.preco = preco;
		
	}

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanhoQuadro() {
		return tamanhoQuadro;
	}

	public void setTamanhoQuadro(String tamanhoQuadro) {
		this.tamanhoQuadro = tamanhoQuadro;
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
	

	

	

}
