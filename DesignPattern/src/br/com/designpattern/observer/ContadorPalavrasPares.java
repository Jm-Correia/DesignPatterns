package br.com.designpattern.observer;

public class ContadorPalavrasPares implements ContadorPalavra {

	private int qtd;
	
	@Override
	public void contar(String palavra) {
		if(palavra.length()%2==0) {
			qtd++;
		}
	}

	@Override
	public int getQuantidade() {
		// TODO Auto-generated method stub
		return qtd;
	}

}
