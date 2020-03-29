package br.com.designpattern.observer;

public class ContadorPalavrasUpper implements ContadorPalavra {

	private int qtd;
	
	@Override
	public void contar(String palavra) {
		// TODO Auto-generated method stub
		if(Character.isUpperCase(palavra.charAt(0)))
			qtd++;
	}

	@Override
	public int getQuantidade() {
		// TODO Auto-generated method stub
		return qtd;
	}

}
