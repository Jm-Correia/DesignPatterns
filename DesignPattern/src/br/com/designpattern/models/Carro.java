package br.com.designpattern.models;

import br.com.designpattern.enumeration.TipoCarro;

public class Carro {

	private String placa;
	private char cor;
	private String marca;
	private TipoCarro tipo;
	
	public Carro(String placa, char cor, String marca, TipoCarro tipo) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.marca = marca;
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public char getCor() {
		return cor;
	}

	public void setCor(char cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoCarro getTipo() {
		return tipo;
	}

	public void setTipo(TipoCarro tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
