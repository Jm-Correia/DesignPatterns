package br.com.designpattern.observer;

import java.util.HashMap;
import java.util.Map;

public class QuebradorPalavra {

	private Map<String, ContadorPalavra> contadores = new HashMap<>();

	public String[] quebrar(String frase) {
		String[] palavras = frase.split(" ");
		
		for(String palavra: palavras)
			for(ContadorPalavra c: contadores.values())
				c.contar(palavra);
		
		return palavras;
	}
	
	public void adicionarObservador(String chave, ContadorPalavra contador) {
		contadores.put(chave, contador);
	}
	
	public int getContagem(String chave) {
		return contadores.get(chave).getQuantidade();
	}

}
