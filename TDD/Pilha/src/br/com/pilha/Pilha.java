package br.com.pilha;

import br.com.pilha.exception.PIlhaTamanhoMaximoAtingido;
import br.com.pilha.exception.PilhaVaziaException;

public class Pilha {

	private Object[] elementos;
	private int quantidade = 0;
	
	public Pilha(int i) {
		elementos = new Object[i];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (quantidade == 0);
	}

	public int getTamanho() {
		// TODO Auto-generated method stub
		return quantidade;
	}

	public void empilha(String elemento) {
		if((elementos.length) == quantidade)
			throw new PIlhaTamanhoMaximoAtingido("Tamanho Maximo atingido");
		this.elementos[quantidade] = elemento;
		this.quantidade++;
	}

	public Object topo() {
		// TODO Auto-generated method stub
		return elementos[quantidade-1];
	}

	public Object desempilha() {
		if(isEmpty())
			throw new PilhaVaziaException("Não é possivel desempilhar");
		Object topo = topo();
		quantidade--;
		return topo;
	}

}
