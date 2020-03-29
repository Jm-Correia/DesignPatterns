package br.com.designpattern.observer;

public class ContadorPalavrasSimples implements ContadorPalavra {

	private int qtd;
	
	@Override
	public void contar(String palavra) {
		qtd++;

	}

	@Override
	public int getQuantidade() {
		// TODO Auto-generated method stub
		return qtd;
	}

}
